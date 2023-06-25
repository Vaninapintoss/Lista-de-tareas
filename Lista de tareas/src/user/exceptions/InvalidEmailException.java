/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user.exceptions;

/**
 * InvalidEmailException
 * @author Vanina Pintos
 */
public class InvalidEmailException extends Exception{

    /**
     * Excepcion de Email invalido
     * @param message | message
     */
    public InvalidEmailException(String message) {
        super(message);
    }
}