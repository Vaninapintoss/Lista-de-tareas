/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;

import java.util.LinkedHashMap;
import user.exceptions.EmptyEmailException;
import user.exceptions.EmptyPasswordException;
import user.exceptions.IncorrectPasswordException;
import user.exceptions.InvalidEmailException;
import user.exceptions.InvalidPasswordException;
import user.exceptions.UserAlreadyExistException;
import user.exceptions.UserNotFoundException;
import fileController.FileController;
import java.io.IOException;


/**
 * Clase UsersSystem
 * 
 * Guarda la informacion de todos los usuarios del sistema en un LinkedHashMap
 * 
 * @author Vanina Pintos y Sofia Brocardo
 */
public class UsersSystem 
{
    private LinkedHashMap <String,User> users;//usuarios del sistema
    private LinkedHashMap <String,User> deletedUsers;//usuarios del sistema
    

    /**
     * Constructor de la clase UsersSystem
     * 
     * Unico constructor de la clase UsersSystem
     * Crea un LinkedHashMap para almacenar los usuarios vacio
     * 
     * @author Vanina Pintos
     */
    public UsersSystem() 
    {
        users = new LinkedHashMap<String, User>();
        deletedUsers = new LinkedHashMap<String, User>();
    }
    
    /**
     * Agregar nuevo usuario
     * Agrega un usuario a el LinkedHashMap
     * 
     * @param user | User a agregar
     * 
     * @return boolean | true si lo agrego correctamente a el LinkedHashMap
     * 
     * @throws UserAlreadyExistException | si el usuario ya existe en el LinkedHashMap
     * 
     * @author Sofia Brocardo
     */
    private boolean newUser(User user) throws UserAlreadyExistException{
        
        boolean flag = false;
        
        if(!(users.containsKey(user.getEmail()))){
            flag = true;
            users.put(user.getEmail(), user); //no utlizo los valores retornados porque no me interesa colocarlo sin antes verificar 
        }else{
            throw new UserAlreadyExistException("El email ingresado ya esta registrado.");
        }
        
        return flag; 
    } 
    
    
    /**
     * Borrar Usuario
     * Elimina un usuario del LinkedHashMap
     * 
     * @param user | usuario a borrar
     * @param password | contraseña para verificar que el mismo usurio se elimina del Map
     * 
     * @return boolean |true si existia, pudo borrarse y la contraseña coincide |false si no se pudo borrar
     * 
     * @throws IncorrectPasswordException | si la contraseña es invalida
     * 
     * @see User#verifyPassword(java.lang.String) 
     * 
     * @author Vanina Pintos
     */
    public boolean deleteUser(User user, String password) throws IncorrectPasswordException
    {
        boolean deleted = false;
        if(user.verifyPassword(password))
        {
            deleted = users.remove(user.getEmail(), user);
            saveUsersInFile();//actualizo el archivo con los usuarios
            
            //lo guardo en un archivo de usuarios eliminados
            deletedUsers.put(user.getEmail(), user);
            FileController.saveUsersInFile("deletedUsers.dat", deletedUsers);
        }
        else
        {
            throw new IncorrectPasswordException("Contraseña invalida");
        }
            
        return deleted;
    }
    
    /**
     * Borrar Usuario eliminado
     * Elimina un usuario del LinkedHashMap
     * 
     * @param user | usuario a borrar
     * 
     * @return boolean |true si existia, pudo borrarse y la contraseña coincide |false si no se pudo borrar
     * 
     * @author Vanina Pintos
     */
    public boolean deleteUserDeleted(User user)
    {
        boolean deleted = false;
        
        deleted = deletedUsers.remove(user.getEmail(), user);
        saveDeletedUsersInFile();//actualizo el archivo con los usuarios
            
        return deleted;
    }
    
    /**
     * Buscar usuario
     * Funcion privada
     * Busca si un email existe entre los usuarios registrados
     * 
     * @param email | email a verificar su existencia dentro del LinkedHashMap
     * 
     * @return User | retorna el usuario si lo encuentra
     * 
     * @throws UserNotFoundException | si no encuentra a un usuario registrado con el mail del parametro
     * 
     * @author Vanina Pintos
     */
    private User searchUser(String email) throws UserNotFoundException{
        User user = null;
        
        if(users.containsKey(email))
            user = users.get(email);
        else
            throw new UserNotFoundException("Error : Usuario no registrado.");
        
        return user;
    }
    
