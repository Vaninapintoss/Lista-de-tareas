/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package list.exceptions;

/**
 *
 * @author vanim
 */
public class EmptyCategoryListException extends Exception{

    public EmptyCategoryListException(String message) {
        super("Error: " + message);
    }
    
}
