/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userLists;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import list.DateList;
import list.exceptions.EmptyCategoryListException;
import userLists.exceptions.CategoryListAlreadyExistException;
import userLists.exceptions.UnfinishedTasksException;

/**
 * Clase DateLists
 * 
 * Clase que guarda las listas de tareas con fecha en un HashMap
 * Implementa la interfaz IStorageActions
 * 
 * @author Vanina Pintos
 */
public class DateLists implements IStorageActions<DateList>{
    private HashMap <String,DateList> hashMapOfDL; 

    /**
     * Constructor de la clase DateLists
     * 
     * Crea un HashMap vacio
     * 
     */
    public DateLists() {
        hashMapOfDL = new HashMap<>();
    }

    /**
     * Obtener el hash map
     * @return HashMap
     */
    public HashMap<String, DateList> getHashMap() {
        return hashMapOfDL;
    }
    
    /**
     * Obtener cantidad de listas
     * @return int
     */
    public int howManyLists()
    {
        int number = 0;
        
        Iterator it = hashMapOfDL.entrySet().iterator();
        while(it.hasNext())
        {
             it.next();
             number++;
        }    
        
        return number;
    }

    /**
     * Obtener una lista
     * @param category | categoria de la lista que se quiere obtener
     * @return DateList 
     */
    public DateList getDateList(String category) {
        return hashMapOfDL.get(category);
    }

    /**
     * Agregar una lista
     * 
     * addList(DateList list) recibe una lista para agregar al HashMap
     * 
     * @param list | lista a agregar
     * 
     * @return boolean | true si pudo agregarse correctamente
     * 
     * @throws CategoryListAlreadyExistException | si ya existe una lista
     * con esa categoria dentro del HashMap
     * 
     * @author Vanina Pintos
     */
    @Override
    public boolean addList(DateList list) throws CategoryListAlreadyExistException {
        boolean added = false;
        
        if(hashMapOfDL.containsKey(list.getCategory())){
            throw new CategoryListAlreadyExistException("categoria ya existente.");
        }else{
            hashMapOfDL.put(list.getCategory(), list);
            added = true;
        }
        
        return added;
    }

    /**
     * Mostrar listas
     * 
     * showLists() devuelve en formato String las listas existentes en el HashMap
     * separados por el caracter "_"
     * 
     * @return String | las listas en formato String
     * 
     * @author Vanina Pintos
     */
    @Override
    public String showLists() {
        String aux = "";
        for (Map.Entry<String, DateList> entry : hashMapOfDL.entrySet()) {
            aux += entry.getKey();
            aux += "_";
        }
        return aux;
    }

    /**
     * Eliminar lista
     * 
     * deleteList(String category) recibe la categoria de la lista a eliminar
     * 
     * @param category | categoria de la lista a eliminar
     * 
     * @return boolean | true si se pudo eliminar correctamente
     * 
     * @throws UnfinishedTasksException | si la lista que se intenta eliminar
     * tiene tareas sin finalizar (status: TODO)
     * 
     * @author Vanina Pintos
     */
    @Override
    public boolean deleteList(String category) throws UnfinishedTasksException {
        boolean deleted = false; 
        
        if (hashMapOfDL.containsKey(category)) {
            
            DateList dl = searchList(category);
            
            if(dl.tasksWereChecked()){
               hashMapOfDL.remove(category);
               deleted = true; 
            }else{
                throw new UnfinishedTasksException("la lista tiene tareas sin terminar.");
            }        
        } 
        
        return deleted;    }

    /**
     * Editar categoria de una lista
     * 
     * editListCategory(String category, String newCategory) recibe la categoria de
     * la lista a modificar y la nueva categoria que se le desea asignar
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
    @Override
    public boolean editListCategory(String category, String newCategory) throws EmptyCategoryListException, CategoryListAlreadyExistException {
        boolean edited = false;
        
        if(hashMapOfDL.containsKey(newCategory)){
            
            throw new CategoryListAlreadyExistException("categoria ya existente.");
            
        }else{
            
            if(hashMapOfDL.containsKey(category)){
                DateList dt = hashMapOfDL.remove(category);
                dt.setCategory(newCategory);
                hashMapOfDL.put(newCategory, dt); 
                edited = true;
            }
        }
        
        return edited;    }

    /**
     * Buscar una lista
     * 
     * searchList(String category) recibe la categoria de una lista y si existe la retorna
     * 
     * @param category | categoria a buscar
     * 
     * @return DateList | DateList si la lista existe | null si no existe
     * 
     * @author Vanina Pintos
     */
    @Override
    public DateList searchList(String category) {
        return hashMapOfDL.get(category);
    }
}
