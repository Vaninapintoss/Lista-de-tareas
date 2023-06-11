/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package location;

import APIController.APIController;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author sofia
 */
public class Location 
{
    private double lat;
    private double lon;
    private String name;
    
    public Location()
    {
        lat = 0;
        lon = 0;
        name = "";
    }
    
    public boolean isEmpty()
    {
        boolean empty = false;
        
        if(name.isEmpty())
            empty = true;
        
        return empty;
    }
    
    //sobrecargar la funcion updateLocation    
    
    public void updateLocation(String city, String state_province, String country) throws IOException
    {
        city.replaceAll(" ","%20" );
        state_province.replaceAll(" ","%20" );
        country.replaceAll(" ","%20" );
        String urlAPI = "https://geocode.maps.co/search?q="+city+","+state_province+","+country;
        
        JSONArray jsonArray = new JSONArray(APIController.getInfo(urlAPI));
        
        updateWithJSON(jsonArray);
    }
    
    private void updateWithJSON(JSONArray jsonArray)
    {
        JSONObject jsonObject = jsonArray.getJSONObject(0);
        lat = jsonObject.getDouble("lat");
        lon = jsonObject.getDouble("lon");
        name = jsonObject.getString("display_name");
    }
    
    public double getLat()
    {
        return lat;
    }
    
    public double getLon()
    {
        return lon;
    }
    
    public String getName()
    {
        return name;
    }
    
}
