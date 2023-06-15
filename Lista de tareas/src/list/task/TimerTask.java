/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package list.task;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 *
 * @author vanim
 */
public class TimerTask extends Task{ 
    private Duration duration;
    private LocalDateTime startDateTime; 

    public TimerTask(String name) {
        super(name);
        this.duration = null;
        this.startDateTime = null;
    }
      
    public void startTimer(){
        startDateTime = LocalDateTime.now();
    }
    
    public void finishTimer(){
        setDuration(Duration.between(startDateTime, LocalDateTime.now()));
    }
    
    public Duration getDuration(){
        return duration;
    }
    
    public void setDuration(Duration duration){
        this.duration = duration; 
    }
    
    public LocalDateTime getStartDate(){
        return startDateTime;
    }    

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
        final TimerTask other = (TimerTask) obj;
        if (!Objects.equals(this.duration, other.duration)) {
            return false;
        }
        return name.equals(other.name) && (startDateTime.compareTo(other.startDateTime)==0);
    }

    @Override
    public String toString() {
        return name + " - " + duration + " - " + startDateTime;
    }
}
