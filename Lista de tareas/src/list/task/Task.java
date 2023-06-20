/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package list.task;

import list.task.exceptions.EmptyNameTaskException;

/**
 * <h1>Clase Task</h1>
 * 
 * Clase abstracta padre de los tipos de tareas como SimpleTask, DateTask y TrackTask
 * 
 * @author Vanina Pintos
 */

public abstract class Task {
    String name;

    /**
     * <h1>Constructor de la clase Task</h1>
     *  
     * @param name - nombre de la tarea
     * 
     * @see User#validName() 
     * @see User#validThisName()
     * 
     * @author Vanina Pintos
     */
    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    } 
    
    public void setName(String name){
        this.name = name;
    }
    
    /**
     * <h1>Validar nombre del objeto</h1>
     * validThisName() valida el nombre actual del objeto Task
     * (debe no estar vacia)
     * 
     * @return boolean | true si el nombre es valido 
     * 
     * @throws EmptyNameTaskException | si el nombre se envia en un String vacio ""
     * 
     * @author Vanina Pintos
     */
    
    public boolean validThisName()throws EmptyNameTaskException{
        return validName(name);
    }
    
    /**
     * <h1>Validar nombre</h1>
     * validName(String name) valida si el String pasado por parametro 
     * es un nombre valido (no debe estar vacio)
     * 
     * @param name | nombre a validar
     * 
     * @return boolean | true si el nombre es valido 
     * 
     * @throws EmptyNameTaskException | si el nombre se envia en un String vacio ""
     * 
     * @author Vanina Pintos
     */
    
    public boolean validName(String name) throws EmptyNameTaskException{
        boolean valid = false;
        
        if(name.isEmpty()){
            throw new EmptyNameTaskException("ingrese un nombre"); 
        }else{
            valid = true;
        }
        
        return valid;
    }
}
