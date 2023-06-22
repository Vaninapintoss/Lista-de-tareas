/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package list.task;

import java.io.Serializable;
import java.time.Duration;
import java.time.LocalDateTime;
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
    public TrackTask(String name) {
        super(name);
        this.duration = null;
        this.startDateTime = null;
    }
      
    /**
     * <h1>Comenzar temporizador</h1>
     * 
     * startTimer() captura la fecha y la hora cuando se comienza la tarea 
     * y se lo asigna al atributo de fecha
     * 
     * @author Vanina Pintos
     */
    public void startTimer(){
        startDateTime = LocalDateTime.now();
    }
    
    /**
     * <h1>Terminar temporizador</h1>
     * 
     * finishTimer() captura la fecha y hora cuando se termina la tarea,
     * saca la diferencia entre esta y la fechahora de inicio y la asigna
     * al atributo duracion
     * 
     * @author Vanina Pintos
     */
    public void finishTimer(){
        setDuration(Duration.between(startDateTime, LocalDateTime.now()));
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
     * <h1>Cambiar duracion</h1>
     * 
     * setDuration(Duration duration) actualiza la duracion de la tarea
     * 
     * @param duration | actualizacion de duracion
     * 
     * @author Vanina Pintos
     */
    private void setDuration(Duration duration){
        this.duration = duration; 
    }
    
    /**
     * <h1>Obtener fecha y hora de comienzo</h1>
     * 
     * @return LocalDateTime | fecha y hora de comienzo de la tarea
     * 
     * @author Vanina Pintos
     */
    public LocalDateTime getStartDate(){
        return startDateTime;
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
        return name.equals(other.name) && (startDateTime.compareTo(other.startDateTime)==0);
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
        return name + " - " + duration + " - " + startDateTime;
    }
}
