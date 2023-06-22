/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package list.task;

import java.io.Serializable;
import list.task.exceptions.EmptyNameTaskException;

/**
 * <h1>Clase Task</h1>
 * 
 * Clase abstracta padre de los tipos de tareas como SimpleTask, DateTask y TrackTask. 
 * Guarda la informacion del nombre de la tarea
 * 
 * @author Vanina Pintos
 */
public abstract class Task implements Serializable{
    String name;

    /**
     * <h1>Constructor de la clase Task</h1>
     * 
     * Unico constructor de la clase Task
     * Debe recibir un nombre
     * 
     * @param name - validar antes de pasar por parametro
     * 
     * @see Task#validName() 
     * 
     * @author Vanina Pintos
     */
    public Task(String name) {
        this.name = name;
    }
    
    /**
     * <h1>Validar nombre del objeto</h1>
     * 
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
     * 
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
    public static boolean validName(String name) throws EmptyNameTaskException{
        boolean valid = false;
        
        if(name.isEmpty()){
            throw new EmptyNameTaskException("ingrese un nombre"); 
        }else{
            valid = true;
        }
        
        return valid;
    }
    
    /**
     * <h1>Obtener nombre</h1>
     * 
     * @return String | nombre actual del objeto
     * 
     * @author Vanina Pintos
     */
    public String getName() {
        return name;
    } 
    
    /**
     * <h1>Cambiar nombre</h1>
     * 
     * setName(String name) recibe por parametro el nuevo nombre 
     * 
     * @param name | nuevo nombre 
     * 
     * @return boolean | true si el nombre es valido  y pudo realizarse la modificacion
     * 
     * @throws EmptyNameTaskException | si el nuevo nombre contiene un String vacio ""

     * @author Vanina Pintos
     */
    public boolean setName(String name)throws EmptyNameTaskException{
        boolean changed = false;
        
        if(validName(name)){
            this.name = name;
            changed = true;
        }
        
        return changed;
    }    
}
