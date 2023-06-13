/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user.exceptions;

/**
 *
 * @author Vanina Pintos
 */
public class InvalidPasswordException extends Exception
{
    /**
     * <h1>Excepcion de Contraseña invalida</h1>
     * @param message 
     */
    public InvalidPasswordException(String message) {
        super(message);
    }
}
