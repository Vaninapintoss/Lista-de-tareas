/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import user.exceptions.EmptyEmailException;
import user.exceptions.EmptyPasswordException;
import user.exceptions.IncorrectPasswordException;
import user.exceptions.InvalidEmailException;
import user.exceptions.InvalidPasswordException;
import user.exceptions.UserAlreadyExistException;
import user.exceptions.UserNotFoundException;

/**
 * <h1>Clase UsersSystem</h1>
 * 
 * Guarda la informacion de todos los usuarios del sistema en un LinkedHashMap
 * 
 * @author Vanina Pintos & Sofia Brocardo
 */
public class UsersSystem 
{
    private LinkedHashMap <String,User> users;//usuarios del sistema

    /**
     * <h1>Constructor de la clase UsersSystem</h1>
     * 
     * Unico constructor de la clase UsersSystem
     * Crea un LinkedHashMap para almacenar los usuarios vacio
     * 
     * @author Vanina Pintos
     */
    public UsersSystem() 
    {
        users = new LinkedHashMap<String, User>();
    }
    
    // AGREGAR USUARIO 
    private boolean newUser(User user) throws UserAlreadyExistException{
        
        boolean flag = false;
        
        if(!(users.containsKey(user.getEmail()))){
            flag = true;
            users.put(user.getEmail(), user); //no utlizo los valores retornados porque no me interesa colocarlo sin antes verificar 
        }else{
            throw new UserAlreadyExistException("Error : El email ingresado ya esta registrado.");
        }
        
        return flag;
        
    } //TRUE si pudo insertarse - ERROR si ya existia anteriormente
    
    //BORRAR USUARIO 
    public boolean deleteUser(User user, String password) throws IncorrectPasswordException
    {
        boolean deleted = false;
        if(user.verifyPassword(password))
        {
            deleted = users.remove(user.getEmail(), user);
        }
        else
        {
            throw new IncorrectPasswordException("Error: contraseña invalida");
        }
            
        return deleted;

    }//TRUE si existia, pudo borrarse y la contraseña coincide, FALSE si no se pudo borrar
    //ERROR si la contraseña es invalida
    
    //BUSCAR USUARIO
    private User searchUser(String email) throws UserNotFoundException{
        User user = null;
        
        if(users.containsKey(email))
            user = users.get(email);
        else
            throw new UserNotFoundException("Error : Usuario no registrado.");
        
        return user;
    }//Devuelve el usuario si esta registrado, ERROR si no esta registrado
    
    //funcion de prueba de carga de usuarios
    public String viewUsers(){
        String aux = "";
        Iterator it = users.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry me = (Map.Entry) it.next();
            aux += me.getKey() + "-" + me.getValue();
            aux += "\n";
        }
        return aux;
    }
    
    //CAMBIAR CONTRASENIA 
    public boolean changePassword(User user, String oldPassword, String newPassword) throws IncorrectPasswordException, EmptyPasswordException, InvalidPasswordException
    {
        boolean changed = user.setPassword(oldPassword, newPassword);
        
        return changed;
    }
    
    
    public User login(String email, String password) throws UserNotFoundException, IncorrectPasswordException
    {    
        User user = null; 
        
        //busca usuario
        user = searchUser(email);
        
        //contraseña valida
        if(!user.verifyPassword(password))    
            throw new IncorrectPasswordException("Error: contraseña invalida");
        
        return user;
    }  
    
    public boolean signup(User user) throws UserAlreadyExistException, InvalidEmailException, EmptyEmailException,
                                            EmptyPasswordException, InvalidPasswordException
    {
        boolean success = false;
        
        
        //valido que el mail y la contraseña sean validos
        if(user.validThisEmail() && user.validThisPassword())
            //ingreso el usuario
            success = newUser(user);//si lo ingresa devuelve true, si ya existe tira excepcion       
        
        return success;
    }
    
    public String saveUsersInFile()
    {
        String rta = "Se guardo correctamente";
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try
        {
            fileOutputStream = new FileOutputStream("users.dat");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            
            Iterator it = users.entrySet().iterator();
            
           while(it.hasNext())
            {
                Map.Entry entry = (Map.Entry) it.next();
                User user = (User) entry.getValue();
                objectOutputStream.writeObject(user);
            }

        }
        catch (IOException ex)
        {
            rta = "ERROR EN EL ARCHIVO";
        }
        finally {
            try
            {
                if((fileOutputStream != null) && (objectOutputStream != null))
                {
                    fileOutputStream.close();
                    objectOutputStream.close();
                }

            }
            catch (IOException exIO)
            {
                rta = exIO.getMessage()+" Problemas al cerrar el archivo";
            }
        }
        return rta;
    }
    
    
    public void readUsersInFile()
    {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        try
        {
            fileInputStream = new FileInputStream("users.dat");
            objectInputStream = new ObjectInputStream(fileInputStream);

            while(true)
            {
                User user = (User)objectInputStream.readObject();
                users.put(user.getEmail(), user);
            }
        }
        catch (IOException exception)
        {

        }
        catch (ClassNotFoundException ex)
        {

        }
        finally
        {
            try
            {
                if((fileInputStream != null) && (objectInputStream != null))
                {
                    fileInputStream.close();
                    objectInputStream.close();
                }

            }
            catch (IOException exIO)
            {

            }

        }
    }
    
}
