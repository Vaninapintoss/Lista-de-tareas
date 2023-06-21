/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;

import java.io.IOException;
import java.io.Serializable;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import location.Exceptions.InvalidLocationException;
import location.Location;
import user.exceptions.EmptyEmailException;
import user.exceptions.EmptyPasswordException;
import user.exceptions.InvalidEmailException;
import user.exceptions.InvalidPasswordException;

/**
 * <h1>Clase User</h1>
 * Guarda la informacion escencial del usuario 
 * como su email, contraseña y localizacion 
 * 
 * <b>Note:</b>
 * su contraseña y localizacion pueden ser modificados
 * 
 * @author Vanina Pintos & Sofia Brocardo
 */
public class User  implements Serializable {
    private String email;//email debe contener un @, y un .
    private String password;//la contraseña debe tener al menos 8 letras, 1 numero y 1 letra
    private Location location;//ubicacion actual del usuario
    
    /**
     * <h1>Constructor de la clase User</h1>
     * 
     * Usar este constructor si:
     * Su localizacion no es necesaria a la hora de crear el usuario
     * Debe recibir un email y una contraseña
     *  
     * @param email - validar antes de pasar por parametro
     * @param password - validar antes de pasar por parametro
     * 
     * @see User#validEmail(String) 
     * @see User#validPassword()
     * 
     * @author Vanina Pintos
     */
    public User(String email, String password)
    {
        this.email = email;
        this.password = password;
        this.location = new Location();
    }
    
    /**
     * <h1>Constructor completo de la clase User</h1>
     * 
     * Debe recibir un email ya validado, una contraseña y localizacion ya validada
     * 
     * Su localizacion debe ser un string compusto por una ciudad y un pais como minimo todo separado por coma
     * Si la localizacion tiene mas detalles, como por ejemplo barrio y provincia estos deben estar separados 
     * con coma y en orden ascendente, por ejemplo:
     * "Barrio,Ciudad,Provincia,Pais"
     * 
     * @param email | validar antes de pasar por parametro
     * @param password | validar antes de pasar por parametro
     * @param location | localizacion actual del usuario
     * 
     * @see User#validEmail() 
     * @see User#validPassword()
     * 
     * @author Vanina Pintos
     */
    public User(String email, String password, Location location)
    {
        this.email = email;
        this.password = password;
        this.location = location;
    }
    
    /**
     * <h1>Validar contraseña del objeto</h1>
     * validThisPassword() valida la contraseña actual del objeto User
     * (debe contener al menos 8 caracteres, 1 letra y 1 numero)
     * 
     * @return boolean | true si la contraseña es valida 
     * 
     * @throws EmptyPasswordException | si la contraseña se envia en un String vacio ""
     * @throws InvalidPasswordException | si la contraseña es invalida
     * 
     * @author Vanina Pintos
     */
    public boolean validThisPassword()throws EmptyPasswordException,InvalidPasswordException
    {
        return validPassword(password);
    }

    /**
     * <h1>Validar contraseña</h1>
     * validPassword(String password) valida si el String pasado por parametro 
     * es una contraseña valida (debe contener al menos 8 caracteres, 1 letra y 1 numero)
     * 
     * @param password | contraseña a validar
     * 
     * @return boolean | true si la contraseña es valida 
     * 
     * @throws EmptyPasswordException | si la contraseña se envia en un String vacio ""
     * @throws InvalidPasswordException | si la contraseña es invalida
     * 
     * @author Vanina Pintos
     */
    public static boolean validPassword(String password) throws EmptyPasswordException,InvalidPasswordException
    {
        boolean valid = false;
        // Validacion de la contrasenia
        if(password.isEmpty()||(password.length()<8)){
            
            throw new EmptyPasswordException("La contraseña debe tener mas de 8 caracteres");       
        }
        else if((!password.matches(".*[0-9].*"))||(!password.matches(".*[a-zA-Z].*")))
        {
            throw new InvalidPasswordException("La contraseña debe tener al menos una letra y un numero"); 
        }
        else
        {
            valid = true;
        }
        return valid;
    }
    
    /**
     * <h1>Validar Email del objeto</h1>
     * validThisEmail() valida el email actual del objeto User
     * (debe contener un @ y un .)
     * 
     * @return boolean | true si es valido
     * 
     * @throws InvalidEmailException | si el email se envia en un String vacio ""
     * @throws EmptyEmailException | si el email es invalido
     * 
     * @author Vanina Pintos
     */
    public boolean validThisEmail() throws InvalidEmailException, EmptyEmailException
    {
        return validEmail(email);
    }
    
