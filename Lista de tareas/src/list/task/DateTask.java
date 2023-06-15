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
 *
 * @author vanim
 */
public final class DateTask extends Task{
    private Status status;
    private LocalDate finalDate;

    public DateTask(String name, String date) {
        super(name);
        this.status = status.TODO;
        this.finalDate = null;
    }
    
    public boolean addDate(String date)throws InvalidPatternDateException, DateTimeParseException{
        
        boolean added = false;
        
        validPatternDate(date);      
        
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.finalDate = LocalDate.parse(date, formatoFecha); 
        
        return added;
    }
    
    public boolean validPatternDate(String cadena) throws InvalidPatternDateException{ //valida el patron de fecha dd/MM/yyyy
        
        boolean valid = false; 
        String patron = "\\d{2}/\\d{2}/\\d{4}"; 

        if(Pattern.matches(patron, cadena)){
            valid = true;
        }else{
            throw new InvalidPatternDateException("formato de fecha incorrecto");
        }
        
        return valid;
    }
    
    public Status getStatus(){
        return status;
    }
    
    public void setStatus(Status status){
        this.status = status;
    }
    
    public LocalDate getFinalDate(){
        return finalDate;
    }
    
    public boolean changeFinalDate(String date) throws InvalidPatternDateException, DateTimeParseException{
        return addDate(date);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

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

    @Override
    public String toString() {
        return name + " - " + finalDate + " - " + status;
    }
}
