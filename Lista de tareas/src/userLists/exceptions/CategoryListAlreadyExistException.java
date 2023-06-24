/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userLists.exceptions;

/**
 *
 * @author Vanina Pintos
 */
public class CategoryListAlreadyExistException extends Exception{

    /**
     * <h1>Excepcion de categoria ya existente</h1>
     * 
     * @param message 
     */
    public CategoryListAlreadyExistException(String message) {
        super("Error: " + message);
    }
    
}
