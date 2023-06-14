/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package list;

import java.util.HashSet;
import list.task.SimpleTask;

/**
 *
 * @author Vanina Pintos
 */
public class SimpleList<T> extends List<T>{
    private HashSet <SimpleTask> simpleList;

    public SimpleList(String category){
        super(category);
        simpleList = new HashSet<>();
    }    

    @Override
    public void addData(T o) {
        simpleList.add((SimpleTask) o);
    }
    
    public String mostrar(){
        String aux = "";
        
        for(SimpleTask a : simpleList){
            aux += a.toString();
            aux += " - ";
        }
        
        return aux;
    }

    @Override
    public boolean searchData(T o) {
        
        boolean flag = true;
        
        for(SimpleTask a : simpleList){ //se puede mejorar? 
           
            if(a.equals(o)){
                flag = true;
            }
        }
        
        return flag;
    }  
}
