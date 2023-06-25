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
import list.DateList;
import list.SimpleList;
import list.TrackList;
import list.exceptions.ElementAlreadyExistException;
import list.exceptions.EmptyCategoryListException;
import list.exceptions.TaskUntilNotCompletedException;
import list.task.DateTask;
import list.task.Fecha;
import list.task.SimpleTask;
import list.task.TrackTask;
import list.task.exceptions.EmptyNameTaskException;
import userLists.exceptions.CategoryListAlreadyExistException;
import userLists.exceptions.UnfinishedTasksException;


/**
 * Clase UserLists
 * 
 * Clase envoltorio que contiene la lista de listas de tareas y sus funciones
 * 
 * @author Vanina Pintos Y Sofia Brocardo
 */
public class UserLists {
    private String filenameSimple; 
    private String filenameDate; 
    private String filenameTrack; 
    private SimpleLists simpleLists;
    private DateLists dateLists;
    private TrackLists trackLists;

    /**
     * Constructor de la clase UserLists
     * 
     * Recibe un email del usuario que ingresa para poder 
     * tener acceso a sus archivos y crea las listas vacias
     * 
     * @param email | email del usuario 
     */
    public UserLists(String email) {
        filenameSimple = email+"simple.dat";
        filenameDate = email+"date.dat";
        filenameTrack = email+"track.dat";
        this.simpleLists = new SimpleLists();
        this.dateLists = new DateLists();
        this.trackLists = new TrackLists();
    }
    
    /**
     * Obtener listas simples
     * 
     * @return SimpleLists
     * 
     */
    public SimpleLists getSimpleLists()
    {
        return simpleLists;
    }
    
    /**
     * Obtener listas con fecha
     * 
     * @return DateLists
     * 
     */
    public DateLists getDateLists()
    {
        return dateLists;
    }
    
    /**
     * Obtener listas de traqueo
     * 
     * @return TrackLists
     */
    public TrackLists getTrackLists()
    {
        return trackLists;
    }
    
    //--------------------------------------------------------------------------SIMPLE
    
    /**
     * Agregar una lista simple
     * 
     * @param category | categoria de nueva lista
     * 
     * @throws CategoryListAlreadyExistException | si la lista ya existe 
     */
    public void addSimpleList(String category)throws CategoryListAlreadyExistException{
        
        SimpleList sl = new SimpleList(category);
        simpleLists.addList(sl); //exception
        saveSimpleListsInFile(filenameSimple,simpleLists.getHashMap());
    }
    
    /**
     * Borrar una lista simple
     * 
     * @param category | categoria de la lista a borrar
     * 
     * @throws UnfinishedTasksException | si la lista contiene tareas sin finalizar
     */
    public void deleteSimpleList(String category) throws UnfinishedTasksException{
        
        simpleLists.deleteList(category);
        saveSimpleListsInFile(filenameSimple,simpleLists.getHashMap());
    }
    
    /**
     * Editar la categoria de una lista simple
     * 
     * @param category | categoria de la lista a editar
     * 
     * @param newCategory | nuevo nombre de categoria a asignar
     * 
     * @throws EmptyCategoryListException | si la categoria enviada se trata de un string vacio
     * @throws CategoryListAlreadyExistException | si la categoria que se le quiere asignar 
     * ya esta en uso
     */
    public void editSimpleListCategory(String category, String newCategory)  throws EmptyCategoryListException, CategoryListAlreadyExistException{
        simpleLists.editListCategory(category, newCategory);
        saveSimpleListsInFile(filenameSimple,simpleLists.getHashMap());
    }
    
    /**
     * Agregar una tarea simple
     * 
     * @param category | categoria de la lista en la que se quiere agregar la tarea
     * @param taskName | nombre de la tarea a agregar
     * 
     * @throws ElementAlreadyExistException | si la tarea ya existe dentro de la lista
     */
    public void addTaskToSimpleList(String category, String taskName)throws ElementAlreadyExistException{
        
        SimpleTask st = new SimpleTask(taskName);
        simpleLists.getListaSimple(category).addTask(st); //exception
        saveSimpleListsInFile(filenameSimple,simpleLists.getHashMap());
    }
    
    /**
     * Marcar como completada una tarea simple
     * 
     * @param category | categoria de la lista donde se encuentra la tarea
     * @param taskName | nombre de la tarea a marcar como completada
     */
    public void checkTaskOfSimpleList(String category, String taskName){
        simpleLists.getListaSimple(category).checkTask(taskName);
        saveSimpleListsInFile(filenameSimple,simpleLists.getHashMap());
    }
    
