/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package list;

import java.util.HashSet;
import java.util.Iterator;
import list.exceptions.ElementAlreadyExistException;
import list.task.DateTask;
import list.task.SimpleTask;
import list.task.Status;

/**
 *
 * @author vanim
 */
public class DateList extends List implements IListActions<DateTask>{
    private HashSet <DateTask> dateList;

    public DateList(String category) {
        super(category);
        dateList = new HashSet<>();
    }

    @Override
    public boolean addElement(DateTask e) throws ElementAlreadyExistException {
        boolean added = false; 
        
        if(dateList.contains(e)){
            throw new ElementAlreadyExistException("tarea ya existente.");
        }else{
            added = true;
            dateList.add(e);
        }
        
        return added;
    }

    @Override
    public String showElements() {
        String aux ="";
        for(DateTask e : dateList){
            aux += e.toString();
            aux +="";
        }
        return aux;
    }

    @Override
    public boolean checkElement(String name) {
        boolean checked = false;
        
        DateTask found = searchElement(name);
        
        if(found != null){
            found.setStatus(Status.COMPLETED);
            checked = true;
        }
        
        return checked;
    }

    @Override
    public boolean deleteElement(String name) {
        boolean deleted = false;
        
        DateTask found = searchElement(name);
        
        if(found != null){
            dateList.remove(found);
            deleted = true;
        }
        
        return deleted;    
    }

    @Override
    public boolean editNameElement(String name, String newName) {
        boolean edited = false;
        
        DateTask found = searchElement(name);
        
        if(found != null){
            found.setName(name); 
            edited = true;
        }
        
        return edited;   
    }

    @Override
    public DateTask searchElement(String name) {
        DateTask found = null; 
        
        Iterator iterator = dateList.iterator();
        while (iterator.hasNext()) {
            DateTask st = (DateTask) iterator.next();
            if (st.getName().equals(name)) {
                found = st;
            }
        }
        
        return found;
    }

    public boolean elementsWereChecked() {
        for(DateTask st : dateList){
            if(st.getStatus() == Status.TODO){
                return false;
            }
        }
        
        return  true;
    }
}
