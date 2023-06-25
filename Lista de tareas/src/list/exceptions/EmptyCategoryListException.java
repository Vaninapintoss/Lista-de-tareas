/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package list.exceptions;

/**
 * EmptyCategoryListException
 * @author Vanina Pintos
 */
public class EmptyCategoryListException extends Exception{

    /**
     * Excepcion de categoria vacia
     * 
     * @param message | message
     */
    public EmptyCategoryListException(String message) {
        super("Error: " + message);
    }
    
}
