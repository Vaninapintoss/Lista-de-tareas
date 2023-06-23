/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package list.task;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import list.task.exceptions.DatePastException;

/**
 *
 * @author soyva
 */
public class Fecha implements Serializable{
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    //que la fecha ingresad sea mayor a la de hoy
    public static boolean validDate(int dia,int mes,int anio) throws DatePastException{
        boolean valid = false;
        
        //formateo la fecha ingresada
        LocalDate date = LocalDate.of(anio,mes,dia);        
     
        //captura la fecha actual
        LocalDate today = LocalDate.now();
        
        //hago la comparacion
        if(date.compareTo(today) < 0){
                throw new DatePastException("fecha invalida");
        }else{
            valid = true;
        }
       
        return valid; 
    }
}
