/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user.exceptions;

/**
 * InvalidPasswordException
 * @author Vanina Pintos
 */
public class InvalidPasswordException extends Exception
{
    /**
     * Excepcion de Contraseña invalida
     * @param message | message
     */
    public InvalidPasswordException(String message) {
        super(message);
    }
}
