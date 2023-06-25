/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package list;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.stream.Collectors;
import list.exceptions.ElementAlreadyExistException;
import list.exceptions.TaskUntilNotCompletedException;
import list.task.DateTask;
import list.task.exceptions.EmptyNameTaskException;

/**
 * Clase DateList
 * 
 * Guarda tareas de tipo Date dentro un HashSet
 * Se extiende de la clase List e implementa la interaz IListActions
 * 
 * @author Vanina Pintos 
 */
public class DateList extends List implements IListActions<DateTask>, Serializable{
    private HashSet <DateTask> dateList;

    /**
     * Constructor de la clase DateList
     * 
     * Unico constructor de la clase DateList
     * Recibe una categoria por parametro que debe ser validada y verificar
     * que no este repetida antes de ser enviada
     * Crea un HashSet para almacenar las tareas vacio
     * 
     * @param category | categoria validar y verificar antes de ser enviada
     * 
     * @see List#validCategory(String) 
     * 
     * @author Vanina Pintos
     */
    public DateList(String category) {
        super(category);
        dateList = new HashSet<>();
    }

    /**
     * Agregar una tarea
     * 
     * addTask(DateTask task) recibe una tarea y la agrega al HashSet
     * 
     * @param task | tarea a agregar
     * 
     * @return boolean | true agregada correctamente | false no se pudoa agregar
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
     * Mostrar tareas
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
            aux +="/";
        }
        return aux;
    }
    
    /**
     * Mostrar tareas chequeadas
     * 
     * String showTasks() devuelve las tareas almacenadas en el HashSet en formato String
     * 
     * @return String | tareas almacenadas en el HashSet en formato String
     * 
     * @author Sofia Brocardo
     */
    public String showCheckTasks() {
        String aux ="";
        
        for(DateTask e : dateList){
            if(e.getCheck())
            {
                aux += e.toString();
                aux +="/";
            }
        }
        return aux;
    }
    
    /**
     * Mostrar tareas NOchequeadas
     * 
     * String showTasks() devuelve las tareas almacenadas en el HashSet en formato String
     * 
     * @return String | tareas almacenadas en el HashSet en formato String
     * 
     * @author Vanina Pintos
     */
    public String showUncheckTasks() {
        String aux ="";
        for(DateTask e : dateList){
            if(!e.getCheck())
            {
                aux += e.toString();
                aux +="/";
            }
        }
        return aux;
    }

    /**
     * Marcar como completada una tarea
     * 
     * checkTask(String name) recibe el nombre de una tarea y cambia 
     * su estado de TODO a COMPLETED. 
     * 
     * @param name | nombre de la tarea a marcar como completada
     * 
     * @return boolean | true tarea marcada como ompletada | false la tarea no se
     * pudo marcar como completada
     * 
     * @author Vanina Pintos
     */
    public boolean checkTask(String name) {
        boolean checked = false;
        
        DateTask found = searchTask(name);
        
        if(found != null){
            found.checkTask();
            checked = true;
        }
        
        return checked;
    }
    
    /**
     * Eliminar una tarea
     * 
     *  deleteTask(String name) recibe el nombre de la tarea a eliminar. 
     *  Para que una tarea pueda ser eliminada su estado tiene que ser COMPLETED
     * 
     * @param name | nombre de la tarea a eliminar
     * 
     * @return boolean | true eliminada con exito | false no se pudo eliminar
     * 
     * @throws TaskUntilNotCompletedException | si el estado de la tarea no es COMPLETED
     * 
     * @author Vanina Pintos
     */
    public boolean deleteTask(String name) throws  TaskUntilNotCompletedException{
        boolean deleted = false;
        
        DateTask found = searchTask(name);
        
        if(found != null){
            
            if(found.getCheck() == true){
                dateList.remove(found);
                deleted = true;
            }else{
                throw new TaskUntilNotCompletedException("tarea sin terminar");
            }  
        }
        
        return deleted;    
    }
    
    /**
     * Editar nombre de una tarea
     * 
     * editTaskName(String name,String newName) recibe el nombre de la tarea
     * a modificar y el nuevo nombre que se le quiere asignar validando este ultimo
     * y si lo es entonces realiza la modificacion
     * 
     * @param name | nombre de la tarea a eliminar
     * @param newName | nuevo nombre a asignar
     * 
     * @return boolean | true tarea modificada con exito | false la tarea no se pudo modificar
     * 
     * @throws EmptyNameTaskException | si el nombre enviado es un String vacio
     * @throws ElementAlreadyExistException | si el nombre ya existe
     * 
     * @author Vanina Pintos
     */
    public boolean editTaskName(String name, String newName) throws EmptyNameTaskException, ElementAlreadyExistException{
        boolean edited = false;
        
        DateTask found = searchTask(name);
        
        if(found != null){
            
            DateTask existsName = searchTask(newName);
            
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
     * Buscar una tarea
     * 
     * searchTask(String name) recibe el nombre de la tarea
     * a buscar y si se encuentra dentro del HashSet lo retorna
     * 
     * @param name | nombre de la tarea a buscar
     * 
     * @return SimpleTask | tare encontrada | null tarea no encontrada
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
     * Verificar si las tareas fueron completadas
     * 
     *  tasksWereChecked() verifica si todas las tareas existentes 
     *  dentro de la lista fueron completadas
     * 
     * @return boolean | true si todas las tareas fueron completadas
     * 
     * @author Vanina Pintos
     */
    public boolean tasksWereChecked() {
        boolean checked = true;        
        for(DateTask st : dateList){
            if(!st.getCheck()){
                checked = false;
            }
        }
        
        return checked;
    }
    
    /**
     * Cantidad de tareas
     * 
     * @return int | cantidad de tareas almacenadas en la coleccion
     * 
     * @author Vanina Pintos
     */
    @Override
    public int howManyTasks() {
        return dateList.size();
    }
}
