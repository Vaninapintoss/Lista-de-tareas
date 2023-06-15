package list.task;


import java.util.Objects;
import list.task.exceptions.EmptyNameTaskException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Vanina Pintos
 */
public abstract class Task {
    String name;

    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    } 
    
    public void setName(String name){
        this.name = name;
    }
    
    public boolean validName(String name) throws EmptyNameTaskException{
        boolean valid = false;
        
        if(name.isEmpty()){
            throw new EmptyNameTaskException("ingrese un nombre"); 
        }else{
            valid = true;
        }
        
        return valid;
    }
    
    public boolean validThisName()throws EmptyNameTaskException{
        return validName(name);
    }
}
