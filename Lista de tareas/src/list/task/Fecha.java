/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package list.task;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import list.task.exceptions.DatePastException;

/**
 * <h1>Clase Fecha</h1>
 * 
 * Clase que guarda la informacion de una determinada fecha,
 * dia, mes y anio.
 * 
 * @author Vanina Pintos
 */
public class Fecha implements Serializable{
    private int dia;
    private int mes;
    private int anio;
    
    /**
     * <h1>Constructor de la clase Fecha</h1>
     * 
     * Unico contstructor de la clase Fecha
     * Debe recibir un dia, mes y anio que deben ser validados antes de 
     * ser enviados
     * 
     * @see Fecha#validDate(int dia,int mes,int anio);
     * 
     * @param dia | dia validar antes de enviar
     * @param mes | mes validar antes de enviar
     * @param anio |anio validar antes de enviar
     */
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    
    /**
     * <h1>String de fecha</h1>
     * 
     * Devuelve la fecha en formato String
     * 
     * @return String | fecha en formato "dd-mm-aaaa"
     */
    public String toString()
    {
        return dia+"-"+mes+"-"+anio;
    }
    
    /**
     * <h1>Validacion de fecha</h1>
     * 
     * validDate(int dia,int mes,int anio) recibe los datos de una fecha
     * para validar que corresponda a una fecha valida y que a su vez esta 
     * no sea una fecha anterior al dia actual
     * 
     * @param dia | dia a validar
     * @param mes | mes a validar
     * @param anio | anio a validar
     * 
     * @return boolean | true al fecha es valida | fale fecha invalida
     * 
     * @throws DatePastException | si la fecha ingresada es posterior a la actual
     */
    public static boolean validDate(int dia,int mes,int anio) throws DatePastException,DateTimeParseException{
        boolean valid = false;
        
        LocalDate date = LocalDate.of(anio,mes,dia);        
     
        LocalDate today = LocalDate.now();
        
        if(date.compareTo(today) < 0){
                throw new DatePastException("fecha invalida");
        }else{
            valid = true;
        }
       
        return valid; 
    }
}
