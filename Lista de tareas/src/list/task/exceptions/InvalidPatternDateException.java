/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package list.task.exceptions;

/**
 *
 * @author vanim
 */
public class InvalidPatternDateException extends Exception{

    public InvalidPatternDateException(String message) {
        super("Error : " + message);
    }
    
    
}
