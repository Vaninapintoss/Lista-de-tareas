package list.task;


import java.util.Objects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Vanina Pintos
 */
public abstract class Task {
    String name;

    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { //se puede setear el nombre?
        this.name = name;
    } 
}
