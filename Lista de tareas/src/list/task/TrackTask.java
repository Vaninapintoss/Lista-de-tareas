/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package list.task;

import java.io.Serializable;

import java.util.Objects;

/**
 * Clase TrackTask
 * 
 * Guarda la informacion de una tarea de tipo track (nombre y duracion) 
 * Se extiende de la clase Task
 * Sus atributos no pueden ser modificados
 * 
 * @author Vanina Pintos y Sofia Brocardo
 */
public class TrackTask extends Task implements Serializable{ 
    private String duration; 

    /**
     * Constructor de la clase TrackTask
     * 
     * Unico constructor de la clase DateTask
     * Debe recibir un nombre que debe ser validado antes de enviarse
     * Debe recibr una duracion
     *  
     * @param name - validar antes de pasar por parametro
     * @param duration - duracion 
     * 
     * @see Task#validName(String name) 
     * 
     * @author Vanina Pintos
     */
    public TrackTask(String name,String duration) {
        super(name);
        this.duration = duration;
    }
  
    /**
     * Obtener tiempo de duracion
     * 
     * @return Duration | duracion de la tarea
     * 
     * @author Vanina Pintos
     */
    public String getDuration(){
        return duration;
    } 
    
    /**
     * Verifica que el objeto sea igual (segun nombre)
     * 
     * @param obj | obj
     * 
     * @return boolean | true si son iguales |false si no son iguales 
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
     * Devuelve el objeto en formato String
     * 
     * @return String | objeto en formato String
     * 
     * @author Vanina Pintos
     */
    @Override
    public String toString() {
        int spaceN = 120 - (name.length()+duration.length());
        String space = " ";
        for(int i=0; i<spaceN; i++)
        {
            space+=" ";
        }
        return name+space+duration;
    }
}
