/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user.exceptions;

/**
 *
 * @author Vanina Pintos
 */
public class UserAlreadyExistException extends Exception{

    /**
     * <h1>Excepcion de Usuario ya existente</h1>
     * @param message 
     */
    public UserAlreadyExistException(String message) {
        super("Error: " + message);
    }
}