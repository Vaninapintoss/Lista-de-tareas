/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userLists;

import list.exceptions.EmptyCategoryListException;
import userLists.exceptions.CategoryListAlreadyExistException;
import userLists.exceptions.UnfinishedTasksException;

/**
 * <h1>Interfaz IStorageActions</h1>
 * 
 * Interfaz con acciones de manipulacion de listas
 * 
 * @param <List> | usable con cualquier clase que derive de List
 *
 * @author Vanina Pintos
 */
public interface IStorageActions<List> {
    
    /**
     * <h1>Agregar una lista</h1>
     * 
     * addList(List list) recibe una lista para agregar a una coleccion
     * 
     * @param list | lista a agregar
     * @return boolean | true si pudo agregarse correctamente
     * @throws CategoryListAlreadyExistException | si ya existe una lista
     * con la categoria de la lista que se intenta agregar
     * 
     * @author Vanina Pintos
     */
    boolean addList(List list) throws CategoryListAlreadyExistException;
    
    /**
     * <h1>Mostrar listas</h1>
     * 
     * showLists() devuelve en formato String las listas existentes
     * 
     * @return String | las listas en formato String
     * 
     * @author Vanina Pintos
     */
    String showLists();
    
    /**
     * <h1>Eliminar lista</h1>
     * 
     * deleteList(String category) recibe la categoria de la lista a eliminar
     * 
     * @param category | categoria de la lista a eliminar
     * @return boolean | true si se pudo eliminar correctamente
     * @throws UnfinishedTasksException | si la lista que se intenta eliminar
     * tiene tareas sin finalizar (status: TODO)
     * 
     * @author Vanina Pintos
     */
    boolean deleteList(String category) throws UnfinishedTasksException;
    
    /**
     * <h1>Editar categoria de una lista</h1>
     * 
     * editListCategory(String category, String newCategory) recibe la categoria de
     * la lista a modificar y la nueva categoria que se le desea asignar
     * 
     * @param category | categoria a reemplazar
     * @param newCategory | nueva categoria
     * @return boolean | true si pudo modificarse con exito
     * @throws EmptyCategoryListException | si la nueva categoria que se le envio
     * por parametro es un String vacio
     * @throws CategoryListAlreadyExistException | si la nueva categoria que se le 
     * quiere asignar a la lista ya existe 
     * 
     * @author Vanina Pintos
     */
    boolean editListCategory(String category, String newCategory)throws EmptyCategoryListException, CategoryListAlreadyExistException;
    
    /**
     * <h1>Buscar una lista</h1>
     * 
     * searchList(String category) recibe la categoria de una lista y si existe la retorna
     * 
     * @param category | categoria a buscar
     * @return List | List si la lista existe | null si no existe
     */
    List searchList(String category);
}
