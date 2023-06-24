/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package list.exceptions;

/**
 *
 * @author Vanina Pintos
 */
public class EmptyCategoryListException extends Exception{

    /**
     * <h1>Excepcion de categoria vacia</h1>
     * 
     * @param message 
     */
    public EmptyCategoryListException(String message) {
        super("Error: " + message);
    }
    
}
