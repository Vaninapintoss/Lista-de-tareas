/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package list;

import java.io.Serializable;
import list.exceptions.EmptyCategoryListException;

/**
 * Clase List
 * 
 * Clase abstracta padre de las clases SimpleList, DateList y TrackList
 * Guarda la informacion de la categoria de la lista
 * 
 * <b>Note:</b>
 * su categoria puede ser modificada
 *
 * @author Vanina Pintos
 */
public abstract class List  implements Serializable{
    private String category;

    /**
     * Constructor de la clase List
     * 
     * Unico constructor de la clase List, recibe una categoria 
     * que debe ser validada antes de ser enviada
     *  
     * @param category - categoria validar antes de enviar
     * 
     * @see List#validCategory(String)
     * 
     * @author Vanina Pintos
     */
    public List(String category) {
        this.category = category;
    }
    
    /**
     * Obtener categoria
     * 
     * @return String | categoria actual del objeto
     * 
     * @author Vanina Pintos
     */
    public String getCategory(){
        return category;
    }
    
    /**
     * Cambiar categoria
     * 
     * (String category) recibe una categoria y valida de que no se trate de un 
     * string vacio para modificar la categoria anterior
     * 
     * @param category | nueva categoria 
     * 
     * @return boolean | true la categoria se pudo modificar | false la categoria no se pudo 
     * modidicar
     * 
     * @throws EmptyCategoryListException | si la contraseña se envia en un String vacio ""
     * 
     * @author Vanina Pintos
     */
    public boolean setCategory(String category)throws EmptyCategoryListException{
        
        boolean changed = false;
        
        if(validCategory(category)){
            this.category = category;
            changed = true;
        }
        
        return changed;
    }
    
    /**
     * Validar categoria
     * 
     * validCategory(String category) recibe una categoria para validar de que no 
     * se trate de un string vacio
     * 
     * @param category | categoria a validar
     * 
     * @return boolean | true categoria valida | false categoria invalida
     * 
     * @throws EmptyCategoryListException | si la contraseña se envia en un String vacio ""
     * 
     * @author Vanina Pintos
     */
    public static boolean validCategory(String category) throws EmptyCategoryListException{
        boolean valid = false;
        
        if(category.isEmpty()){
            throw new EmptyCategoryListException("ingrese una categoria."); 
        }else{
            valid = true;
        }
        
        return valid;
    }
    
    /**
     * Validar categoria del objeto
     * 
     * validThisCategory() valida la contraseña actual del objeto List
     * 
     * @return boolean | true si la contraseña es valida 
     * 
     * @throws EmptyCategoryListException | si la contraseña se envia en un String vacio ""
     * 
     * @author Vanina Pintos
     */
    public boolean validThisCategory() throws EmptyCategoryListException{
        return validCategory(category);
    }
}
