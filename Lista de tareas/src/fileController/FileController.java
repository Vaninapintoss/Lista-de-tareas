/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fileController;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import user.User;

/**
 * <h1>Clase controladora de archivos</h1>
 * 
 * En esta clase se encuentran las funciones necesarias para guardar colecciones
 * en archivos, y pasar informacion de archivos a colecciones 
 * 
 * Los metodos saveInFile y readFromFile estan sobrescritas para colecciones Set,
 * Map y List
 * 
 * @author Sofia Brocardo
 */
public class FileController 
{
    
    /**
     * <h1>Guardar Map en un archivo</h1>
     * Guarda el mapa en un archivo, cuyo nombre es pasado por parametro
     * 
     * @param fileName | nombre del archivo
     * @param map | Map, su valor debe implementar Serializable
     * @return String | con informacion del proceso, si fue exitoso o si ocurrio algun error
     * 
     * @see Serializable#this
     * 
     * @author Sofia Brocardo
     */
    public static String saveInFile(String fileName, Map<K,V> map) <V extends Serializable, K>
    {
        String saved = "Se guardo correctamente";
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        
        try
        {
            fileOutputStream = new FileOutputStream(fileName);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            
            Iterator it = map.entrySet().iterator();
            
           while(it.hasNext())
            {
                Map.Entry entry = (Map.Entry) it.next();
                User user = (User) entry.getValue();
                objectOutputStream.writeObject(user);
            }
        }
        catch(IOException ex)
        {
            saved = "ERROR EN EL ARCHIVO";
        }
        finally {
            try
            {
                if (fileOutputStream != null)
                    fileOutputStream.close();

                if (objectOutputStream != null)
                    objectOutputStream.close();

            }
            catch (IOException exIO)
            {
                saved = exIO.getMessage()+" Problemas al cerrar el archivo";
            }
        }
        
        return saved;
    }
    
    /**
     * <h1>Guardar Set en un archivo</h1>
     * Guarda la coleccion Set en un archivo, cuyo nombre es pasado por parametro
     * 
     * @param fileName | nombre del archivo
     * @param set | Set, su valor debe implementar Serializable
     * @return String | con informacion del proceso, si fue exitoso o si ocurrio algun error
     * 
     * @see Serializable#this
     * 
     * @author Sofia Brocardo
     */
    public static String saveInFile(String fileName, Set<V> set) <V extends Serializable>
    {
        String saved = "Se guardo correctamente";
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        
        try
        {
            fileOutputStream = new FileOutputStream(fileName);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            
            Iterator it = set.iterator();
            
           while(it.hasNext())
            {
                objectOutputStream.writeObject(it.next());
            }
        }
        catch(IOException ex)
        {
            saved = "ERROR EN EL ARCHIVO";
        }
        finally {
            try
            {
                if (fileOutputStream != null)
                    fileOutputStream.close();

                if (objectOutputStream != null)
                    objectOutputStream.close();

            }
            catch (IOException exIO)
            {
                saved = exIO.getMessage()+" Problemas al cerrar el archivo";
            }
        }
        
        return saved;
    }
    
    /**
     * <h1>Guardar List en un archivo</h1>
     * Guarda la coleccion List en un archivo, cuyo nombre es pasado por parametro
     * 
     * @param fileName | nombre del archivo
     * @param list | List, su valor debe implementar Serializable
     * @return String | con informacion del proceso, si fue exitoso o si ocurrio algun error
     * 
     * @see Serializable#this
     * 
     * @author Sofia Brocardo
     */
     public static String saveInFile(String fileName, List<V> list) <V extends Serializable>
    {
        String saved = "Se guardo correctamente";
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        
        try
        {
            fileOutputStream = new FileOutputStream(fileName);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            
           for(V aux : list)
           {
               objectOutputStream.writeObject(aux);
           }
        }
        catch(IOException ex)
        {
            saved = "ERROR EN EL ARCHIVO";
        }
        finally {
            try
            {
                if (fileOutputStream != null)
                    fileOutputStream.close();

                if (objectOutputStream != null)
                    objectOutputStream.close();

            }
            catch (IOException exIO)
            {
                saved = exIO.getMessage()+" Problemas al cerrar el archivo";
            }
        }
        
        return saved;
    }
    
    /**
     * <h1>Leer Map de un archivo</h1>
     * Guarda la informacion del archivo en un map
     * 
     * @param fileName | nombre del archivo con la info a guardar
     * @param map | mapa donde almacenar la informacion, su valor debe implementar Serializable
     * 
     * @return String | con informacion del proceso, si fue exitoso o si ocurrio algun error
     * 
     * @see Serializable#this
     * 
     * @author Sofia Brocardo
     */
    public static String readFromFile(String fileName, Map<K,V> map) <V extends Serializable, K>
    {
        String readed = "Extraccion exitosa";
        
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        try
        {
            fileInputStream = new FileInputStream(fileName);
            objectInputStream = new ObjectInputStream(fileInputStream);

            while(true)
            {
                User user = (User)objectInputStream.readObject();
                map.put(user.getEmail(), user);
            }
        }
        catch (EOFException ex)
        {
            readed = "FIN de ARCHIVO";
        }
        catch (ClassNotFoundException ex)
        {
            readed = "ERROR" + ex.getMessage();
        }
        catch (IOException ex)
        {
            readed = "ERROR" + ex.getMessage();
        }
        finally
        {
            try
            {
                if (fileInputStream!=null)
                    fileInputStream.close();

                if (objectInputStream!=null)
                    objectInputStream.close();

            }
            catch (IOException exIO)
            {
                readed = "ERROR" + ex.getMessage();
            }

        }
    }
    
    /**
     * <h1>Leer Coleccion de un archivo</h1>
     * Guarda la informacion del archivo en una Coleccion
     * 
     * @param fileName | nombre del archivo con la info a guardar
     * @param colection | coleccion donde almacenar la informacion, su valor debe implementar Serializable
     * 
     * @return String | con informacion del proceso, si fue exitoso o si ocurrio algun error
     * 
     * @see Serializable#this
     * 
     * @author Sofia Brocardo
     */
    public static String readFromFile(String fileName, Collection<V> colection) <V extends Serializable>
    {
        String readed = "Extraccion exitosa";
        
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        try
        {
            fileInputStream = new FileInputStream(fileName);
            objectInputStream = new ObjectInputStream(fileInputStream);

            while(true)
            {
                User user = (User)objectInputStream.readObject();
                colection.put(user);
            }
        }
        catch (EOFException ex)
        {
            readed = "FIN de ARCHIVO";
        }
        catch (ClassNotFoundException ex)
        {
            readed = "ERROR" + ex.getMessage();
        }
        catch (IOException ex)
        {
            readed = "ERROR" + ex.getMessage();
        }
        finally
        {
            try
            {
                if (fileInputStream!=null)
                    fileInputStream.close();

                if (objectInputStream!=null)
                    objectInputStream.close();

            }
            catch (IOException exIO)
            {
                readed = "ERROR" + ex.getMessage();
            }

        }
    }
    
}
