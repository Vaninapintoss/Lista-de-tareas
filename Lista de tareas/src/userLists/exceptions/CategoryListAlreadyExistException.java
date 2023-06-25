/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userLists.exceptions;

/**
 * CategoryListAlreadyExistException
 * @author Vanina Pintos
 */
public class CategoryListAlreadyExistException extends Exception{

    /**
     * Excepcion de categoria ya existente
     * 
     * @param message | message
     */
    public CategoryListAlreadyExistException(String message) {
        super("Error: " + message);
    }
    
}
