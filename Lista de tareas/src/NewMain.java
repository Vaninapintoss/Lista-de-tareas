
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
        
        //LISTA SIMPLE
        
        //creacion de una lista simple
        SimpleList sl = new SimpleList("Universidad");
        
        //agregacion de tareas simples a esa lista
        
            //primero creamos la simpleTask
            SimpleTask st1 = new SimpleTask("hacer el tp final");
            //despues la agregamos
            try{
                sl.addTask(st1);
                
            }catch(ElementAlreadyExistException e){
                
                System.out.println(e.getMessage());
            }
            
        //mostramos la lista de tareas simples
        System.out.println(sl.showTasks());   
        
        //marcamos como completada la tarea
        sl.checkTask(st1.getName());
        
        //eliminamos la tarea
        try{
            sl.deleteTask(st1.getName());
            
        }catch(TaskUntilNotCompletedException e){
            
            System.out.println(e.getMessage());
        }
        
        //editamos el nombre de la tarea
        try{
            sl.editTaskName(st1.getName(), "hacer tarea spd");
            
        }catch(EmptyNameTaskException e){
            System.out.println(e.getMessage());
        } catch (ElementAlreadyExistException ex) {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
