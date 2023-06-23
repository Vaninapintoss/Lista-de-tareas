
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import list.SimpleList;
import list.exceptions.ElementAlreadyExistException;
import list.exceptions.TaskUntilNotCompletedException;
import list.task.SimpleTask;
import list.task.exceptions.EmptyNameTaskException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

//MAIN DE PRUEBA

public class NewMain {

    public static void main(String[] args) {
        
        //captura de hora de inicio
        LocalDateTime start = LocalDateTime.now();
        
        //captura de hora de finalizacion
        LocalDateTime finish = LocalDateTime.now();
        
        //guardado de datos para la creacion de la tarea
        Duration duration = Duration.between(start, finish);        
        
        //para poder imprimir duration
        long hours = duration.toHours();
        long minutes = duration.toMinutes() % 60;
        long seconds = duration.getSeconds() % 60;
        
    }
    
}
