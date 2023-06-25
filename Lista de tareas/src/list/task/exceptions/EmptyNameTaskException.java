/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package list.task.exceptions;

/**
 * EmptyNameTaskException
 * @author Vanina Pintos
 */
public class EmptyNameTaskException extends Exception{

    /**
     * Excepcion nombre vacio
     * @param message | message
     */
    public EmptyNameTaskException(String message) {
        super("Error : " + message);
    }
    
}
