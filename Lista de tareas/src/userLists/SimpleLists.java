/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userLists;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import list.SimpleList;
import list.exceptions.EmptyCategoryListException;
import userLists.exceptions.CategoryListAlreadyExistException;
import userLists.exceptions.UnfinishedTasksException;

/**
 * <h1>Clase SimpleLists</h1>
 * 
 * Clase que guarda las listas de tareas simples en un HashMap
 * Implementa la interfaz IStorageActions
 * 
 * @author Vanina Pintos
 */
public class SimpleLists implements IStorageActions<SimpleList>{
    private HashMap <String,SimpleList> hashMapOfSL;

    /**
     * <h1>Constructor de la clase SimpleLists</h1>
     * 
     * Crea un HashMap vacio
     * 
     */
    public SimpleLists() {
        hashMapOfSL = new HashMap<>();
    }
    
    /**
     * <h1>Obtener cantidad de listas</h1>
     * @return int
     */
    public int howManyLists()
    {
        int number = 0;
        
        Iterator it = hashMapOfSL.entrySet().iterator();
        while(it.hasNext())
        {
             it.next();
             number++;
        }    
        
        return number;
    }
    
    /**
     * <h1>Obtener el hash map</h1>
     * 
     * @return HashMap
     */
    public HashMap<String, SimpleList> getHashMap() {
        return hashMapOfSL;
    }
    
    /**
     * <h1>Obtener lista segun categoria</h1>
     * 
     * @param category | categoria de la lista que se desea obtener
     * @return SimpleList
     */
    public SimpleList getListaSimple(String category) {
        return hashMapOfSL.get(category);
    }

    /**
     * <h1>Agregar una lista</h1>
     * 
     * addList(SimpleList list) recibe una lista para agregar al HashMap
     * 
     * @param list | lista a agregar
     * 
     * @return boolean | true agregada correctamente | false no se pudo agregar 
     * 
     * @throws CategoryListAlreadyExistException | si ya existe una lista
     * con esa categoria dentro del HashMap
     * 
     * @author Vanina Pintos
     */
    @Override
    public boolean addList(SimpleList list) throws CategoryListAlreadyExistException{
        
        boolean added = false;
        
        if(hashMapOfSL.containsKey(list.getCategory())){
            throw new CategoryListAlreadyExistException("categoria ya existente.");
        }else{
            hashMapOfSL.put(list.getCategory(), list);
            added = true;
        }
        
        return added;
    }

    /**
     * <h1>Mostrar listas</h1>
     * 
     * showLists() devuelve en formato String las listas existentes en el HashMap
     * separadas por el caracter "_"
     * 
     * @return String | las listas en formato String
     * 
     * @author Vanina Pintos
     */
    @Override
    public String showLists() {
        String aux = "";
        for (Map.Entry<String, SimpleList> entry : hashMapOfSL.entrySet()) {
            aux += entry.getKey();
            aux += "_";
        }
        return aux;
    }

    /**
     * <h1>Eliminar lista</h1>
     * 
     * deleteList(String category) recibe la categoria de la lista a eliminar
     * 
     * @param category | categoria de la lista a eliminar
     * 
     * @return boolean | true lista eliminada | false la lista no se pudo eliminar 
     * 
     * @throws UnfinishedTasksException | si la lista que se intenta eliminar
     * tiene tareas sin finalizar
     * 
     * @author Vanina Pintos
     */
    @Override
    public boolean deleteList(String category) throws UnfinishedTasksException{
        boolean deleted = false; 
        
        if (hashMapOfSL.containsKey(category)) {
            
            SimpleList sl = searchList(category);
            
            if(sl.tasksWereChecked()){
               hashMapOfSL.remove(category);
               deleted = true; 
            }else{
                throw new UnfinishedTasksException("la lista tiene tareas sin terminar.");
            }        
        } 
        
        return deleted; 
    }
    
    

    /**
     * <h1>Editar categoria de una lista</h1>
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
    public boolean editListCategory(String category, String newCategory) throws EmptyCategoryListException, CategoryListAlreadyExistException{
        boolean edited = false;
        
        if(hashMapOfSL.containsKey(newCategory)){
            
            throw new CategoryListAlreadyExistException("categoria ya existente.");
            
        }else{
            
            if(hashMapOfSL.containsKey(category)){
                SimpleList sl = hashMapOfSL.remove(category);
                sl.setCategory(newCategory);
                hashMapOfSL.put(newCategory, sl); 
                edited = true;
            }
        }
        
        return edited;
    }

    /**
     * <h1>Buscar una lista</h1>
     * 
     * searchList(String category) recibe la categoria de una lista y si existe la retorna
     * 
     * @param category | categoria a buscar
     * @return SimpleList | SimpleList | null si no existe
     */
    @Override
    public SimpleList searchList(String category) {
        return hashMapOfSL.get(category);
    }
}
