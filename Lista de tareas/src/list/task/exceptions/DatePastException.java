/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package list.task.exceptions;

/**
 * DatePastException
 * @author Vanina Pintos
 */
public class DatePastException extends Exception{

    /**
     * Excepcion fecha anterior a la actual
     * @param message | message
     */
    public DatePastException(String message) {
        super("Error: " + message);
    }
    
}
