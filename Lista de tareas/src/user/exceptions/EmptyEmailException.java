/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user.exceptions;

/** 
 * EmptyEmailException
 * @author Vanina Pintos
 */
public class EmptyEmailException extends Exception{

    /**
     * Excepcion de Email vacio
     * @param message | message
     */
    public EmptyEmailException(String message) {
        super(message);
    }
    
}