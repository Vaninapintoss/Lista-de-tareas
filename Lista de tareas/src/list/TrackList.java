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
     * Recibe una categoria por parametro que debe ser validada y verificar que no
     * este repetida antes de ser enviada
     * Crea un LinkedList para almacenar las tareas vacio
     * 
     * @param category | verificar y validar antes de ser enviada
     * 
     * @see List#validCategory(String) 
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
     * @return boolean | true tarea agregada | false no se pudo agregar la tarea
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
            aux +="_";
        }
        return aux;
    }

    /**
     * <h1>Buscar una tarea</h1>
     * 
     * searchTask(String name) recibe el nombre de la tarea
     * a buscar y si se encuentra dentro del LinkedList la retorna
     * 
     * @param name | nombre de la tarea a buscar
     * 
     * @return TrackTask | la tarea encontrada | null tarea no encontrada
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
    
    /**
     * <h1>Cantidad de tareas</h1>
     * 
     * @return int | cantidad de tareas almacenadas en la coleccion
     * 
     * @author Vanina Pintos
     */
    @Override
    public int howManyTasks() {
        return trackList.size();
    }
}
