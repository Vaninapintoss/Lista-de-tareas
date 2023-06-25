/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user.exceptions;

/**
 * UserNotFoundException
 * @author Vanina Pintos
 */
public class UserNotFoundException extends Exception{

    /**
     * Excepcion de Usuario no encontrado
     * @param message | message
     */
    public UserNotFoundException(String message) {
        super(message);
    }
}
