/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userLists;

import java.util.HashMap;
import java.util.Map;
import list.DateList;
import list.List;
import list.SimpleList;
import list.TrackList;
import list.exceptions.EmptyCategoryListException;
import userLists.exceptions.CategoryListAlreadyExistException;
import userLists.exceptions.UnfinishedTasksException;

/**
 *
 * @author vanim
 */
public class UserLists{
    
    private HashMap <String,SimpleList> simpleLists;
    private HashMap <String,DateList> dateLists;
    private HashMap <String,TrackList> trackLists;

    public UserLists() {
        simpleLists = new HashMap<>();
        dateLists = new HashMap<>();
        trackLists = new HashMap<>();;
    }  
    
    public boolean addSimpleList(String category) throws EmptyCategoryListException, CategoryListAlreadyExistException{
        boolean added = false; 
        SimpleList sl = new SimpleList(category);
        
        sl.validThisCategory();
        
        if(simpleLists.containsKey(sl.getCategory())){
            throw new CategoryListAlreadyExistException("categoria ya existente.");
        }
        
        simpleLists.put(category, sl);
        return added;
    }
    
    public String showSimpleLists(){
        String aux = "";
        for (Map.Entry<String, SimpleList> entry : simpleLists.entrySet()) {
            aux += entry.getKey();
        }
        return aux;
    }
    
    public boolean deleteSimpleList(String category) throws UnfinishedTasksException{
        boolean deleted = false; 
        
        if (simpleLists.containsKey(category)) {
            
            SimpleList sl = searchSimpleList(category);
            
            if(sl.elementsWereChecked()){
               simpleLists.remove(category);
               deleted = true; 
            }else{
                throw new UnfinishedTasksException("la lista tiene tareas sin terminar.");
            }        
        } 
        
        return deleted; 
    }
    
    public boolean editCategorySimpleList(String category, String newCategory){
        boolean edited = false;
        
        if(simpleLists.containsKey(category)){
            SimpleList sl = simpleLists.remove(category);
            sl.setCategory(newCategory);
            simpleLists.put(newCategory, sl); // Agregar elemento con nueva clave y valor actualizado
            edited = true;
        } 
        
        return edited;
    }
    
    public SimpleList searchSimpleList(String category){
        return simpleLists.get(category);
    }
}
