/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weather;

import java.io.IOException;
import location.Exceptions.EmptyLocationException;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import APIController.APIController;
import location.Location;

/**
 *
 * @author sofia
 */
public class Weather {
    private String description;
    private String icon;
    private double temp;
    private double temp_min;
    private double temp_max;
    private double humidity;
    private Location location;
    
    /**
     * Constructor de la clase Weather, inicializa todo en 0 o en ""
     */
    public Weather()
    {
        description = ""; 
        icon = "";
        temp = 0;
        temp_min = 0;
        temp_max = 0;
        humidity = 0;
        location = new Location();
    }
    
    
    public String toString()
    {
        return "Descripcion: .......... " + description + "\n" + 
               "Icono: ................ " + icon + "\n" + 
               "Temperatura: .......... " + temp + "\n" + 
               "Temp minima: .......... " + temp_min + "\n" + 
               "Temp maxima: .......... " + temp_max + "\n" + 
               "Humedad: .............. " + humidity + "\n" + 
               "Ubicacion : ........... " + location.getName();
    }
    
    /**
     * getIcon devuelve la ultima descripcion del clima guardada
     * para alcualizar los valores llamar a la funcion updateWeather
     * 
     * @return description
     * @see void#updateWeather(String ciudad, String pais, String APIKey) updateWeather
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * getIcon devuelve el ultimo icono guardado
     * para alcualizar los valores llamar a la funcion updateWeather
     * 
     * @return icon
     * @see void#updateWeather(String ciudad, String pais, String APIKey) updateWeather
     */
    public String getIcon()
    {
        return icon;
    }
    
    /**
     * getTemp devuelve el ultimo nivel de temperatura guardado
     * para alcualizar los valores llamar a la funcion updateWeather
     * 
     * @return temp
     * @see void#updateWeather(String ciudad, String pais, String APIKey) updateWeather
     */
    public double getTemp()
    {
        return temp;
    }
    
    /**
     * getTemp_min devuelve el ultimo nivel de temperatura minima guardado
     * para alcualizar los valores llamar a la funcion updateWeather
     * 
     * @return temp_min
     * @see void#updateWeather(String ciudad, String pais, String APIKey) updateWeather
     */
    public double getTemp_min()
    {
        return temp_min;
    }
    
    /**
     * getTemp_max devuelve el ultimo nivel de temperatura maxima guardado
     * para alcualizar los valores llamar a la funcion updateWeather
     * 
     * @return temp_max
     * @see void#updateWeather(String ciudad, String pais, String APIKey) updateWeather
     */
    public double getTemp_max()
    {
        return temp_max;
    }
    
    /**
     * getHumidity devuelve el ultimo nivel de humedad guardado
     * para alcualizar los valores llamar a la funcion updateWeather
     *
     * @return humidity
     * @see void#updateWeather(String ciudad, String pais, String APIKey) updateWeather
     */
    public double getHumidity()
    {
        return humidity;
    }
            
    /**
     * getCity devuelve la ultima ciudad guardada
     * para alcualizar los valores llamar a la funcion updateWeather
     * 
     * @return city
     * @see void#updateWeather(String ciudad, String pais, String APIKey) updateWeather
     */
    public String getLocation()
    {
        return location.getName();
    }
    
    
    /**
     * updateWeather actualiza los atributos de la clase clima con la API de OpenWeatherMap
     * @param ciudad nombre de ciudad a obtener el clima
     * @param pais nombre de pais donde se encuentra la ciudad
     * @param APIKey incorporar una api key en la pagina de openweathermap
     * @see <a href="https://openweathermap.org/current#one">Open Weather Map</a> 
     */
    public void updateWeather(Location location, String APIKey) throws JSONException, IOException, EmptyLocationException
    {    
        if(!location.isEmpty())
        {
            this.location = location;
            JSONObject jsonObject = new JSONObject(APIController.getInfo("https://api.openweathermap.org/data/2.5/"
                               + "weather?lat="+location.getLat()+"&lon="+location.getLon()+
                                 "&appid="+APIKey+"&units=metric&lang=es"));
            
            updateWithJSON(jsonObject);
        }
        else
        {
            throw new EmptyLocationException("actualizar ubicacion");
        }
        
        
    }
    
    private void updateWithJSON(JSONObject jsonObject)
    {
        JSONArray jsonWeather = jsonObject.getJSONArray("weather");
        JSONObject jsonCaracteristicas = jsonWeather.getJSONObject(0);
        String description = jsonCaracteristicas.getString("description");
        String icon = jsonCaracteristicas.getString("icon");
            
        JSONObject jsonMain = jsonObject.getJSONObject("main");
        double temp = jsonMain.getDouble("temp");
        double temp_min = jsonMain.getDouble("temp_min");
        double temp_max = jsonMain.getDouble("temp_max");
        double humidity = jsonMain.getDouble("humidity");
            
        String city = jsonObject.getString("name");
            
        this.description = description;
        this.icon = icon;
        this.temp = temp;
        this.temp_min = temp_min;
        this.temp_max = temp_max;
        this.humidity = humidity;
    }
    
}
