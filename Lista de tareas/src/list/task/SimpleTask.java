/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package list.task;

import java.io.Serializable;

/**
 * <h1>Clase SimpleTask</h1>
 * Guarda la informacion de la tarea de tipo simple (nombre y estado)
 * Se extiende de la clase Task
 * 
 * <b>Note:</b>
 * su nombre y estado pueden ser modificados
 * 
 * @author Vanina Pintos 
 */
public class SimpleTask extends Task  implements Serializable{
    private Status status;

    /**
     * <h1>Constructor de la clase SimpleTask</h1>
     *  
     * Unico constructor de la clase SimpleTask 
     * Debe recibir un nombre
     * El estado de la tarea por default comienza con el valor TODO
     * 
     * @param name - validar antes de pasar por parametro
     * 
     * @see Task#validName() 
     * 
     * @author Vanina Pintos
     */
    public SimpleTask(String name) {
        super(name);
        this.status = Status.TODO;
    }

    /**
     * <h1>Obtener status</h1>
     * 
     * @return Status | satus actual del objeto
     * 
     * @author Vanina Pintos
     */
    public Status getStatus() {
        return status;
    }
   
    /**
     * <h1>Cambiar status</h1>
     * 
     * setStatus(Status status) recibe por parametros el nuevo status 
     * 
     * @param status | nuevo status 
     *  
     * @author Vanina Pintos
     */
    public void setStatus(Status status) {
        this.status = status;
    } 

    /**
     * Verifica que el objeto sea igual
     * 
     * @param obj
     * 
     * @return boolean | true si son iguales (segun nombre)
     * 
     * @author Vanina Pintos
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SimpleTask other = (SimpleTask) obj;
        return name.equals(other.name);
    }
    
    /**
     * devuelve el objeto en formato String
     * 
     * @return String | objeto en formato String
     * 
     * @author Vanina Pintos
     */
    @Override
    public String toString() {
        return name + " - " + status;
    }
}
