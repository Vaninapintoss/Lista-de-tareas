/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package location;

import APIController.APIController;
import java.io.IOException;
import java.io.Serializable;
import java.net.MalformedURLException;
import location.Exceptions.InvalidLocationException;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *<h1>Clase Location</h1>
 * Almacena la latitud y longitud, junto con el nombre de una localizacion
 * 
 * @author Sofia Brocardo
 */
public class Location implements Serializable
{
    private double lat;
    private double lon;
    private String name;
    
    
    /**
     * <h1>Constructor vacio</h1>
     * 
     * @author Sofia Brocardo
     */
    public Location()
    {
        lat = 0;
        lon = 0;
        name = "";
    }
    
    /**
     * <h1>Funcion que determina si tiene datos</h1>
     * 
     * @return boolean | true si esta vacio | false si tiene datos
     * 
     * @author Sofia Brocardo
     */
    public boolean isEmpty()
    {
        boolean empty = false;
        
        if(name.isEmpty())
            empty = true;
        
        return empty;
    }
    
        
    /**
     * <h1>Actualizar Localizacion</h1>
     * Obtiene las coordenadas y el nombre del lugar de una API
     * 
     * @param city | ciudad, esta se puede especificar con un barrio separado por una coma, ej: barrio,ciudad
     * @param state_province | estado o provincia
     * @param country | pais
     * 
     * @see <a href="https://geocode.maps.co">Free Geocoding API</a> 
     * @see APIController#getInfo(java.lang.String) 
     * 
     * @throws IOException | si algo sale mal con la API
     * @throws InvalidLocationException | si no se encuentra ninguna localizacion con ese nombre
     * 
     * @author Sofia Brocardo
     */
    public void updateLocation(String city, String state_province, String country) throws IOException, InvalidLocationException
    {
        city.replaceAll(" ","%20" );
        state_province.replaceAll(" ","%20" );
        country.replaceAll(" ","%20" );
        String urlAPI = "https://geocode.maps.co/search?q="+city+","+state_province+","+country;
        
        JSONArray jsonArray = new JSONArray(APIController.getInfo(urlAPI));
        
        if(jsonArray.isEmpty())
        {
            //si el jsonArray esta vacio significa que la localizacion no existe
            throw new InvalidLocationException("Localizacion invalida");
        }
        
        updateWithJSON(jsonArray);
    }
    
    /**
     * <h1>Actualizar datos con JSON</h1>
     * Siempre guarda solo los datos del primer elemento del array
     * 
     * @param jsonArray | JSONArray con los datos de la localizacion
     * 
     * @author Sofia Brocardo
     */
    private void updateWithJSON(JSONArray jsonArray)
    {
        JSONObject jsonObject = jsonArray.getJSONObject(0);
        lat = jsonObject.getDouble("lat");
        lon = jsonObject.getDouble("lon");
        name = jsonObject.getString("display_name");
    }
    
    /**
     * <h1>Obtener Latitud</h1>
     * 
     * @return latitud
     * 
     * @author Sofia Brocardo
     */
    public double getLat()
    {
        return lat;
    }
    
    /**
     * <h1>Obtener Longitud</h1>
     * 
     * @return longitud
     * 
     * @author Sofia Brocardo
     */
    public double getLon()
    {
        return lon;
    }
    
    /**
     * <h1>Obtener nombre</h1>
     * 
     * @return nombre de la localizacion
     * 
     * @author Sofia Brocardo
     */
    public String getName()
    {
        return name;
    }
    
}