    /**
     * Buscar usuario eliminado
     * Funcion privada
     * Busca si un email existe entre los usuarios registrados
     * 
     * @param email | email a verificar su existencia dentro del LinkedHashMap
     * 
     * @return User | retorna el usuario si lo encuentra
     * 
     * @throws UserNotFoundException | si no encuentra a un usuario registrado con el mail del parametro
     * 
     * @author Vanina Pintos
     */
    public User searchDeletedUser(String email) throws UserNotFoundException{
        User user = null;
        
        if(deletedUsers.containsKey(email))
            user = deletedUsers.get(email);
        else
            throw new UserNotFoundException("Error : Usuario no registrado.");
        
        return user;
    }
    
     
    /**
     * Cambiar contraseña
     * Cambia la contraseña de un usuario a una nueva
     * 
     * @param user | usuario a cambiar contraseña
     * @param oldPassword | contraseña actual para verificar por seguridad
     * @param newPassword | contraseña nueva
     * 
     * @return boolean | true si se cambio correctamente
     * 
     * @throws IncorrectPasswordException | si la oldPassword no coincide con la contraseña actual
     * @throws EmptyPasswordException | si la contraseña nueva contiene un String vacio ""
     * @throws InvalidPasswordException | si la contraseña nueva es invalida
     * 
     * @see User#setPassword(java.lang.String, java.lang.String) 
     * 
     * @author Sofia Brocardo
     */
    public boolean changePassword(User user, String oldPassword, String newPassword) throws IncorrectPasswordException, EmptyPasswordException, InvalidPasswordException
    {
        boolean changed = user.setPassword(oldPassword, newPassword);
        
        return changed;
    }
    
    /**
     * Login
     * Busca si existe en el sistema un usuario con ese email, para luego verificar la contraseña.
     * Si no hay ningun error devuelve el usuario
     * 
     * @param email | email del usuario a loguear
     * @param password | contraseña del usuario a loguear
     * 
     * @return User | devuelve el usuario si esta registrado y la contraseña coincide
     * 
     * @throws UserNotFoundException | si no encuentra a ningun usuario registrado con ese email
     * @throws IncorrectPasswordException | si la contraseña que se paso no coincide con la contraseña del usuario
     * 
     * @see UsersSystem#searchUser(java.lang.String) 
     * @see User#verifyPassword(java.lang.String) 
     * 
     * @author Sofia Brocardo
     */
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
    
    /**
     * Signup
     * Ingresar un nuevo usuario al sistema
     * 
     * @param user | usuario a ingresar 
     * 
     * @return boolean | true si se ingreso al usuario en el sistema sin problemas
     * 
     * @throws UserAlreadyExistException | si el usuario ya existe en el sistema
     * @throws InvalidEmailException | si el email del usuario es invalido
     * @throws EmptyEmailException | si el email contiene un String vacio ""
     * @throws EmptyPasswordException | si la contraseña contiene un String vacio ""
     * @throws InvalidPasswordException | si la contraseña es invalida
     * 
     * @see User#validThisEmail() 
     * @see User#validThisPassword() 
     * @see UsersSystem#newUser(user.User) 
     * 
     * @author Sofia Brocardo
     */
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
    
    /**
     * Guadar Usuarios en Archivo
     * @return String con error o correcto
     */
    public String saveUsersInFile()
    {
        return FileController.saveUsersInFile("users.dat", users);
    }
    
    /**
     * Guadar Usuarios en Archivo
     * @return String con error o correcto
     */
    public String saveDeletedUsersInFile()
    {
        return FileController.saveUsersInFile("deletedUsers.dat", users);
    }
    
    /**
     * Leer Usuarios en Archivo
     * @return String con error o correcto
     * @throws IOException | IOException
     */
    public String readUsersInFile() throws IOException
    {
        return FileController.readUsersFromFile("users.dat", users);
    }
    
    /**
     * Leer Usuarios en Archivo
     * @return String con error o correcto
     * @throws IOException | IOException
     */
    public String readDeletedUsersInFile() throws IOException
    {
        return FileController.readUsersFromFile("deletedUsers.dat", deletedUsers);
    }
    
    /**
     * Modificar Usuario
     * Modifica el usuario y lo guarda en el archivo
     * @param user | user
     */
    public void modifyUser(User user)
    {
        users.put(user.getEmail(), user);
        
        saveUsersInFile();
    }
    
}
