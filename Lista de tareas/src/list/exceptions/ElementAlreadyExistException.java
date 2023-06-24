/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package list.exceptions;

/**
 *
 * @author Vanina Pintos
 */
public class ElementAlreadyExistException extends Exception{

    /**
     * <h1>Excepcion de elemento repetido</h1>
     * 
     * @param message 
     */
    public ElementAlreadyExistException(String message) {
        super("Error: " + message);
    }
    
}
