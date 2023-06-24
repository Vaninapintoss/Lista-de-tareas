/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userLists.exceptions;

/**
 *
 * @author Vanina Pintos
 */
public class UnfinishedTasksException extends Exception{

    /**
     * <h1>Excepcion de tareas sin terminar</h1>
     * 
     * @param message 
     */
    public UnfinishedTasksException(String message) {
        super("Error: " + message);
    }
    
}
