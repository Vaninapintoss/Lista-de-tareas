/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fileController;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import list.DateList;
import list.SimpleList;
import list.TrackList;
import user.User;
import userLists.Lists;

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
     * 
     * @return String | con informacion del proceso, si fue exitoso o si ocurrio algun error
     * 
     * @see Serializable
     *
     * @author Sofia Brocardo
     */
    public static String saveUsersInFile(String fileName, Map<String, User> map)
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
    
   public static String saveSimpleListsInFile(String fileName, Map<String, SimpleList> map)
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
                SimpleList sl = (SimpleList) entry.getValue();
                objectOutputStream.writeObject(sl);
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
   
   public static String saveDateListsInFile(String fileName, Map<String, DateList> map)
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
                DateList dl = (DateList) entry.getValue();
                objectOutputStream.writeObject(dl);
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
   
   public static String saveTrackListsInFile(String fileName, Map<String, TrackList> map)
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
                TrackList tl = (TrackList) entry.getValue();
                objectOutputStream.writeObject(tl);
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
     * 
     * @return String | con informacion del proceso, si fue exitoso o si ocurrio algun error
     *
     * @see Serializable
     *
     * @author Sofia Brocardo
     */
    public static <V extends Serializable> String saveInFile(String fileName, Set<V> set)
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
     * 
     * @return String | con informacion del proceso, si fue exitoso o si ocurrio algun error
     *
     * @see Serializable
     *
     * @author Sofia Brocardo
     */
    public static <V extends Serializable> String saveInFile(String fileName, List<V> list)
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
     * @author Sofia Brocardo
     */
    public static String readUsersFromFile(String fileName, Map<String,User> map) throws IOException
    {
        String readed = "Extraccion exitosa";

        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        
        File file = new File(fileName);//verifico que exista el archivo
        if(!file.exists())
        {
            //si el archivo no existe lo creo
            file.createNewFile();
        }

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
            readed = "ERROR " + ex.getMessage();
        }
        catch (IOException ex)
        {
            readed = "ERROR " + ex.getMessage();
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
                readed = "ERROR " + exIO.getMessage();
            }

        }
        return readed;
    }
    
    public static String readSimpleListsFromFile(String fileName, Map<String,SimpleList> map) throws IOException
    {
        String readed = "Extraccion exitosa";

        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        
        File file = new File(fileName);//verifico que exista el archivo
        if(!file.exists())
        {
            //si el archivo no existe lo creo
            file.createNewFile();
        }

        try
        {
            fileInputStream = new FileInputStream(fileName);
            objectInputStream = new ObjectInputStream(fileInputStream);

            while(true)
            {
                SimpleList sl = (SimpleList)objectInputStream.readObject();
                map.put(sl.getCategory(), sl);
            }
        }
        catch (EOFException ex)
        {
            readed = "FIN de ARCHIVO";
        }
        catch (ClassNotFoundException ex)
        {
            readed = "ERROR " + ex.getMessage();
        }
        catch (IOException ex)
        {
            readed = "ERROR " + ex.getMessage();
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
                readed = "ERROR " + exIO.getMessage();
            }

        }
        return readed;
    }
    
    public static String readDateListsFromFile(String fileName, Map<String,DateList> map) throws IOException
    {
        String readed = "Extraccion exitosa";

        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        
        File file = new File(fileName);//verifico que exista el archivo
        if(!file.exists())
        {
            //si el archivo no existe lo creo
            file.createNewFile();
        }

        try
        {
            fileInputStream = new FileInputStream(fileName);
            objectInputStream = new ObjectInputStream(fileInputStream);

            while(true)
            {
                DateList dl = (DateList)objectInputStream.readObject();
                map.put(dl.getCategory(), dl);
            }
        }
        catch (EOFException ex)
        {
            readed = "FIN de ARCHIVO";
        }
        catch (ClassNotFoundException ex)
        {
            readed = "ERROR " + ex.getMessage();
        }
        catch (IOException ex)
        {
            readed = "ERROR " + ex.getMessage();
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
                readed = "ERROR " + exIO.getMessage();
            }

        }
        return readed;
    }
    
    public static String readTrackListsFromFile(String fileName, Map<String,TrackList> map) throws IOException
    {
        String readed = "Extraccion exitosa";

        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        
        File file = new File(fileName);//verifico que exista el archivo
        if(!file.exists())
        {
            //si el archivo no existe lo creo
            file.createNewFile();
        }

        try
        {
            fileInputStream = new FileInputStream(fileName);
            objectInputStream = new ObjectInputStream(fileInputStream);

            while(true)
            {
                TrackList tl = (TrackList)objectInputStream.readObject();
                map.put(tl.getCategory(), tl);
            }
        }
        catch (EOFException ex)
        {
            readed = "FIN de ARCHIVO";
        }
        catch (ClassNotFoundException ex)
        {
            readed = "ERROR " + ex.getMessage();
        }
        catch (IOException ex)
        {
            readed = "ERROR " + ex.getMessage();
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
                readed = "ERROR " + exIO.getMessage();
            }

        }
        return readed;
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
     * @see Serializable
     *
     * @author Sofia Brocardo
     */
    public static <V extends Serializable> String readFromFile(String fileName, Collection<V> colection)  throws IOException
    {
        String readed = "Extraccion exitosa";

        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        
        File file = new File(fileName); //verifico que exista el archivo
        if(!file.exists())
        {
            //si el archivo no existe lo creo
            file.createNewFile();
        }

        try
        {
            fileInputStream = new FileInputStream(fileName);
            objectInputStream = new ObjectInputStream(fileInputStream);

            while(true)
            {
                V value = (V)objectInputStream.readObject();
                colection.add((V)value);
            }
        }
        catch (EOFException ex)
        {
            readed = "FIN de ARCHIVO";
        }
        catch (ClassNotFoundException ex)
        {
            readed = "ERROR " + ex.getMessage();
        }
        catch (IOException ex)
        {
            readed = "ERROR " + ex.getMessage();
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
                readed = "ERROR " + exIO.getMessage();
            }

        }
            return readed;
    }
    
}
