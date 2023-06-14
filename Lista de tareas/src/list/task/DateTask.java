package list.task;


import java.util.Date;
import java.util.Objects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author soyva
 */
public class DateTask extends Task{
    private Status status;
    Date finalDate; 

    public DateTask(Status status, Date finalDate, String name) {
        super(name);
        this.status = Status.TODO;
        this.finalDate = finalDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(Date finalDate) {
        this.finalDate = finalDate;
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
        final DateTask other = (DateTask) obj;
        if (this.status != other.status) {
            return false;
        }
        return Objects.equals(this.finalDate, other.finalDate);
    }

    @Override
    public String toString() {
        return super.getName() + finalDate + status;
    }
    
    
}
