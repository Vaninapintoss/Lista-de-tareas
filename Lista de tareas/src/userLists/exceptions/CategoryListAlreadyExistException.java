/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userLists.exceptions;

/**
 *
 * @author vanim
 */
public class CategoryListAlreadyExistException extends Exception{

    public CategoryListAlreadyExistException(String message) {
        super("Error: " + message);
    }
    
}
