/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user.exceptions;

/**
 *
 * @author Vanina Pintos
 */
public class EmptyEmailException extends Exception{

    /**
     * <h1>Excepcion de Email vacio</h1>
     * @param message 
     */
    public EmptyEmailException(String message) {
        super(message);
    }
    
}