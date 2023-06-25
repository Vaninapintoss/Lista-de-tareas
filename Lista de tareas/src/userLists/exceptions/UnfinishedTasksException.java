/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userLists.exceptions;

/**
 * UnfinishedTasksException
 * @author Vanina Pintos
 */
public class UnfinishedTasksException extends Exception{

    /**
     * Excepcion de tareas sin terminar
     * 
     * @param message | message
     */
    public UnfinishedTasksException(String message) {
        super("Error: " + message);
    }
    
}