    /**
     * Eliminar una tarea simple
     * 
     * @param category | categoria de la lista en la que se encuentra la tarea
     * @param taskName | mombre de la tarea a eliminar
     * 
     * @throws TaskUntilNotCompletedException | si la tarea no fue competada
     */
    public void deleteTaskOfSimpleList(String category, String taskName) throws  TaskUntilNotCompletedException{
        simpleLists.getListaSimple(category).deleteTask(taskName);
        saveSimpleListsInFile(filenameSimple,simpleLists.getHashMap());
    }
    
    /**
     * Editar el nombre de una tarea simple
     * 
     * @param category | categoria de la lista en donde se encuentra la tarea 
     * @param taskName | nombre de la tarea a modificar
     * @param newTaskName | nuevo nombre a asignar
     * 
     * @throws EmptyNameTaskException | si el nuevo nombre se trata de un string vacio
     * @throws ElementAlreadyExistException | si el nuevo nombre ya esta en uso
     */
    public void editTaskNameOfSimpleList(String category, String taskName, String newTaskName)throws EmptyNameTaskException, ElementAlreadyExistException{
        simpleLists.getListaSimple(category).editTaskName(taskName, newTaskName);
        saveSimpleListsInFile(filenameSimple,simpleLists.getHashMap());
    } 
    
    /**
     * Cantidad de tareas de una lista simple
     * 
     * @param category | categoria de la lista de la cual se desea saber
     * cuantas tareas almacena
     * @return int | cantidad de tareas existentes en la lista
     */
    public int howManyTasksSimpleList(String category){
        return simpleLists.howManyLists();
    }
    
    /**
     * Guardar lista de listas de tareas simples
     * @return String | informacion de guardado
     */
    public String saveSimpleInFile(){
        return saveSimpleListsInFile(filenameSimple,simpleLists.getHashMap());
    }
    
    /**
     * Guardar lista de listas de tareas simples
     * @return String | informacion de guardado
     * @throws IOException | si hubo algun error al tratar de leer el archivo
     */
    public String readSimpleFromFile() throws IOException{
        return readSimpleListsFromFile(filenameSimple,simpleLists.getHashMap());
    }
    
    //--------------------------------------------------------------------------DATE
    
    /**
     * Agregar una lista con fecha
     * 
     * @param category | categoria de nueva lista
     * 
     * @throws CategoryListAlreadyExistException | si la lista ya existe 
     */
    public void addDateList(String category)throws CategoryListAlreadyExistException{
        
        DateList sl = new DateList(category);
        dateLists.addList(sl); //exception
        saveDateListsInFile(filenameDate,dateLists.getHashMap());
    }
    
    
     /**
     * Borrar una lista con fecha
     * 
     * @param category | categoria de la lista a borrar
     * 
     * @throws UnfinishedTasksException | si la lista contiene tareas sin finalizar
     */
    public void deleteDateList(String category) throws UnfinishedTasksException{
        
        dateLists.deleteList(category);
        saveDateListsInFile(filenameDate,dateLists.getHashMap());
    }
    
    /**
     * Editar la categoria de una lista con fecha
     * 
     * @param category | categoria de la lista a editar
     * 
     * @param newCategory | nuevo nombre de categoria a asignar
     * 
     * @throws EmptyCategoryListException | si la categoria enviada se trata de un string vacio
     * @throws CategoryListAlreadyExistException | si la categoria que se le quiere asignar 
     * ya esta en uso
     */
    public void editDateListCategory(String category, String newCategory)  throws EmptyCategoryListException, CategoryListAlreadyExistException{
        dateLists.editListCategory(category, newCategory);
        saveDateListsInFile(filenameDate,dateLists.getHashMap());
    }
    
    /**
     * Agregar una tarea con fecha
     * 
     * @param category | categoria de la lista en la que se quiere agregar la tarea
     * @param taskName | nombre de la tarea a agregar
     * @param date | date
     * 
     * @throws ElementAlreadyExistException | si la tarea ya existe dentro de la lista
     */
    public void addTaskToDateList(String category, String taskName,Fecha date)throws ElementAlreadyExistException{
        
        DateTask dt = new DateTask(taskName,date);
        dateLists.getDateList(category).addTask(dt); //exception
        saveDateListsInFile(filenameDate,dateLists.getHashMap());
    }
    
    /**
     * Marcar como completada una tarea con fecha
     * 
     * @param category | categoria de la lista donde se encuentra la tarea
     * @param taskName | nombre de la tarea a marcar como completada
     */
    public void checkTaskOfDateList(String category, String taskName){
        dateLists.getDateList(category).checkTask(taskName);
        saveDateListsInFile(filenameDate,dateLists.getHashMap());
    }
    
