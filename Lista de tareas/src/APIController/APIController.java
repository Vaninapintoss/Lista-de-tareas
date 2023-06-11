/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package APIController;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author sofia
 */
public class APIController 
{
    public static String getInfo(String urlAPI) throws MalformedURLException, IOException
    {
        String info = "";
        URL url = new URL(urlAPI);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();
        int responseCode = connection.getResponseCode();
        if (responseCode != 200)
        {
            throw new RuntimeException("Codigo de error: "+responseCode);
        }
        else
        {
            StringBuilder stringBuilder = new StringBuilder();
            Scanner scanner = new Scanner(url.openStream());
            while (scanner.hasNext())
            {
                stringBuilder.append(scanner.nextLine());
            }
            scanner.close();
            info = stringBuilder.toString();
        }
        return info;
    }
}
