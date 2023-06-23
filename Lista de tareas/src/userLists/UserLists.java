/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userLists;

import list.SimpleList;
import list.exceptions.ElementAlreadyExistException;
import list.exceptions.EmptyCategoryListException;
import list.exceptions.TaskUntilNotCompletedException;
import list.task.SimpleTask;
import list.task.exceptions.EmptyNameTaskException;
import userLists.exceptions.CategoryListAlreadyExistException;
import userLists.exceptions.UnfinishedTasksException;

public class UserLists {
    private String filename; 
    private SimpleLists simpleLists;
    private DateLists dateLists;
    private TrackLists trackLists;

    public UserLists(String filename) {
        this.filename = filename+"lists.dat";
        this.simpleLists = new SimpleLists();
        this.dateLists = new DateLists();
        this.trackLists = new TrackLists();
    }
    
    public void addSimpleList(String category)throws CategoryListAlreadyExistException{
        
        SimpleList sl = new SimpleList(category);
        simpleLists.addList(sl); //exception
    }
    
    public void deleteSimpleList(String category) throws UnfinishedTasksException{
        
        simpleLists.deleteList(category);
    }
    
    public void editSimpleListCategory(String category, String newCategory)  throws EmptyCategoryListException, CategoryListAlreadyExistException{
        simpleLists.editListCategory(category, newCategory);
    }
    
    public void addTaskToSimpleList(String category, String taskName)throws ElementAlreadyExistException{
        
        SimpleTask st = new SimpleTask(taskName);
        simpleLists.getListaSimple(category).addTask(st); //exception
    }
    
    public void checkTaskOfSimpleList(String category, String taskName){
        simpleLists.getListaSimple(category).checkTask(taskName);
    }
    
    public void deleteTaskOfSimpleList(String category, String taskName) throws  TaskUntilNotCompletedException{
        simpleLists.getListaSimple(category).deleteTask(taskName);
    }
    
    public void editTaskNameOfSimpleList(String category, String taskName, String newTaskName)throws EmptyNameTaskException, ElementAlreadyExistException{
        simpleLists.getListaSimple(category).editTaskName(taskName, newTaskName);
    }
    
    public int howManyTasksSimpleList(String category){
        return simpleLists.getListaSimple(category).howManyTasks();
    }
}
