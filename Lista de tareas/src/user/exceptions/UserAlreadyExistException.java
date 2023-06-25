/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user.exceptions;

/**
 * UserAlreadyExistException
 * @author Vanina Pintos
 */
public class UserAlreadyExistException extends Exception{

    /**
     * Excepcion de Usuario ya existente
     * @param message | message
     */
    public UserAlreadyExistException(String message) {
        super(message);
    }
}