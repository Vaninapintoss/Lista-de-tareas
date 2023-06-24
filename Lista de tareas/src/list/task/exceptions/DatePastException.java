/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package list.task.exceptions;

/**
 *
 * @author Vanina Pintos
 */
public class DatePastException extends Exception{

    /**
     * <h1>Excepcion fecha anterior a la actual</h1>
     * @param message 
     */
    public DatePastException(String message) {
        super("Error: " + message);
    }
    
}
