/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user.exceptions;

/**
 * IncorrectPasswordException
 * @author Vanina Pintos
 */
public class IncorrectPasswordException extends Exception{

    /**
     * Excepcion de Contraseña incorrecta
     * @param message |message
     */
    public IncorrectPasswordException(String message) {
        super(message);
    }
}
