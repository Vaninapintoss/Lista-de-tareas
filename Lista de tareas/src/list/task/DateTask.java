/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package list.task;

import java.io.Serializable;

/**
 * Clase DateTask
 * 
 * Guarda la informacion de una tarea de tipo date (nombre, 
 * fecha de caducidad y estado) 
 * Se extiende de la clase Task
 * 
 * <b>Note:</b>
 * Su nombre, fecha y estado pueden ser modificados
 * 
 * @author Vanina Pintos
 */
public final class DateTask extends Task  implements Serializable{
    private boolean check;
    private Fecha finalDate;

    /**
     * Constructor de la clase DateTask
     * 
     * Unico constructor de la clase DateTask. 
     * Debe recibir un nombre una fecha de caducidad los cuales
     * deben ser verificados antes de ser enviados
     * El estado de la tarea por default comienza con el valor TODO
     *  
     * @param name - nombre validar antes de pasar por parametro
     * @param date - fecha validar antes de pasar por parametro
     * 
     * @see Task#validName(String name) 
     * @see Fecha#validDate(int dia,int mes,int anio)
     * 
     * @author Vanina Pintos
     */
    public DateTask(String name, Fecha date) {
        super(name);
        this.check = false;
        this.finalDate = date;
    }
    
    /**
     * Obtener status
     * 
     * @return Status | status actual del objeto
     * 
     * @author Vanina Pintos
     */
    public boolean getCheck(){
        return check;
    }
    
    /**
     * Cambiar status
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
     * Obtener Fecha de caducidad
     * 
     * @return LocalDate | fecha de caducidad actual del objeto
     * 
     * @author Vanina Pintos
     */
    public Fecha getFinalDate(){
        return finalDate;
    }
    
    /**
     * Cambiar fecha de caducidad
     * 
     * setFinalDate(String date) recibe una fecha que debe ser validada 
     * antes de enviarse, para modifica la fecha anterior
     * 
     * @param date | nueva fecha validar antes de enviar
     * 
     * @author Vanina Pintos
     */
    public void setFinalDate(Fecha date){
        this.finalDate = date;
    }

    /**
     * Verifica que el objeto sea igual (segun nombre)
     * 
     * @param obj | objeto a comparar
     * 
     * @return boolean | true si son iguales |false si no son iguales 
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
        final DateTask other = (DateTask) obj;
        if (this.check != other.check) {
            return false;
        }
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
    public String toString() 
    {
        return finalDate.toString() + " ........ " + name;
    }
}
