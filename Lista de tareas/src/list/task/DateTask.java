/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package list.task;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Objects;
import java.util.regex.Pattern;
import list.task.exceptions.InvalidPatternDateException;

/**
 * <h1>Clase DateTask</h1>
 * Guarda la informacion de una tarea de tipo date: nombre, fecha de caducidad y estado 
 * Se extiende de la clase Task
 * 
 * <b>Note:</b>
 * su nombre, fecha y estado pueden ser modificados
 * 
 * @author Vanina Pintos & Sofia Brocardo
 */
public final class DateTask extends Task{
    private Status status;
    private LocalDate finalDate;

    /**
     * <h1>Constructor de la clase DateTask</h1>
     * 
     * Unico constructor de la clase DateTask. 
     * Debe recibir un nombre
     * El estado de la tarea por default comienza con el valor TODO
     *  
     * @param name - validar antes de pasar por parametro
     * 
     * @see User#validName() 
     * @see User#validThisName()
     * 
     * @author Vanina Pintos
     */
    public DateTask(String name) {
        super(name);
        this.status = status.TODO;
        this.finalDate = null;
    }
    
    /**
     * <h1>Asignar una fecha de caducidad a la tarea</h1>
     * addDate(String date) recibe la fecha y si es valida la asigna a la tarea
     * 
     * @param date | fecha a validar y asignar
     * 
     * @return boolean | true si la fecha es valida 
     *
     * 
     * @throws InvalidPatternDateException | si el formato de String enviado 
     * es distinto de dd/MM/yyyy 
     * 
     * @throws DateTimeParseException | si la fecha es invalida
     * 
     * @author Vanina Pintos
     */
    public boolean addDate(String date)throws InvalidPatternDateException, DateTimeParseException{
        
        boolean added = false;
        
        validPatternDate(date);      
        
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.finalDate = LocalDate.parse(date, formatoFecha); 
        
        return added;
    }
    
    /**
     * <h1>Validar patron de fecha</h1>
     * validPatternDate(String date) valida si la fecha recibida en formato
     * String cumple con el patron dd/MM/yyyy
     * 
     * @param date| patron de fecha a validar 
     * 
     * @return boolean | true si el patron de la fecha es valida 
     *
     * @throws InvalidPatternDateException | si el formato de String enviado 
     * es distinto de dd/MM/yyyy
     * 
     * @author Vanina Pintos
     */
    public boolean validPatternDate(String date) throws InvalidPatternDateException{ //valida el patron de fecha dd/MM/yyyy
        
        boolean valid = false; 
        String patron = "\\d{2}/\\d{2}/\\d{4}"; 

        if(Pattern.matches(patron, date)){
            valid = true;
        }else{
            throw new InvalidPatternDateException("formato de fecha incorrecto");
        }
        
        return valid;
    }
    
    /**
     * <h1>Obtener status</h1>
     * 
     * @return Status | status actual del objeto
     * 
     * @author Vanina Pintos
     */
    public Status getStatus(){
        return status;
    }
    
    /**
     * <h1>Cambiar status</h1>
     * 
     * setStatus(Status status) recibe por parametros
     * el nuevo status para modificar el antiguo.
     * 
     * @param status | nuevo status 
     * 
     * @author Vanina Pintos
     */
    public void setStatus(Status status){
        this.status = status;
    }
    
    /**
     * <h1>Obtener Fecha de caducidad</h1>
     * 
     * @return LocalDate | fecha final actual del objeto
     * 
     * @author Vanina Pintos
     */
    public LocalDate getFinalDate(){
        return finalDate;
    }
    
    /**
     * <h1>Cambiar fecha de caducidad</h1>
     * 
     * setFinalDate(String date) recibe por parametros
     * la nueva fecha y si es valida la asigna
     * 
     * @param date | nueva fecha
     * 
     * @return boolean | true si la fecha es valida y pudo modificarse
     * 
     * @throws InvalidPatternDateException | si el formato de String enviado 
     * es distinto de dd/MM/yyyy 
     * @throws DateTimeParseException | si la fecha es invalida
     * 
     * @author Vanina Pintos
     */
    public boolean setFinalDate(String date) throws InvalidPatternDateException, DateTimeParseException{
        return addDate(date);
    }

    /**
     * Verifica que el objeto sea igual
     * 
     * @param obj
     * 
     * @return boolean | true si son iguales |false si no son iguales (segun nombre)
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
        if (this.status != other.status) {
            return false;
        }
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
        return name + " - " + finalDate + " - " + status;
    }
}
