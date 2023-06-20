/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package list;

import java.util.HashSet;
import java.util.Iterator;
import list.exceptions.ElementAlreadyExistException;
import list.exceptions.NameTaskNotFoundException;
import list.exceptions.TaskUntilNotCompletedException;
import list.task.SimpleTask;
import list.task.Status;
import list.task.exceptions.EmptyNameTaskException;

/**
 * <h1>Clase SimpleList</h1>
 * 
 * Guarda tareas de tipo Simple dentro un HashSet
 * Se extiende de la clase List e implementa la interaz IListActions
 * 
 * @author Vanina Pintos 
 */
public class SimpleList extends List implements IListActions<SimpleTask>{
    private HashSet <SimpleTask> simpleList;   

    /**
     * <h1>Constructor de la clase SimpleList</h1>
     * 
     * Unico constructor de la clase SimpleList
     * Crea un HashSet para almacenar las tareas vacio
     * 
     * @author Vanina Pintos
     */
    public SimpleList(String category) {
        super(category);
        simpleList = new HashSet<>();
    }  

    /**
     * <h1>Agregar una tarea</h1>
     * 
     * addElement(SimpleTask e) recibe una tarea y la agrega al HashSet
     * 
     * @param e | tarea a agregar
     * 
     * @return boolean | true si lo agrego correctamente a el HashSet
     * 
     * @throws ElementAlreadyExistException | si la tarea ya existe en el HashSet
     * 
     * @author Vanina Pintos
     */
    @Override
    public boolean addElement(SimpleTask e) throws ElementAlreadyExistException{
        
        boolean added = false; 
        
        if(simpleList.contains(e)){
            throw new ElementAlreadyExistException("tarea ya existente.");
        }else{
            added = true;
            simpleList.add(e);
        }
        
        return added;
    }

    /**
     * <h1>Mostrar tareas</h1>
     * 
     * String showElements() devuelve las tareas almacenadas en el HashSet en formato String
     * 
     * @return String | tareas almacenadas en el HashSet en formato String
     * 
     * @author Vanina Pintos
     */
    @Override
    public String showElements() {
        String aux ="";
        for(SimpleTask e : simpleList){
            aux += e.toString();
            aux +="";
        }
        return aux;
    }

    /**
     * <h1>Marcar como completada una tarea</h1>
     * 
     * checkElement(String name) recibe el nombre de una tarea de cambia 
     * su estado de TODO a COMPLETED. Primero verifica que el nombre que se haya
     * enciado no sea un String vacio y luego verifica la existencia de la tarea
     * 
     * @param name | nombre de la tarea a marcar como completada
     * 
     * @return boolean | si la tarea pudo marcarse como completada con exito
     * 
     * @throws EmptyNameTaskException | si el nombre enviado es un String vacio
     * @throws NameTaskNotFoundException | si la tarea no esta dentro del HashSet
     * 
     * @author Vanina Pintos
     */
    @Override
    public boolean checkElement(String name) throws EmptyNameTaskException, NameTaskNotFoundException{ 
        
        boolean checked = false;
        
        SimpleTask st = new SimpleTask(name);
        
        if(st.validThisName()){
            SimpleTask found = searchElement(name);
            
            if(found != null){
                found.setStatus(Status.COMPLETED);
                checked = true;
            }else{
                throw new NameTaskNotFoundException("esa tarea no existe");
            }
        }
        

        return checked;        
    }

    /**
     * <h1>Eliminar una tarea</h1>
     * 
     * deleteElement(String name) recibe el nombre de la tarea a eliminar
     * verifica que el nombre no sea un string vacio, verifica su existencia
     * dentro del HashSet y su estado. Solo se puede eliminar la tarea si su 
     * estado es COMPLETED.
     * 
     * @param name | nombre de la tarea a eliminar
     * 
     * @return boolean | si la tarea pudo eliminarse con exito
     * 
     * @throws EmptyNameTaskException | si el nombre enviado es un String vacio
     * @throws NameTaskNotFoundException | si la tarea no esta dentro del HashSet
     * 
     * @author Vanina Pintos
     */
    @Override
    public boolean deleteElement(String name) throws EmptyNameTaskException, NameTaskNotFoundException, TaskUntilNotCompletedException{
        boolean deleted = false;
        
        SimpleTask st = new SimpleTask(name);
        
        if(st.validThisName()){
            
            SimpleTask found = searchElement(name);

            if(found != null){

                if(found.getStatus()==Status.COMPLETED){
                    
                    simpleList.remove(found);
                    deleted = true;
                }else{
                    throw new TaskUntilNotCompletedException("esa tarea no existe");
                }
            }else{
                throw new NameTaskNotFoundException("esa tarea no existe");
            }
        }
        
        return deleted; 
    }

    /**
     * <h1>Editar nombre de una tarea</h1>
     * 
     * editNameElement(String name,String newName) recibe el nombre de la tarea
     * a modificar y el nombre nuevo que se le quiere asignar. 
     * 
     * @param name | nombre de la tarea a eliminar
     * @param newName | nombre nuevo a asignar
     * 
     * @return boolean | si la tarea se pudo modificar con exito
     * 
     * @throws EmptyNameTaskException | si el nombre enviado es un String vacio
     * @throws NameTaskNotFoundException | si la tarea no esta dentro del HashSet
     * 
     * @author Vanina Pintos
     */

    @Override
    public boolean editNameElement(String name,String newName) throws EmptyNameTaskException, NameTaskNotFoundException{ 
        boolean edited = false;
        
        SimpleTask found = searchElement(name);
        
        if(found != null){
            found.setName(name); 
            edited = true;
        }else{
            throw new NameTaskNotFoundException("esa tarea no existe");
        }
        
        return edited;
    }

    @Override
    public SimpleTask searchElement(String name) {
        
        SimpleTask found = null; 
        
        Iterator iterator = simpleList.iterator();
        while (iterator.hasNext()) {
            SimpleTask st = (SimpleTask) iterator.next();
            if (st.getName().equals(name)) {
                found = st;
            }
        }
        
        return found;
    }

    public boolean elementsWereChecked() {
        
        for(SimpleTask st : simpleList){
            if(st.getStatus() == Status.TODO){
                return false;
            }
        }
        
        return  true;
    }
}
