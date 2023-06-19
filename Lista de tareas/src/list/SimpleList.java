/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package list;

import java.util.HashSet;
import java.util.Iterator;
import list.exceptions.ElementAlreadyExistException;
import list.task.SimpleTask;
import list.task.Status;

/**
 *
 * @author vanim
 */
public class SimpleList extends List implements IListActions<SimpleTask>{
    private HashSet <SimpleTask> simpleList;   

    public SimpleList(String category) {
        super(category);
        simpleList = new HashSet<>();
    }  

    @Override
    public boolean addElement(SimpleTask e) throws ElementAlreadyExistException{
        
        boolean added = false; 
        
        if(simpleList.contains(e)){
            throw new ElementAlreadyExistException("tarea ya existente.");
        }else{
            added = true;
            simpleList.add(e);
        }
        
        return added;
    }

    @Override
    public String showElements() {
        String aux ="";
        for(SimpleTask e : simpleList){
            aux += e.toString();
            aux +="";
        }
        return aux;
    }

    @Override
    public boolean checkElement(String name) { 
        
        boolean checked = false;
        
        SimpleTask found = searchElement(name);
        
        if(found != null){
            found.setStatus(Status.COMPLETED);
            checked = true;
        }
        
        return checked;        
    }

    @Override
    public boolean deleteElement(String name) {
        boolean deleted = false;
        
        SimpleTask found = searchElement(name);
        
        if(found != null){
            simpleList.remove(found);
            deleted = true;
        }
        
        return deleted; 
    }

    @Override
    public boolean editNameElement(String name,String newName) { 
        boolean edited = false;
        
        SimpleTask found = searchElement(name);
        
        if(found != null){
            found.setName(name); 
            edited = true;
        }
        
        return edited;
    }

    @Override
    public SimpleTask searchElement(String name) {
        
        SimpleTask found = null; 
        
        Iterator iterator = simpleList.iterator();
        while (iterator.hasNext()) {
            SimpleTask st = (SimpleTask) iterator.next();
            if (st.getName().equals(name)) {
                found = st;
            }
        }
        
        return found;
    }
}
