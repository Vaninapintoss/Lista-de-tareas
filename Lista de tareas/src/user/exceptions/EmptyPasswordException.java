/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user.exceptions;

/**
 * EmptyPasswordException
 * @author Vanina Pintos
 */
public class EmptyPasswordException extends Exception{

    /**
     * Excepcion de Contraseña Vacia
     * @param message | message
     */
    public EmptyPasswordException(String message) {
        super(message);
    }
   
}