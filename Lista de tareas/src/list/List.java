/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package list;

import list.exceptions.EmptyCategoryListException;
import list.task.SimpleTask;
import list.task.exceptions.EmptyNameTaskException;

/**
 *
 * @author vanim
 */
public abstract class List{
    private String category;

    public List(String category) {
        this.category = category;
    }
    
    public String getCategory(){
        return category;
    }
    
    public void setCategory(String category){
        this.category = category;
    }
    
    public boolean validCategory(String category) throws EmptyCategoryListException{
        boolean valid = false;
        
        if(category.isEmpty()){
            throw new EmptyCategoryListException("ingrese una categoria."); 
        }else{
            valid = true;
        }
        
        return valid;
    }
    
    public boolean validThisCategory() throws EmptyCategoryListException{
        return validCategory(category);
    }
}
