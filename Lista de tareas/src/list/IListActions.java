/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package list;

import list.exceptions.ElementAlreadyExistException;

/**
 * <h1>Interfaz IListActions</h1>
 * Interfaz de acciones de listas 
 * 
 * @param <Task> | 
 *
 * @author Vanina Pintos
 */
public interface IListActions <Task>{
    
    /**
     * <h1>Agregar una tarea</h1>
     * 
     * addTask(Task e) recibe una tarea y la agrega a la lista
     * 
     * @param task | tarea a agregar
     * 
     * @return boolean | true si se agrego con exito
     * 
     * @throws ElementAlreadyExistException | si el elemento ya existe en la lista
     * 
     * @author Vanina Pintos
     */
    boolean addTask(Task task) throws ElementAlreadyExistException;
    
    /**
     * <h1>Mostrar tareas</h1>
     * 
     *  showTasks() muestra las tareas existentes dentro de la lista
     * 
     * @return String | contenido de la lista en formato String
     * 
     * @author Vanina Pintos
     */
    String showTasks();
    
    /**
     * <h1>Buscar tarea</h1>
     * 
     * searchTask(String name) recibe el nombre de una tarea
     * y la busca dentro de la lista
     * 
     * @param name | nombre de la tarea a buscar 
     * 
     * @return Task | tarea encontrada dentro de la lista | null si no la encontro
     * 
     * @author Vanina Pintos
     */
    Task searchTask(String name);
}
