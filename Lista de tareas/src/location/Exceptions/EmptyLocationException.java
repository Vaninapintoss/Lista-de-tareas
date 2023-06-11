/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package location.Exceptions;

/**
 *
 * @author sofia
 */
public class EmptyLocationException extends Exception{

    public EmptyLocationException(String message) {
        super("Error de localizacion: " + message);
    }
    
}