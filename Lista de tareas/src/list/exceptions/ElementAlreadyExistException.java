/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package list.exceptions;

/**
 * ElementAlreadyExistException
 * @author Vanina Pintos
 */
public class ElementAlreadyExistException extends Exception{

    /**
     * Excepcion de elemento repetido
     * 
     * @param message | message
     */
    public ElementAlreadyExistException(String message) {
        super("Error: " + message);
    }
    
}
