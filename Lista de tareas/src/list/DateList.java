/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package list;

import java.util.HashSet;
import java.util.Iterator;
import list.exceptions.ElementAlreadyExistException;
import list.exceptions.TaskUntilNotCompletedException;
import list.task.DateTask;
import list.task.Status;
import list.task.exceptions.EmptyNameTaskException;

/**
 * <h1>Clase DateList</h1>
 * 
 * Guarda tareas de tipo Date dentro un HashSet
 * Se extiende de la clase List e implementa la interaz IListActions
 * 
 * @author Vanina Pintos 
 */
public class DateList extends List implements IListActions<DateTask>{
    private HashSet <DateTask> dateList;

    /**
     * <h1>Constructor de la clase DateList</h1>
     * 
     * Unico constructor de la clase DateList
     * Recibe una categoria por parametro
     * Crea un HashSet para almacenar las tareas vacio
     * 
     * @param category | verificar que no este repetida antes de enviar
     * 
     * @author Vanina Pintos
     */
    public DateList(String category) {
        super(category);
        dateList = new HashSet<>();
    }

    /**
     * <h1>Agregar una tarea</h1>
     * 
     * addTask(DateTask task) recibe una tarea y la agrega al HashSet
     * 
     * @param task | tarea a agregar
     * 
     * @return boolean | true si lo agrego correctamente a el HashSet
     * 
     * @throws ElementAlreadyExistException | si la tarea ya existe en el HashSet
     * 
     * @author Vanina Pintos
     */
    @Override
    public boolean addTask(DateTask task) throws ElementAlreadyExistException {
        boolean added = false; 
        
        if(dateList.contains(task)){
            throw new ElementAlreadyExistException("tarea ya existente.");
        }else{
            added = true;
            dateList.add(task);
        }
        
        return added;
    }

    /**
     * <h1>Mostrar tareas</h1>
     * 
     * String showTasks() devuelve las tareas almacenadas en el HashSet en formato String
     * 
     * @return String | tareas almacenadas en el HashSet en formato String
     * 
     * @author Vanina Pintos
     */
    @Override
    public String showTasks() {
        String aux ="";
        for(DateTask e : dateList){
            aux += e.toString();
            aux +="";
        }
        return aux;
    }

    /**
     * <h1>Marcar como completada una tarea</h1>
     * 
     * checkTask(String name) recibe el nombre de una tarea y cambia 
     * su estado de TODO a COMPLETED. 
     * 
     * @param name | nombre de la tarea a marcar como completada
     * 
     * @return boolean | true si la tarea pudo marcarse como completada con exito
     * 
     * @author Vanina Pintos
     */
    public boolean checkTask(String name) {
        boolean checked = false;
        
        DateTask found = searchTask(name);
        
        if(found != null){
            found.setStatus(Status.COMPLETED);
            checked = true;
        }
        
        return checked;
    }
    
    /**
     * <h1>Eliminar una tarea</h1>
 
 deleteTask(String name) recibe el nombre de la tarea a eliminar. 
 Para que una tarea pueda ser eliminada su estado tiene que ser COMPLETED
     * 
     * @param name | nombre de la tarea a eliminar
     * 
     * @return boolean | true si la tarea pudo eliminarse con exito
     * 
     * @throws TaskUntilNotCompletedException | si el estado de la tarea no es COMPLETED
     * 
     * @author Vanina Pintos
     */
    public boolean deleteTask(String name) throws  TaskUntilNotCompletedException{
        boolean deleted = false;
        
        DateTask found = searchTask(name);
        
        if(found != null){
            
            if(found.getStatus() == Status.COMPLETED){
                dateList.remove(found);
                deleted = true;
            }else{
                throw new TaskUntilNotCompletedException("tarea sin terminar");
            }  
        }
        
        return deleted;    
    }
    
    /**
     * <h1>Editar nombre de una tarea</h1>
 
 editTaskName(String name,String newName) recibe el nombre de la tarea
 a modificar y el nuevo nombre que se le quiere asignar
     * 
     * @param name | nombre de la tarea a eliminar
     * @param newName | nuevo nombre a asignar
     * 
     * @return boolean | true si la tarea se pudo modificar con exito
     * 
     * @throws EmptyNameTaskException | si el nombre enviado es un String vacio
     * 
     * @author Vanina Pintos
     */
    public boolean editTaskName(String name, String newName) throws EmptyNameTaskException{
        boolean edited = false;
        
        DateTask found = searchTask(name);
        
        if(found != null){
            found.setName(name); 
            edited = true;
        }
        
        return edited;   
    }

    /**
     * <h1>Buscar una tarea</h1>
     * 
     * searchTask(String name) recibe el nombre de la tarea
     * a buscar y si se encuentra dentro del HashSet lo retorna
     * 
     * @param name | nombre de la tarea a buscar
     * 
     * @return SimpleTask | la tarea encontrada dentro del HashSet | null
     * si no eixste dentro del HashSet
     * 
     * @author Vanina Pintos
     */
    @Override
    public DateTask searchTask(String name) {
        DateTask found = null; 
        
        Iterator iterator = dateList.iterator();
        while (iterator.hasNext()) {
            DateTask st = (DateTask) iterator.next();
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
     *  dentro de la lista fueron completadas
     * 
     * @return boolean | true si todas las tareas fueron completadas
     * 
     * @author Vanina Pintos
     */
    public boolean tasksWereChecked() {
        for(DateTask st : dateList){
            if(st.getStatus() == Status.TODO){
                return false;
            }
        }
        
        return  true;
    }
}
