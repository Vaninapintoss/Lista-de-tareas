/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package list;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import list.exceptions.ElementAlreadyExistException;
import list.exceptions.TaskUntilNotCompletedException;
import list.task.SimpleTask;
import list.task.Status;
import list.task.exceptions.EmptyNameTaskException;

/**
 * <h1>Clase SimpleList</h1>
 * 
 * Guarda tareas de tipo Simple dentro un HashSet
 * Se extiende de la clase List e implementa la interfaz IListActions
 * 
 * @author Vanina Pintos 
 */
public class SimpleList extends List implements IListActions<SimpleTask>, Serializable{
    private HashSet <SimpleTask> simpleList;   

    /**
     * <h1>Constructor de la clase SimpleList</h1>
     * 
     * Unico constructor de la clase SimpleList
     * Recibe una categoria por parametro que debe ser validada antes de 
     * ser enviada y verificar que no este repetida
     * Crea un HashSet para almacenar las tareas vacio
     * 
     * @param category | categoria validar antes de enviar
     * 
     * @see List#validCategory(String) 
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
     * addTask(SimpleTask task) recibe una tarea, valida que no exista dentro 
     * del HashSet y la agrega
     * 
     * @param task | tarea a agregar
     * 
     * @return boolean | true agregada correctamente | false no se pudo agregar
     * 
     * @throws ElementAlreadyExistException | si la tarea ya existe en el HashSet
     * 
     * @author Vanina Pintos
     */
    @Override
    public boolean addTask(SimpleTask task) throws ElementAlreadyExistException{
        
        boolean added = false; 
        
        if(simpleList.contains(task)){
            throw new ElementAlreadyExistException("tarea ya existente.");
        }else{
            added = true;
            simpleList.add(task);
        }
        
        return added;
    }

    /**
     * <h1>Mostrar tareas</h1>
     * 
     * String showTasks() devuelve las tareas almacenadas en el HashSet en formato String
     * 
     * @return String | tareas almacenadas en formato String
     * 
     * @author Vanina Pintos
     */
    @Override
    public String showTasks() {
        String aux ="";
        for(SimpleTask e : simpleList){
            aux += e.toString();
            aux +="_";
        }
        return aux;
    }

    /**
     * <h1>Marcar como completada una tarea</h1>
     * 
     * checkTask(String name) recibe el nombre de una tarea y cambia 
     * su estado de TODO a COMPLETED. 
     * 
     * @param name | nombre de la tarea 
     * 
     * @return boolean | true la tarea pudo marcarse como completada | false la tarea
     * no pudo marcarse como completada
     * 
     * @author Vanina Pintos
     */
    public boolean checkTask(String name){ 
        
        boolean checked = false;
        
        SimpleTask found = searchTask(name);

        if(found != null){
            found.setStatus(Status.COMPLETED);
            checked = true;
            
        }

        return checked;        
    }

    /**
     * <h1>Eliminar una tarea</h1>
     * 
     * deleteElement(String name) recibe el nombre de la tarea a eliminar. 
     * Para que una tarea pueda ser eliminada su estado tiene que ser COMPLETED
     * 
     * @param name | nombre de la tarea 
     * 
     * @return boolean | true tarea eliminada | false la tarea no pudo ser eliminada
     * 
     * @throws TaskUntilNotCompletedException | si el estado de la tarea no es COMPLETED
     * 
     * @author Vanina Pintos
     */
    public boolean deleteTask(String name) throws  TaskUntilNotCompletedException{
        boolean deleted = false;
          
        SimpleTask found = searchTask(name);

        if(found != null){

            if(simpleList.remove(found))
            {    
                deleted = true;
            }else{
                throw new TaskUntilNotCompletedException("tarea sin terminar");
            }
        }
        
        return deleted; 
    }

    /**
     * <h1>Editar nombre de una tarea</h1>
     * 
     * editNameElement(String name,String newName) recibe el nombre de la tarea
     * a modificar y el nuevo nombre que se le quiere asignar, valida este ultimo y si
     * lo es entonces lo modifica
     * 
     * @param name | nombre de la tarea
     * @param newName | nuevo nombre a asignar
     * 
     * @return boolean | true modificacion exitosa | false error en la modificacion
     * 
     * @throws EmptyNameTaskException | si el nombre enviado es un String vacio
     * @throws ElementAlreadyExistException | si ya existe una tarea con ese nombre
     * 
     * @author Vanina Pintos
     */
    public boolean editTaskName(String name,String newName) throws EmptyNameTaskException, ElementAlreadyExistException{ 
        boolean edited = false;
        
        SimpleTask found = searchTask(name);
        
        if(found != null){
            
            SimpleTask existsName = searchTask(newName);
            
            if(existsName != null){
                
                throw new ElementAlreadyExistException("esa tarea ya existe");
                
            }else{
                found.setName(newName); 
                edited = true;
            }
        }
        
        return edited;
    }

    /**
     * <h1>Buscar una tarea</h1>
     * 
     * searchTask(String name) recibe el nombre de la tarea
     * a buscar y si se encuentra dentro del HashSet lo retorna
     * 
     * @param name | nombre de la tarea 
     * 
     * @return SimpleTask | tarea encontrada | null si no se encontro
     * 
     * @author Vanina Pintos
     */
    @Override
    public SimpleTask searchTask(String name)
    {        
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

    /**
     * <h1>Verificar si las tareas fueron completadas</h1>
     * 
     *  tasksWereChecked() verifica si todas las tareas existentes 
     *  dentro del HashSet fueron completadas
     * 
     * @return boolean | true todas las tareas completadas | false faltan tareas
     * por completar
     * 
     * @author Vanina Pintos
     */
    public boolean tasksWereChecked() {
        
        for(SimpleTask st : simpleList){
            if(st.getStatus() == Status.TODO){
                return false;
            }
        }
        
        return  true;
    }

    /**
     * <h1>Cantidad de tareas</h1>
     * 
     * @return int | cantidad de tareas almacenadas en la coleccion
     * 
     * @author Vanina Pintos
     */
    @Override
    public int howManyTasks() {
        return simpleList.size();
    }
}
