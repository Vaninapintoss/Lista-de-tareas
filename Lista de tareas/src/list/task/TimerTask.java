package list.task;


import java.util.Date;
import java.util.Objects;
import java.util.Timer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author soyva
 */
public class TimerTask extends Task{
    Timer duration; //?
    Date date;

    public TimerTask(Timer duration, Date date, String name) {
        super(name);
        this.duration = duration; //se inicia en 0
        this.date = date; //recibe la local
    }

    public Timer getDuration() {
        return duration;
    }

    public void setDuration(Timer duration) {
        this.duration = duration;
    }

    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return Objects.equals(this.date, other.date);
    }

    @Override
    public String toString() {
        return super.getName() + duration + date; 
        
    }
}
