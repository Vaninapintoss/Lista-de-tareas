/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package location.Exceptions;

/**
 *
 * @author Sofia Brocardo
 */
public class InvalidLocationException extends Exception{

    /**
     * <h1>Excepcion de Localizacion invalida</h1>
     * @param message 
     */
    public InvalidLocationException (String message) {
        super(message);
    }
}