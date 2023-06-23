/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package list.task;

import java.io.Serializable;
import java.time.Duration;
import java.time.LocalDateTime;
import static java.time.temporal.TemporalQueries.localDate;

import java.util.Objects;

/**
 * <h1>Clase TrackTask</h1>
 * Guarda la informacion de una tarea de tipo track (nombre, duracion y fecha de inicio) 
 * Se extiende de la clase Task
 * 
 * <b>Note:</b>
 * sus atributos no pueden ser modificados
 * 
 * @author Vanina Pintos & Sofia Brocardo
 */
public class TrackTask extends Task implements Serializable{ 
    private Duration duration;
    private LocalDateTime startDateTime; 

    /**
     * <h1>Constructor de la clase TrackTask</h1>
     * 
     * Unico constructor de la clase DateTask. 
     * Debe recibir un nombre
     * La duracion y la fecha se crean con valor null por defecto
     *  
     * @param name - validar antes de pasar por parametro
     * 
     * @see Task#validName() 
     * 
     * @author Vanina Pintos
     */
    public TrackTask(String name,Duration duration) {
        super(name);
        this.duration = duration;
    }
  
    /**
     * <h1>Obtener tiempo de duracion</h1>
     * 
     * @return Duration | duracion de la tarea
     * 
     * @author Vanina Pintos
     */
    public Duration getDuration(){
        return duration;
    } 
    
    /**
     * Verifica que el objeto sea igual
     * 
     * @param obj
     * 
     * @return boolean | true si son iguales |false si no son iguales 
     * (segun nombre y fecha y hora de comienzo)
     * 
     * @author Vanina Pintos
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TrackTask other = (TrackTask) obj;
        if (!Objects.equals(this.duration, other.duration)) {
            return false;
        }
        return name.equals(other.name);
    }

    /**
     * devuelve el objeto en formato String
     * 
     * @return String | objeto en formato String
     * 
     * @author Vanina Pintos
     */
    @Override
    public String toString() {
        return name+" ............................. tiempo:"+duration.getSeconds()+" seg";
    }
}
