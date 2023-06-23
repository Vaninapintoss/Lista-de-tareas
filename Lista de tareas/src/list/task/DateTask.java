/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package list.task;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Pattern;
import list.task.exceptions.InvalidPatternDateException;

/**
 * <h1>Clase DateTask</h1>
 * Guarda la informacion de una tarea de tipo date (nombre, fecha de caducidad
 * y estado) 
 * Se extiende de la clase Task
 * 
 * <b>Note:</b>
 * su nombre, fecha y estado pueden ser modificados
 * 
 * @author Vanina Pintos
 */
public final class DateTask extends Task  implements Serializable{
    private Status status;
    private LocalDate finalDate;

    /**
     * <h1>Constructor de la clase DateTask</h1>
     * 
     * Unico constructor de la clase DateTask. 
     * Debe recibir un nombre una fecha de caducidad
     * El estado de la tarea por default comienza con el valor TODO
     *  
     * @param name - validar antes de pasar por parametro
     * @param date - creada y valiadad antes de pasar por parametro con
     * la funcion especificada abajo
     * 
     * @see Task#validName() 
     * @see DateTask#createDate(String) 
     * 
     * @author Vanina Pintos
     */
    public DateTask(String name, LocalDate date) {
        super(name);
        this.status = status.TODO;
        this.finalDate = date;
    }
    
    /**
     * <h1>Crear una fecha</h1>
     * 
     * createDate(String date) recibe una fecha en formato Sring para poder
     * convertirlo a un formato valido para enviar por parametro cuando
     * se quiera crear una dateTask.
     * 
     * @param date | fecha en formato string
     * 
     * @return LocalDate | fecha en formato apto para el constructor de DateTask
     *
     * @throws InvalidPatternDateException | si la fecha en formato de string 
     * no esta en el formato especificado dd/MM/yyyy
     * 
     * @throws DateTimeParseException | si la fecha indicada no es valida
     * 
     * @author Vanina Pintos
     */
    public static LocalDate createDate(String date)throws InvalidPatternDateException, DateTimeParseException{
        
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(date, formatoFecha);
    }
    
    /**
     * <h1>Validar patron de fecha</h1>
     * 
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
     * setStatus(Status status) recibe por parametros el nuevo status
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
     * setFinalDate(String date) recibe por parametros la nueva fecha en formato 
     * String dd/MM/yyyy
     * 
     * @param date | nueva fecha
     * 
     * @throws InvalidPatternDateException | si el formato de String enviado 
     * es distinto de dd/MM/yyyy 
     * @throws DateTimeParseException | si la fecha es invalida
     * 
     * @author Vanina Pintos
     */
    public void setFinalDate(String date) throws InvalidPatternDateException, DateTimeParseException{
        this.finalDate = createDate(date);
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
        return finalDate + "_" + name;
    }
}
