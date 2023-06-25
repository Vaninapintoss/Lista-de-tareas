/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package list;

import list.exceptions.ElementAlreadyExistException;

/**
 * Interfaz IListActions
 * 
 * Interfaz de acciones de listas 
 * 
 * @param <Task> | usable con clases derivadas de la clase Task
 *
 * @author Vanina Pintos
 */
public interface IListActions <Task>{
    
    /**
     * Agregar una tarea
     * 
     * addTask(Task e) recibe una tarea y la agrega a la lista
     * 
     * @param task | tarea a agregar
     * 
     * @return boolean | true se agrego con exito | false no puedo agregarse
     * 
     * @throws ElementAlreadyExistException | si el elemento ya existe en la lista
     * 
     * @author Vanina Pintos
     */
    boolean addTask(Task task) throws ElementAlreadyExistException;
    
    /**
     * Mostrar tareas
     * 
     *  showTasks() muestra las tareas existentes dentro de la lista
     * 
     * @return String | contenido de la lista en formato String
     * 
     * @author Vanina Pintos
     */
    String showTasks();
    
    /**
     * Buscar tarea
     * 
     * searchTask(String name) recibe el nombre de una tarea
     * y la busca dentro de la lista
     * 
     * @param name | nombre de la tarea a buscar 
     * 
     * @return Task | tarea encontrada | null tarea no encontrada
     * 
     * @author Vanina Pintos
     */
    Task searchTask(String name);
    
    /**
     * Cantidad de tareas
     * 
     * @return int | cantidad de tareas almacenadas en la coleccion
     * 
     * @author Vanina Pintos
     */
    public int howManyTasks();
}
