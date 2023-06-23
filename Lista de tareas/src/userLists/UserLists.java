/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userLists;

import static fileController.FileController.readSimpleListsFromFile;
import static fileController.FileController.saveSimpleListsInFile;
import java.io.IOException;
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
    
    //--------------------------------------------------------------------------SIMPLE
    
    public SimpleLists getSimpleLists()
    {
        return simpleLists;
    }
    
    public void addSimpleList(String category)throws CategoryListAlreadyExistException{
        
        SimpleList sl = new SimpleList(category);
        simpleLists.addList(sl); //exception
        saveSimpleListsInFile(filename,simpleLists.getHashMap());
    }
    
    public void deleteSimpleList(String category) throws UnfinishedTasksException{
        
        simpleLists.deleteList(category);
        saveSimpleListsInFile(filename,simpleLists.getHashMap());
    }
    
    public void editSimpleListCategory(String category, String newCategory)  throws EmptyCategoryListException, CategoryListAlreadyExistException{
        simpleLists.editListCategory(category, newCategory);
        saveSimpleListsInFile(filename,simpleLists.getHashMap());
    }
    
    public void addTaskToSimpleList(String category, String taskName)throws ElementAlreadyExistException{
        
        SimpleTask st = new SimpleTask(taskName);
        simpleLists.getListaSimple(category).addTask(st); //exception
        saveSimpleListsInFile(filename,simpleLists.getHashMap());
    }
    
    public void checkTaskOfSimpleList(String category, String taskName){
        simpleLists.getListaSimple(category).checkTask(taskName);
        saveSimpleListsInFile(filename,simpleLists.getHashMap());
    }
    
    public void deleteTaskOfSimpleList(String category, String taskName) throws  TaskUntilNotCompletedException{
        simpleLists.getListaSimple(category).deleteTask(taskName);
        saveSimpleListsInFile(filename,simpleLists.getHashMap());
    }
    
    public void editTaskNameOfSimpleList(String category, String taskName, String newTaskName)throws EmptyNameTaskException, ElementAlreadyExistException{
        simpleLists.getListaSimple(category).editTaskName(taskName, newTaskName);
        saveSimpleListsInFile(filename,simpleLists.getHashMap());
    }
    
    public int howManyTasksSimpleList(String category){
        return simpleLists.getListaSimple(category).howManyTasks();
    }
    
   public String saveSimpleInFile(){
        return saveSimpleListsInFile(filename,simpleLists.getHashMap());
    }
    
    public String readSimpleFromFile() throws IOException{
        return readSimpleListsFromFile(filename,simpleLists.getHashMap());
    }
}
