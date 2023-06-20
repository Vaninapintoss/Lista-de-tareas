/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package list;

import java.util.LinkedList;
import list.task.DateTask;
import list.task.TrackTask;

/**
 *
 * @author vanim
 */
public class TrackList extends List implements IListActions<TrackTask>{

    private LinkedList <TrackTask> trackList;

    public TrackList(String category) {
        super(category);
        trackList = new LinkedList<>();
    }
    
    @Override
    public boolean addElement(TrackTask e){
        return trackList.add(e);
    }

    @Override
    public String showElements() {
        String aux ="";
        for(TrackTask e : trackList){
            aux += e.toString();
            aux +="";
        }
        return aux;
    }

    @Override
    public boolean checkElement(String name) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean deleteElement(String name) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean editNameElement(String name, String newName) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public TrackTask searchElement(String name) {
        TrackTask found = null; 
        
        for(TrackTask tt : trackList){
            if (tt.getName().equals(name)) {
                found = tt;
            }
        }
        
        return found;
    }
}
