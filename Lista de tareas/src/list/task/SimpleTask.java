/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package list.task;

import java.io.Serializable;

/**
 * <h1>Clase SimpleTask</h1>
 * 
 * Guarda la informacion de la tarea de tipo simple (nombre y estado)
 * Se extiende de la clase Task
 * 
 * <b>Note:</b>
 * Su nombre y estado pueden ser modificados.
 * 
 * @author Vanina Pintos 
 */
public class SimpleTask extends Task  implements Serializable{
    private boolean check;

    /**
     * <h1>Constructor de la clase SimpleTask</h1>
     *  
     * Unico constructor de la clase SimpleTask 
     * Debe recibir un nombre, el cual tiene que ser validado antes de
     * ser enviado
     * El estado de la tarea por default comienza con el valor TODO
     * 
     * @param name - nombre validar antes de enviar
     * 
     * @see Task#validName() 
     * 
     * @author Vanina Pintos
     */
    public SimpleTask(String name) {
        super(name);
        this.check = false;
    }

    /**
     * <h1>Obtener status</h1>
     * 
     * @return Status | satus actual del objeto
     * 
     * @author Vanina Pintos
     */
    public boolean getCheck() {
        return check;
    }
   
    /**
     * <h1>Cambiar status</h1>
     * 
     * cambia el estado
     * 
     * @author Vanina Pintos
     */
    public void checkTask() {
        if(check)
            check = false;
        else
            check = true;
    } 

    /**
     * Verifica que el objeto sea igual (segun nombre)
     * 
     * @param obj | obj a comparar
     * 
     * @return boolean | true si son iguales 
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
     * Devuelve el objeto en formato String
     * 
     * @return String | objeto en formato String
     * 
     * @author Vanina Pintos
     */
    @Override
    public String toString() {
        return name;
    }
}
