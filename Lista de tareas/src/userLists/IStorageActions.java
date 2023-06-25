/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userLists;

import list.exceptions.EmptyCategoryListException;
import userLists.exceptions.CategoryListAlreadyExistException;
import userLists.exceptions.UnfinishedTasksException;

/**
 * Interfaz IStorageActions
 * 
 * Interfaz con acciones de manipulacion de listas de tareas
 * 
 * @param <List> | usable con cualquier clase que se extienda de List
 *
 * @author Vanina Pintos
 */
public interface IStorageActions<List> {
    
    /**
     * gregar una lista
     * 
     * addList(List list) recibe una lista para agregar a una coleccion
     * 
     * @param list | lista a agregar
     * 
     * @return boolean | true agregada correctamente | flase no se puedo agregar
     * 
     * @throws CategoryListAlreadyExistException | si ya existe una lista 
     * con la categoria de la lista que se intenta agregar
     * 
     * @author Vanina Pintos
     */
    boolean addList(List list) throws CategoryListAlreadyExistException;
    
    /**
     * Mostrar listas
     * 
     * showLists() devuelve en formato String las listas existentes
     * 
     * @return String | las listas en formato String
     * 
     * @author Vanina Pintos
     */
    String showLists();
    
    /**
     * Eliminar lista
     * 
     * deleteList(String category) recibe la categoria de la lista a eliminar
     * 
     * @param category | categoria de la lista a eliminar
     * 
     * @return boolean | true lista eliminada | false la tarea no se pudo eliminar
     * 
     * @throws UnfinishedTasksException | si la lista que se intenta eliminar
     * tiene tareas sin finalizar (status TODO)
     * 
     * @author Vanina Pintos
     */
    boolean deleteList(String category) throws UnfinishedTasksException;
    
    /**
     * Editar categoria de una lista
     * 
     * editListCategory(String category, String newCategory) recibe la categoria de
     * la lista a modificar y la nueva categoria que se le desea asignar, la valida y 
     * verifica que no este repetida y luego hace la modificacion
     * 
     * @param category | categoria a reemplazar
     * @param newCategory | nueva categoria
     * 
     * @return boolean | true si pudo modificarse con exito
     * 
     * @throws EmptyCategoryListException | si la nueva categoria que se le envio
     * por parametro es un String vacio
     * @throws CategoryListAlreadyExistException | si la nueva categoria que se le 
     * quiere asignar a la lista ya existe 
     * 
     * @author Vanina Pintos
     */
    boolean editListCategory(String category, String newCategory)throws EmptyCategoryListException, CategoryListAlreadyExistException;
    
    /**
     * Buscar una lista
     * 
     * searchList(String category) recibe la categoria de una lista, valida la 
     * que se le encia por parametro no sea una categoria vacia y si existe la retorna
     * 
     * @param category | categoria a buscar
     * 
     * @return List | List si la lista existe | null si no existe
     */
    List searchList(String category);
}
