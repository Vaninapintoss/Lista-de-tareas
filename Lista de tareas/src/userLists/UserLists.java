/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userLists;

import java.util.HashMap;
import java.util.Map;
import list.DateList;
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
        }else{
            simpleLists.put(category, sl);
            added = true;
        }
        
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
            
            if(sl.tasksWereChecked()){
               simpleLists.remove(category);
               deleted = true; 
            }else{
                throw new UnfinishedTasksException("la lista tiene tareas sin terminar.");
            }        
        } 
        
        return deleted; 
    }
    
    public boolean editCategorySimpleList(String category, String newCategory)throws EmptyCategoryListException, CategoryListAlreadyExistException{
        boolean edited = false;
        
        SimpleList newsl = new SimpleList(newCategory);
        
        newsl.validThisCategory();
        
        if(simpleLists.containsKey(newCategory)){
            
            throw new CategoryListAlreadyExistException("categoria ya existente.");
            
        }else{
            
            if(simpleLists.containsKey(category)){
                SimpleList sl = simpleLists.remove(category);
                sl.setCategory(newCategory);
                simpleLists.put(newCategory, sl); 
                edited = true;
            }
        }
        
        return edited;
    }
    
    public SimpleList searchSimpleList(String category){
        return simpleLists.get(category);
    }
    
    //---------------------------------------------------------------------
    
    public boolean addDateList(String category) throws EmptyCategoryListException, CategoryListAlreadyExistException{
        
        boolean added = false;
        
        DateList dl = new DateList(category);
        
        dl.validThisCategory();
        
        if(dateLists.containsKey(category)){
            throw new CategoryListAlreadyExistException("categoria ya existente.");
        }else{
            dateLists.put(category, dl);
            added = true;
        }
        
        return added;
    }
    
    public String showDateLists(){
        String aux = "";
        
        for (Map.Entry<String, DateList> entry : dateLists.entrySet()) {
            aux += entry.getKey();
        }
        
        return aux;
    }
    
    public boolean deleteDateList(String category) throws UnfinishedTasksException{
        boolean deleted = false; 
        
        if (dateLists.containsKey(category)) {
            
            DateList dt = searchDateList(category);
            
            if(dt.tasksWereChecked()){
               dateLists.remove(category);
               deleted = true; 
            }else{
                throw new UnfinishedTasksException("la lista tiene tareas sin terminar.");
            }        
        } 
        
        return deleted; 
    }
    
    public boolean editCategoryDateList(String category, String newCategory)throws EmptyCategoryListException, CategoryListAlreadyExistException{
        boolean edited = false;
        
        DateList newdt = new DateList(newCategory);
        
        newdt.validThisCategory();
        
        if(dateLists.containsKey(newCategory)){
            
            throw new CategoryListAlreadyExistException("categoria ya existente.");
            
        }else{
            
            if(dateLists.containsKey(category)){
                DateList dt = dateLists.remove(category);
                dt.setCategory(newCategory);
                dateLists.put(newCategory, dt); 
                edited = true;
            }
        }
        
        return edited;
    }
    
    public DateList searchDateList(String category){
        return dateLists.get(category);
    }
    
    //------------------------------------------------------------------------------------------------
    
    public boolean addTrackList(String category) throws EmptyCategoryListException, CategoryListAlreadyExistException{
        
        boolean added = false;
        
        TrackList tl = new TrackList(category);
        
        tl.validThisCategory();
        
        if(trackLists.containsKey(category)){
            throw new CategoryListAlreadyExistException("categoria ya existente.");
        }else{
            trackLists.put(category, tl);
            added = true;
        }
        
        return added;
    }
    
    public String showTrackLists(){
        String aux = "";
        
        for (Map.Entry<String, TrackList> entry : trackLists.entrySet()) {
            aux += entry.getKey();
        }
        
        return aux;
    }
    
    public boolean editCategoryTrackList(String category, String newCategory)throws EmptyCategoryListException, CategoryListAlreadyExistException{
        boolean edited = false;
        
        TrackList newtl = new TrackList(newCategory);
        
        newtl.validThisCategory();
        
        if(trackLists.containsKey(newCategory)){
            
            throw new CategoryListAlreadyExistException("categoria ya existente.");
            
        }else{
            
            if(trackLists.containsKey(category)){
                TrackList tl = trackLists.remove(category);
                tl.setCategory(newCategory);
                trackLists.put(newCategory, tl); 
                edited = true;
            }
        }
        
        return edited;
    }
    
    public TrackList searchTrackList(String category){
        return trackLists.get(category);
    }
}
