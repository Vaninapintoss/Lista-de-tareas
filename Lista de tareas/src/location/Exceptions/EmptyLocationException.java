/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package location.Exceptions;

/**
 * EmptyLocationException
 * @author Sofia Brocardo
 */
public class EmptyLocationException extends Exception{

    /**
     * Excepcion de Localizacion Vacia
     * @param message | message
     */
    public EmptyLocationException(String message) {
        super("Error: " + message);
    }
    
}