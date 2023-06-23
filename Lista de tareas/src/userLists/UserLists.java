/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userLists;

import static fileController.FileController.readDateListsFromFile;
import static fileController.FileController.readSimpleListsFromFile;
import static fileController.FileController.readTrackListsFromFile;
import static fileController.FileController.saveDateListsInFile;
import static fileController.FileController.saveSimpleListsInFile;
import static fileController.FileController.saveTrackListsInFile;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import list.DateList;
import list.SimpleList;
import list.TrackList;
import list.exceptions.ElementAlreadyExistException;
import list.exceptions.EmptyCategoryListException;
import list.exceptions.TaskUntilNotCompletedException;
import list.task.DateTask;
import list.task.SimpleTask;
import list.task.TrackTask;
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
    
    //--------------------------------------------------------------------------DATE
    
    public void addDateList(String category)throws CategoryListAlreadyExistException{
        
        DateList sl = new DateList(category);
        dateLists.addList(sl); //exception
        saveDateListsInFile(filename,dateLists.getHashMap());
    }
    
    public void deleteDateList(String category) throws UnfinishedTasksException{
        
        dateLists.deleteList(category);
        saveDateListsInFile(filename,dateLists.getHashMap());
    }
    
    public void editDateListCategory(String category, String newCategory)  throws EmptyCategoryListException, CategoryListAlreadyExistException{
        dateLists.editListCategory(category, newCategory);
        saveDateListsInFile(filename,dateLists.getHashMap());
    }
    
    public void addTaskToDateList(String category, String taskName,LocalDate date)throws ElementAlreadyExistException{
        
        DateTask dt = new DateTask(taskName,date);
        dateLists.getDateList(category).addTask(dt); //exception
        saveDateListsInFile(filename,dateLists.getHashMap());
    }
    
    public void checkTaskOfDateList(String category, String taskName){
        dateLists.getDateList(category).checkTask(taskName);
        saveDateListsInFile(filename,dateLists.getHashMap());
    }
    
    public void deleteTaskOfDateList(String category, String taskName) throws  TaskUntilNotCompletedException{
        dateLists.getDateList(category).deleteTask(taskName);
        saveDateListsInFile(filename,dateLists.getHashMap());
    }
    
    public void editTaskNameOfDateList(String category, String taskName, String newTaskName)throws EmptyNameTaskException, ElementAlreadyExistException{
        dateLists.getDateList(category).editTaskName(taskName, newTaskName);
        saveDateListsInFile(filename,dateLists.getHashMap());
    }
    
    public int howManyTasksDateList(String category){
        return dateLists.getDateList(category).howManyTasks();
    }
    
    public String saveDateInFile(){
        return saveDateListsInFile(filename,dateLists.getHashMap());
    }
    
    public String readDateFromFile() throws IOException{
        return readDateListsFromFile(filename,dateLists.getHashMap());
    }
    
    //--------------------------------------------------------------------------TRACK
    
    public void addTrackList(String category)throws CategoryListAlreadyExistException{
        
        TrackList tl = new TrackList(category);
        trackLists.addList(tl); //exception
        saveTrackListsInFile(filename,trackLists.getHashMap());
    }
    
    public void deleteTrackList(String category){
        
        trackLists.deleteList(category);
        saveTrackListsInFile(filename,trackLists.getHashMap());
    }
    
    public void editTrackListCategory(String category, String newCategory)  throws EmptyCategoryListException, CategoryListAlreadyExistException{
        trackLists.editListCategory(category, newCategory);
        saveTrackListsInFile(filename,trackLists.getHashMap());
    }
    
    public void addTaskToTrackList(String category, String taskName,Duration duration){
        
        TrackTask dt = new TrackTask(taskName,duration);
        trackLists.getTrackList(category).addTask(dt); //exception
        saveTrackListsInFile(filename,trackLists.getHashMap());
    }
    
    public int howManyTasksTrackList(String category){
        return trackLists.getTrackList(category).howManyTasks();
    }
    
    public String saveTrackInFile(){
        return saveTrackListsInFile(filename,trackLists.getHashMap());
    }
    
    public String readTrackFromFile() throws IOException{
        return readTrackListsFromFile(filename,trackLists.getHashMap());
    }
    
}
