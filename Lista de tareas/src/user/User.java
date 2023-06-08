/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;

import java.io.Serializable;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import user.exceptions.EmptyEmailException;
import user.exceptions.EmptyPasswordException;
import user.exceptions.InvalidEmailException;
import user.exceptions.InvalidPasswordException;

/**
 *
 * @author Vanina Pintos y Sofia Brocardo
 */
public class User  implements Serializable {
    private String email;
    private String password;
    private String location; 
    // clase ubicacion:  ciudad, pais - set
    
    public User(String email, String password)
    {
        this.email = email;
        this.password = password;
        this.location = "";
    }

    public boolean validPassword() throws EmptyPasswordException,InvalidPasswordException
    {
        boolean valid = false;
        // Validacion de la contrasenia
        if(password.isEmpty()||(password.length()<8)){
            
            throw new EmptyPasswordException("Error : la contraseña debe tener mas de 8 caracteres");       
        }
        else if((!password.matches(".*[0-9].*"))||(!password.matches(".*[a-zA-Z].*")))
        {
            throw new InvalidPasswordException("Error : la contraseña debe tener al menos una letra y un numero"); 
        }
        else
        {
            valid = true;
        }
        return valid;
    }
    
    public boolean validEmail() throws InvalidEmailException, EmptyEmailException
    {
        boolean valid = false;
        // Patrón para validar el email
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
 
        Matcher mather = pattern.matcher(email);
        
        if (email.isEmpty()) 
        {              
            throw new EmptyEmailException("Error : email vacio.");
        } 
        else if(mather.find() == false) 
        {
            throw new InvalidEmailException("Error : email invalido");            
        }
        else
        {
            valid = true;
        }
        
        return valid;
    }
    
    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "User{" + "email=" + email + ", password=" + password + ", location=" + location + '}';
    }    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.email);
        hash = 97 * hash + Objects.hashCode(this.password);
        hash = 97 * hash + Objects.hashCode(this.location);
        return hash;
    }
    
    public boolean verifyPassword(String password)
    {
        boolean verify = false;
        
        if(this.password.contentEquals(password))
            verify = true;
        
        return verify;
    }

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
