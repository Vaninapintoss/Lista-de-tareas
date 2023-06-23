/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package list.task.exceptions;

/**
 *
 * @author soyva
 */
public class DatePastException extends Exception{

    public DatePastException(String message) {
        super("Error: " + message);
    }
    
}
