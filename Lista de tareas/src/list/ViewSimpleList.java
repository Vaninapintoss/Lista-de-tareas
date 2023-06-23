/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *<h1>Clase ShowSimpleList</h1>
 * 
 * Almacena en un array list los datos de una lista simple (nombre)
 * con orden alfabetico para una mejor visualizacion
 * 
 * @author Vanina Pintos
 */
public class ViewSimpleList {
    private ArrayList <String> simpleList; 

    /**
     * <h1>Unico constrcutor de la clase</h1>
     * 
     * Crea un array list vacio
     * 
     * @author Vanina Pintos
     */
    public ViewSimpleList() {
        simpleList = new ArrayList<>();
    }
    
    /**
     * <h1>Ordenar alfabeticamente el array list</h1>
     * 
     * void orderAlphabetically(String string) recibe un string comprimido que 
     * contiene todos los datos de una lista simple, los separa y los ordena 
     * alfabeticamente. 
     * 
     * @note 
     * espera recibir el to string de la clase list.SimpleList
     * 
     * @param string | string comprimido con los datos de la lista simple
     * 
     * @author Vanina Pintos
     */
    public void orderAlphabetically(String string){
        separateStringData(string);
        Collections.sort(simpleList);
    }
    
    /**
     * <h1>Separar datos comprimidos en un String</h1>
     * 
     * separateStringData(String string) recibe un string con los datos comprimidos de 
     * la lista y los separa. La separacion de un dato con otro la demarca un "_". 
     * 
     * @param string | string comprimido con los datos de la lista simple
     * 
     * @author Vanina Pintos
     */
    public void separateStringData(String string) {
        String[] array = string.split("_");
        simpleList = new ArrayList<>(Arrays.asList(array));
    }   
}
