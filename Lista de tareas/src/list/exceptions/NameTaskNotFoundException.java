/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package list.exceptions;

/**
 *
 * @author vanim
 */
public class NameTaskNotFoundException extends Exception{

    public NameTaskNotFoundException(String message) {
        super("Error: " + message);
    }
    
}
