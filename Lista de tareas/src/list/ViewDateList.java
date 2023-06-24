/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package list;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *<h1>Clase ViewDateList</h1>
 * 
 * Almacena en un array list los datos de una lista date (nombre y fecha)
 * con orden por fecha para una mejor visualizacion
 * 
 * @author Vanina Pintos
 */
public class ViewDateList {
    private ArrayList <String> dateList;

    /**
     * <h1>Unico constrcutor de la clase ViewDateList</h1>
     * 
     * Crea un array list vacio
     * 
     * @author Vanina Pintos
     */
    public ViewDateList() {
        dateList = new ArrayList <>();
    }   
    
    /**
     * <h1>Ordenar alfabeticamente el array list</h1>
     * 
     * orderAlphabetically(String string) recibe un string comprimido que 
     * contiene todos los datos de una lista simple, los separa y los ordena 
     * alfabeticamente. 
     * 
     * @note 
     * espera recibir el to string de la clase list.DateList
     * 
     * @param string | string comprimido con los datos de la lista date
     * 
     * @author Vanina Pintos
     */
    public void orderByDate(String string){
        separateStringData(string);
        Collections.sort(dateList);
    }
    
    /**
     * <h1>Separar datos comprimidos en un String</h1>
     * 
     * separateStringData(String string) recibe un string con los datos comprimidos de 
     * la lista, los separa y los almacena dento del array list
     * La separacion de un dato con otro la demarca un "_"
     * 
     * @param string | string comprimido con los datos de la lista date
     * 
     * @author Vanina Pintos
     */
    public void separateStringData(String string) {
        String[] array = string.split("_");
        dateList = new ArrayList<>(Arrays.asList(array));
    } 
}
