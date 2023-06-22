/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package list;

import java.io.Serializable;
import java.util.LinkedList;
import list.task.TrackTask;

/**
 * <h1>Clase TrackList</h1>
 * 
 * Guarda tareas de tipo Track dentro un HashSet
 * Se extiende de la clase List e implementa la interaz IListActions
 * 
 * @author Vanina Pintos 
 */
public class TrackList extends List implements IListActions<TrackTask>, Serializable{

    private LinkedList <TrackTask> trackList;

    /**
     * <h1>Constructor de la clase TrackList</h1>
     * 
     * Unico constructor de la clase TrackList
     * Recibe una categoria por parametro
     * Crea un LinkedList para almacenar las tareas vacio
     * 
     * @param category | verificar que no este repetida antes de enviar
     * 
     * @author Vanina Pintos
     */
    public TrackList(String category) {
        super(category);
        trackList = new LinkedList<>();
    }
    
    /**
     * <h1>Agregar una tarea</h1>
     * 
     * addTask(TrackTask task) recibe una tarea y la agrega al LinkedList
     * 
     * @param task | tarea a agregar
     * 
     * @return boolean | true si lo agrego correctamente a el HashSet
     * 
     * @author Vanina Pintos
     */
    @Override
    public boolean addTask(TrackTask task){
        return trackList.add(task);
    }

    /**
     * <h1>Mostrar tareas</h1>
     * 
     * String showTasks() devuelve las tareas almacenadas en el LinkedList en formato String
     * 
     * @return String | tareas almacenadas en el LinkedList en formato String
     * 
     * @author Vanina Pintos
     */
    @Override
    public String showTasks() {
        String aux ="";
        for(TrackTask e : trackList){
            aux += e.toString();
            aux +="";
        }
        return aux;
    }

    /**
     * <h1>Buscar una tarea</h1>
     * 
     * searchTask(String name) recibe el nombre de la tarea
     * a buscar y si se encuentra dentro del LinkedList lo retorna
     * 
     * @param name | nombre de la tarea a buscar
     * 
     * @return TrackTask | la tarea encontrada dentro del LinkedList | null
     * si no eixste dentro del LinkedList
     * 
     * @author Vanina Pintos
     */
    @Override
    public TrackTask searchTask(String name) {
        TrackTask found = null; 
        
        for(TrackTask tt : trackList){
            if (tt.getName().equals(name)) {
                found = tt;
            }
        }
        
        return found;
    }
}
