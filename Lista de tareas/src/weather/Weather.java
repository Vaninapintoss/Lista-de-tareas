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
 * Clima
 * La clase clima tiene los datos de descripcion, icono (para poder usar en interfaz grafica),
 * temperatura, temperatura minima, temperatura maxima, humedad y ubicacion del usuario
 * 
 * @author Sofia Brocardo
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
     * Constructor vacio
     * Inicializa todo en 0 o en ""
     * 
     * @author Sofia Brocardo
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
    
    /**
     * To String
     * 
     * @return String con los datos del clima
     * 
     * @author Sofia Brocardo
     */
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
     * Obtener la ultima descripcion del clima guardada
     * Para alcualizar los valores llamar a la funcion updateWeather
     * 
     * @return String | descripcion del clima
     * 
     * @see void#updateWeather(String ciudad, String pais, String APIKey) updateWeather
     * 
     * @author Sofia Brocardo
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * Obtener el ultimo icono guardado
     * Para alcualizar los valores llamar a la funcion updateWeather
     * 
     * @return String | nombre del icono del clima
     * 
     * @see void#updateWeather(String ciudad, String pais, String APIKey) updateWeather
     * 
     * @author Sofia Brocardo
     */
    public String getIcon()
    {
        return icon;
    }
    
    /**
     * Obtener el ultimo nivel de temperatura guardado
     * Para alcualizar los valores llamar a la funcion updateWeather
     * 
     * @return double | temperatura (Cº)
     * 
     * @see void#updateWeather(String ciudad, String pais, String APIKey) updateWeather
     * 
     * @author Sofia Brocardo
     */
    public double getTemp()
    {
        return temp;
    }
    
    /**
     * Obtener el ultimo nivel de temperatura minima guardado
     * Para alcualizar los valores llamar a la funcion updateWeather
     * 
     * @return double | temperatura minima (Cº)
     * 
     * @see void#updateWeather(String ciudad, String pais, String APIKey) updateWeather
     * 
     * @author Sofia Brocardo
     */
    public double getTemp_min()
    {
        return temp_min;
    }
    
    /**
     * Obtener el ultimo nivel de temperatura maxima guardado
     * Para alcualizar los valores llamar a la funcion updateWeather
     * 
     * @return double | temperatura maxima (Cº)
     * 
     * @see void#updateWeather(String ciudad, String pais, String APIKey) updateWeather
     * 
     * @author Sofia Brocardo
     */
    public double getTemp_max()
    {
        return temp_max;
    }
    
    /**
     * Obtener el ultimo nivel de humedad guardado
     * Para alcualizar los valores llamar a la funcion updateWeather
     *
     * @return double | niveles de humedad
     * 
     * @see void#updateWeather(String ciudad, String pais, String APIKey) updateWeather
     * 
     * @author Sofia Brocardo
     */
    public double getHumidity()
    {
        return humidity;
    }
            
    /**
     * Obtener la ultima localizacion guardada
     * Para alcualizar los valores llamar a la funcion updateWeather
     * 
     * @return String | localizacion
     * 
     * @see void#updateWeather(String ciudad, String pais, String APIKey) updateWeather
     * 
     * @author Sofia Brocardo
     */
    public String getLocation()
    {
        return location.getName();
    }
    
    
    /**
     * Actualizar el clima
     * 
     * Los atributos de la clase clima  se actualizan con la API de OpenWeatherMap
     * 
     * @param location | localizacion actual a obtener el clima
     * @param APIKey | API key personal de la pagina de openweathermap
     * 
     * @see <a href="https://openweathermap.org/current#one">Open Weather Map</a> 
     * @see Weather#updateWithJSON(org.json.JSONObject) 
     * 
     * @throws JSONException | si hay problemas con el JSON
     * @throws IOException | si hay problemas con la API
     * @throws EmptyLocationException | si la localizacion esta vacia
     * 
     * @author Sofia Brocardo
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
            throw new EmptyLocationException("Actualizar ubicacion");
        }
        
    }
    
    /**
     * Actualizar con JSON
     * Metodo privado
     * Se actualizan los atributos de la clase Weather con los datos del JSON
     * 
     * @param jsonObject 
     * 
     * @author Sofia Brocardo
     */
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
