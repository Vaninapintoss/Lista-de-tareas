/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package location.Exceptions;

/**
 *
 * @author Vanina Pintos
 */
public class EmptyLocationException extends Exception{

    /**
     * <h1>Excepcion de Localizacion Vacia</h1>
     * @param message 
     */
    public EmptyLocationException(String message) {
        super("Error de localizacion: " + message);
    }
    
}