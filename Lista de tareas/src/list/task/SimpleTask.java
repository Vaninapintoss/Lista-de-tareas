package list.task;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author soyva
 */
public class SimpleTask extends Task{
    private Status status;

    public SimpleTask(String name) {
        super(name);
        this.status = Status.TODO;
    }

    public Status getStatus() {
        return status;
    }
   
    public void setStatus(Status status) {
        this.status = status;
    } 

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
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
        final SimpleTask other = (SimpleTask) obj;
        return name.equals(other.name);
    }
    
    @Override
    public String toString() {
        return name + " - " + status;
    }
}
