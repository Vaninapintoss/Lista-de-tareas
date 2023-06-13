/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user.exceptions;

/**
 *
 * @author Vanina Pintos
 */
public class EmptyPasswordException extends Exception{

    /**
     * <h1>Excepcion de Contraseña Vacia</h1>
     * @param message 
     */
    public EmptyPasswordException(String message) {
        super("Error: " + message);
    }
   
}