    /**
     * <h1>Validar Email</h1>
     * validEmail(String email) valida si el String pasado por parametro 
     * es un email valido (debe contener un @ y un .)
     * 
     * @param email | email a validar
     * 
     * @return boolean | true si es valido
     * 
     * @throws InvalidEmailException | si el email se envia en un String vacio ""
     * @throws EmptyEmailException | si el email es invalido
     * 
     * @author Vanina Pintos
     */
    public static boolean validEmail(String email) throws InvalidEmailException, EmptyEmailException
    {
        boolean valid = false;
        // Patrón para validar el email
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
 
        Matcher mather = pattern.matcher(email);
        
        if (email.isEmpty()) 
        {              
            throw new EmptyEmailException("Email vacio.");
        } 
        else if(mather.find() == false) 
        {
            throw new InvalidEmailException("Email invalido, debe contener un @ y un .");            
        }
        else
        {
            valid = true;
        }
        
        return valid;
    }
    
    /**
     * <h1>Obtener Email</h1>
     * 
     * @return String | email actual del objeto
     * 
     * @author Vanina Pintos
     */
    public String getEmail() {
        return email;
    }

    
    /**
     * <h1>Cambiar Contraseña</h1>
     * 
     * setPassword(String oldPassword, String newPassword) recibe por parametros
     * la contraseña antigua y la nueva, para modificarla de manera segura
     * 
     * @param oldPassword | contraseña actual 
     * @param newPassword | contraseña nueva
     * 
     * @return boolean | true si la nueva contraseña es valida, se verifica y es posible cambiar
     * 
     * @throws EmptyPasswordException | si la nueva contraseña contiene un String vacio ""
     * @throws InvalidPasswordException | si la contraseña actual no coincide o la nueva contraseña es invalida
     * 
     * @author Sofia Brocardo
     */
    public boolean setPassword(String oldPassword, String newPassword) throws EmptyPasswordException,InvalidPasswordException
    {
        boolean changed = false;
        
        //verifico que la contraseña actual coincida y que la nueva contraseña sea valida
        if((verifyPassword(oldPassword))&&(validPassword(newPassword)))
        {
            this.password = newPassword;//si cumple con las condiciones cambio la contraseña
            changed = true;
        }
        else
        {
            //si no sale por una Excepcion la unica manera de entrar al else es que 
            //la contraseña actual que se paso por parametro no sea igual a la actual
            throw new InvalidPasswordException("La contraseña actual no coincide");
        }
        
        return changed;
    }

    /**
     * <h1>Obtener Localizacion</h1>
     * 
     * @return Location | ultima localizacion guardada
     *                    si retorna un String vacio ("") significa que nunca se seteo una localizacion
     * 
     * @author Vanina Pintos
     */
    public Location getLocation() {
        return location;
    }

    /**
     * <h1>Modificar Localizacion</h1>
     * 
     * @param city | ciudad, esta se puede especificar con un barrio separado por una coma, ej: barrio,ciudad
     * @param state_province | estado o provincia
     * @param country | pais
     * 
     * @throws IOException
     * @throws InvalidLocationException 
     * 
     * @see Location#updateLocation(java.lang.String, java.lang.String, java.lang.String) 
     * 
     * @author Sofia Brocardo
     */
    public void setLocation(String city, String state_province, String country) throws IOException, InvalidLocationException {
        location.updateLocation(city, state_province, country);
    } 

    /**
     * Funcion util para implementar un LinkedHashMap en UsersSystem
     * 
     * @return int
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.email);
        hash = 97 * hash + Objects.hashCode(this.password);
        hash = 97 * hash + Objects.hashCode(this.location);
        return hash;
    }
    
    /**
     * <h1>Verificar Contraseña</h1>
     * 
     * Verifica que la contraseña pasada por parametro coincida con la contraseña actual
     * 
     * @param password | contraseña actual
     * 
     * @return bolean | true si coinciden | false si no coinciden
     * 
     * @author Vanina Pintos
     */
    public boolean verifyPassword(String password)
    {
        boolean verify = false;
        
        if(this.password.contentEquals(password))
            verify = true;
        
        return verify;
    }

    /**
     * Verifica que el objeto sea igual
     * 
     * @param obj
     * 
     * @return boolean | true si son iguales |false si no son iguales
     * 
     * @author Vanina Pintos
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        return Objects.equals(this.location, other.location);
    }
}
