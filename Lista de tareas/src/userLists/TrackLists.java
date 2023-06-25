/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userLists;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import list.TrackList;
import list.exceptions.EmptyCategoryListException;
import userLists.exceptions.CategoryListAlreadyExistException;

/**
 * Clase TrackLists
 * 
 * Clase que guarda las listas de tareas de traqueo en un HashMap
 * Implementa la interfaz IStorageActions
 * 
 * @author Vanina Pintos
 */
public class TrackLists implements IStorageActions<TrackList>{
    private HashMap <String,TrackList> hashMapOfTL;

    /**
     * Constructor de la clase TrackLists
     * 
     * Crea un HashMap vacio
     * 
     */
    public TrackLists() {
        hashMapOfTL = new HashMap<>();
    }
    
    /**
     * Obtener el hash map
     * @return HashMap
     */
    public Map<String, TrackList> getHashMap() {
        return hashMapOfTL;
    }
    
    /**
     * Obtener cantidad de listas
     * @return int
     */
    public int howManyLists()
    {
        int number = 0;
        
        Iterator it = hashMapOfTL.entrySet().iterator();
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
    public TrackList getTrackList(String category) {
        return hashMapOfTL.get(category);
    }

    /**
     * Agregar una lista
     * 
     * addList(TrackList list) recibe una lista para agregar al HashMap
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
    public boolean addList(TrackList list) throws CategoryListAlreadyExistException {
        boolean added = false;
        
        if(hashMapOfTL.containsKey(list.getCategory())){
            throw new CategoryListAlreadyExistException("categoria ya existente.");
        }else{
            hashMapOfTL.put(list.getCategory(), list);
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
        for (Map.Entry<String, TrackList> entry : hashMapOfTL.entrySet()) {
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
     * @author Vanina Pintos
     */
    @Override
    public boolean deleteList(String category) {
        boolean deleted = false; 
        
        if (hashMapOfTL.containsKey(category)) {

            hashMapOfTL.remove(category);
            deleted = true;
        } 
        
        return deleted;
    }

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
        
        if(hashMapOfTL.containsKey(newCategory)){
            
            throw new CategoryListAlreadyExistException("categoria ya existente.");
            
        }else{
            
            if(hashMapOfTL.containsKey(category)){
                TrackList tl = hashMapOfTL.remove(category);
                tl.setCategory(newCategory);
                hashMapOfTL.put(newCategory, tl); 
                edited = true;
            }
        }
        
        return edited;
    }

    /**
     * Buscar una lista
     * 
     * searchList(String category) recibe la categoria de una lista y si existe la retorna
     * 
     * @param category | categoria a buscar
     * 
     * @return TrackList | TrackList si la lista existe | null si no existe
     * 
     * @author Vanina Pintos
     */
    @Override
    public TrackList searchList(String category) {
        return hashMapOfTL.get(category);
    }
}
