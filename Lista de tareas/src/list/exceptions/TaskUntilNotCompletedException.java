/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package list.exceptions;

/**
 *
 * @author Vanina Pintos
 */
public class TaskUntilNotCompletedException extends Exception{

    /**
     * <h1>Excepcion de tarea no completada</h1>
     * 
     * @param message 
     */
    public TaskUntilNotCompletedException(String message) {
        super("Error: " +  message);
    }
    
}
