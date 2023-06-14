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
        //la tarea se crea con el estado TODO por defecto
        this.status = Status.TODO;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
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
        final SimpleTask other = (SimpleTask) obj;
        return this.status == other.status;
    }   

    @Override
    public String toString() {
        return super.getName() + status;
    }
}
