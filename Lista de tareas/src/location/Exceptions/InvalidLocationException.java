/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package location.Exceptions;

/**
 * InvalidLocationException
 * @author Sofia Brocardo
 */
public class InvalidLocationException extends Exception{

    /**
     * Excepcion de Localizacion invalida
     * @param message | message
     */
    public InvalidLocationException (String message) {
        super("Error: " + message);
    }
}