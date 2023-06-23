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
 *
 * @author vanim
 */
public class ViewDateList {
    private ArrayList <String> dateList;

    public ViewDateList() {
        dateList = new ArrayList <>();
    }   
    
    public void orderByDate(String string){
        separateStringData(string);
        Collections.sort(dateList);
    }
    
    public void separateStringData(String string) {
        String[] array = string.split("_");
        dateList = new ArrayList<>(Arrays.asList(array));
    } 
}
