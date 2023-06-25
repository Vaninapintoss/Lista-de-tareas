/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package list.exceptions;

/**
 * TaskUntilNotCompletedException
 * @author Vanina Pintos
 */
public class TaskUntilNotCompletedException extends Exception{

    /**
     * Excepcion de tarea no completada
     * 
     * @param message | message
     */
    public TaskUntilNotCompletedException(String message) {
        super("Error: " +  message);
    }
    
}
