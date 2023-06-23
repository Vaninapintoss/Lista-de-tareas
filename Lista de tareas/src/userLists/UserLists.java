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
    private String filenameSimple; 
    private String filenameDate; 
    private String filenameTrack; 
    private SimpleLists simpleLists;
    private DateLists dateLists;
    private TrackLists trackLists;

    public UserLists(String email) {
        filenameSimple = email+"simple.dat";
        filenameDate = email+"date.dat";
        filenameTrack = email+"track.dat";
        this.simpleLists = new SimpleLists();
        this.dateLists = new DateLists();
        this.trackLists = new TrackLists();
    }
    
    //--------------------------------------------------------------------------SIMPLE
    
    public SimpleLists getSimpleLists()
    {
        return simpleLists;
    }
    
    public DateLists getDateLists()
    {
        return dateLists;
    }
    
    public TrackLists getTrackLists()
    {
        return trackLists;
    }
    
    public void addSimpleList(String category)throws CategoryListAlreadyExistException{
        
        SimpleList sl = new SimpleList(category);
        simpleLists.addList(sl); //exception
        saveSimpleListsInFile(filenameSimple,simpleLists.getHashMap());
    }
    
    public void deleteSimpleList(String category) throws UnfinishedTasksException{
        
        simpleLists.deleteList(category);
        saveSimpleListsInFile(filenameSimple,simpleLists.getHashMap());
    }
    
    public void editSimpleListCategory(String category, String newCategory)  throws EmptyCategoryListException, CategoryListAlreadyExistException{
        simpleLists.editListCategory(category, newCategory);
        saveSimpleListsInFile(filenameSimple,simpleLists.getHashMap());
    }
    
    public void addTaskToSimpleList(String category, String taskName)throws ElementAlreadyExistException{
        
        SimpleTask st = new SimpleTask(taskName);
        simpleLists.getListaSimple(category).addTask(st); //exception
        saveSimpleListsInFile(filenameSimple,simpleLists.getHashMap());
    }
    
    public void checkTaskOfSimpleList(String category, String taskName){
        simpleLists.getListaSimple(category).checkTask(taskName);
        saveSimpleListsInFile(filenameSimple,simpleLists.getHashMap());
    }
    
    public void deleteTaskOfSimpleList(String category, String taskName) throws  TaskUntilNotCompletedException{
        simpleLists.getListaSimple(category).deleteTask(taskName);
        saveSimpleListsInFile(filenameSimple,simpleLists.getHashMap());
    }
    
    public void editTaskNameOfSimpleList(String category, String taskName, String newTaskName)throws EmptyNameTaskException, ElementAlreadyExistException{
        simpleLists.getListaSimple(category).editTaskName(taskName, newTaskName);
        saveSimpleListsInFile(filenameSimple,simpleLists.getHashMap());
    } 
    
    public int howManyTasksSimpleList(String category){
        return simpleLists.getListaSimple(category).howManyTasks();
    }
    
    public String saveSimpleInFile(){
        return saveSimpleListsInFile(filenameSimple,simpleLists.getHashMap());
    }
    
    public String readSimpleFromFile() throws IOException{
        return readSimpleListsFromFile(filenameSimple,simpleLists.getHashMap());
    }
    
    //--------------------------------------------------------------------------DATE
    
    public void addDateList(String category)throws CategoryListAlreadyExistException{
        
        DateList sl = new DateList(category);
        dateLists.addList(sl); //exception
        saveDateListsInFile(filenameDate,dateLists.getHashMap());
    }
    
    public void deleteDateList(String category) throws UnfinishedTasksException{
        
        dateLists.deleteList(category);
        saveDateListsInFile(filenameDate,dateLists.getHashMap());
    }
    
    public void editDateListCategory(String category, String newCategory)  throws EmptyCategoryListException, CategoryListAlreadyExistException{
        dateLists.editListCategory(category, newCategory);
        saveDateListsInFile(filenameDate,dateLists.getHashMap());
    }
    
    public void addTaskToDateList(String category, String taskName,LocalDate date)throws ElementAlreadyExistException{
        
        DateTask dt = new DateTask(taskName,date);
        dateLists.getDateList(category).addTask(dt); //exception
        saveDateListsInFile(filenameDate,dateLists.getHashMap());
    }
    
    public void checkTaskOfDateList(String category, String taskName){
        dateLists.getDateList(category).checkTask(taskName);
        saveDateListsInFile(filenameDate,dateLists.getHashMap());
    }
    
    public void deleteTaskOfDateList(String category, String taskName) throws  TaskUntilNotCompletedException{
        dateLists.getDateList(category).deleteTask(taskName);
        saveDateListsInFile(filenameDate,dateLists.getHashMap());
    }
    
    public void editTaskNameOfDateList(String category, String taskName, String newTaskName)throws EmptyNameTaskException, ElementAlreadyExistException{
        dateLists.getDateList(category).editTaskName(taskName, newTaskName);
        saveDateListsInFile(filenameDate,dateLists.getHashMap());
    }
    
    public int howManyTasksDateList(String category){
        return dateLists.getDateList(category).howManyTasks();
    }
    
    public String saveDateInFile(){
        return saveDateListsInFile(filenameDate,dateLists.getHashMap());
    }
    
    public String readDateFromFile() throws IOException{
        return readDateListsFromFile(filenameDate,dateLists.getHashMap());
    }
    
    //--------------------------------------------------------------------------TRACK
    
    public void addTrackList(String category)throws CategoryListAlreadyExistException{
        
        TrackList tl = new TrackList(category);
        trackLists.addList(tl); //exception
        saveTrackListsInFile(filenameTrack,trackLists.getHashMap());
    }
    
    public void deleteTrackList(String category){
        
        trackLists.deleteList(category);
        saveTrackListsInFile(filenameTrack,trackLists.getHashMap());
    }
    
    public void editTrackListCategory(String category, String newCategory)  throws EmptyCategoryListException, CategoryListAlreadyExistException{
        trackLists.editListCategory(category, newCategory);
        saveTrackListsInFile(filenameTrack,trackLists.getHashMap());
    }
    
    public void addTaskToTrackList(String category, String taskName,Duration duration){
        
        TrackTask dt = new TrackTask(taskName,duration);
        trackLists.getTrackList(category).addTask(dt); //exception
        saveTrackListsInFile(filenameTrack,trackLists.getHashMap());
    }
    
    public int howManyTasksTrackList(String category){
        return trackLists.getTrackList(category).howManyTasks();
    }
    
    public String saveTrackInFile(){
        return saveTrackListsInFile(filenameTrack,trackLists.getHashMap());
    }
    
    public String readTrackFromFile() throws IOException{
        return readTrackListsFromFile(filenameTrack,trackLists.getHashMap());
    }
    
}