    /**
     * Eliminar una tarea con fecha
     * 
     * @param category | categoria de la lista en la que se encuentra la tarea
     * @param taskName | mombre de la tarea a eliminar
     * 
     * @throws TaskUntilNotCompletedException | si la tarea no fue competada
     */
    public void deleteTaskOfDateList(String category, String taskName) throws  TaskUntilNotCompletedException{
        dateLists.getDateList(category).deleteTask(taskName);
        saveDateListsInFile(filenameDate,dateLists.getHashMap());
    }
    
    /**
     * Editar el nombre de una tarea con fecha
     * 
     * @param category | categoria de la lista en donde se encuentra la tarea 
     * @param taskName | nombre de la tarea a modificar
     * @param newTaskName | nuevo nombre a asignar
     * 
     * @throws EmptyNameTaskException | si el nuevo nombre se trata de un string vacio
     * @throws ElementAlreadyExistException | si el nuevo nombre ya esta en uso
     */
    public void editTaskNameOfDateList(String category, String taskName, String newTaskName)throws EmptyNameTaskException, ElementAlreadyExistException{
        dateLists.getDateList(category).editTaskName(taskName, newTaskName);
        saveDateListsInFile(filenameDate,dateLists.getHashMap());
    }
    
    /**
     * Cantidad de tareas de una lista con fecha
     * 
     * @param category | categoria de la lista de la cual se desea saber
     * cuantas tareas almacena
     * @return int | cantidad de tareas existentes en la lista
     */
    public int howManyTasksDateList(String category){
        return dateLists.howManyLists();
    }
    
    /**
     * Guardar lista de listas de tareas con fecha
     * @return String | informacion de guardado
     */
    public String saveDateInFile(){
        return saveDateListsInFile(filenameDate,dateLists.getHashMap());
    }
    
    /**
     * Guardar lista de listas de tareas con fecha
     * @return String | informacion de guardado
     * @throws IOException | si hubo algun error al tratar de leer el archivo
     */
    public String readDateFromFile() throws IOException{
        return readDateListsFromFile(filenameDate,dateLists.getHashMap());
    }
    
    //--------------------------------------------------------------------------TRACK
    
    /**
     * Agregar una lista de traqueo
     * 
     * @param category | categoria de nueva lista
     * @throws CategoryListAlreadyExistException | si la lista ya existe 
     */
    public void addTrackList(String category)throws CategoryListAlreadyExistException{
        
        TrackList tl = new TrackList(category);
        trackLists.addList(tl); //exception
        saveTrackListsInFile(filenameTrack,trackLists.getHashMap());
    }
    
    /**
     * Borrar una lista de traqueo
     * 
     * @param category | categoria de la lista a borrar
     */
    public void deleteTrackList(String category){
        
        trackLists.deleteList(category);
        saveTrackListsInFile(filenameTrack,trackLists.getHashMap());
    }
    
    /**
     * Editar la categoria de una lista con traqueo
     * 
     * @param category | categoria de la lista a editar
     * 
     * @param newCategory | nuevo nombre de categoria a asignar
     * 
     * @throws EmptyCategoryListException | si la categoria enviada se trata de un string vacio
     * @throws CategoryListAlreadyExistException | si la categoria que se le quiere asignar 
     * ya esta en uso
     */
    public void editTrackListCategory(String category, String newCategory)  throws EmptyCategoryListException, CategoryListAlreadyExistException{
        trackLists.editListCategory(category, newCategory);
        saveTrackListsInFile(filenameTrack,trackLists.getHashMap());
    }
    
    /**
     * Agregar una tarea de traqueo
     * 
     * @param category | categoria de la lista en la que se quiere agregar la tarea
     * @param taskName | nombre de la tarea a agregar
     * @param duration | duration
     * 
     */
    public void addTaskToTrackList(String category, String taskName,String duration){
        
        TrackTask dt = new TrackTask(taskName,duration);
        trackLists.getTrackList(category).addTask(dt); //exception
        saveTrackListsInFile(filenameTrack,trackLists.getHashMap());
    }
    
    /**
     * Cantidad de tareas de una lista de traqueo
     * 
     * @param category | categoria de la lista de la cual se desea saber
     * cuantas tareas almacena
     * @return int | cantidad de tareas existentes en la lista
     */
    public int howManyTasksTrackList(String category)
    {
        
        return trackLists.howManyLists();
    }
    
    /**
     * Guardar lista de listas de tareas de traqueo
     * @return String | informacion de guardado
     */
    public String saveTrackInFile(){
        return saveTrackListsInFile(filenameTrack,trackLists.getHashMap());
    }
    
    /**
     * Guardar lista de listas de tareas simples de traqueo
     * @return String | informacion de guardado
     * @throws IOException | si hubo algun error al tratar de leer el archivo
     */
    public String readTrackFromFile() throws IOException{
        return readTrackListsFromFile(filenameTrack,trackLists.getHashMap());
    }
}
