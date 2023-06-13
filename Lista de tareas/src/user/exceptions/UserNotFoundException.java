/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user.exceptions;

/**
 *
 * @author Vanina Pintos
 */
public class UserNotFoundException extends Exception{

    /**
     * <h1>Excepcion de Usuario no encontrado</h1>
     * @param message 
     */
    public UserNotFoundException(String message) {
        super("Error: " + message);
    }
}
