/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package list.task.exceptions;

/**
 *
 * @author Vanina Pintos
 */
public class EmptyNameTaskException extends Exception{

    /**
     * <h1>Excepcion nombre vacio</h1>
     * @param message 
     */
    public EmptyNameTaskException(String message) {
        super("Error : " + message);
    }
    
}
