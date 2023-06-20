/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package list;

import list.exceptions.EmptyCategoryListException;

/**
 * <h1>Clase List</h1>
 * Guarda la informacion de una lista general: su categoria 
 * 
 * <b>Note:</b>
 * su categoria puede ser modificada
 *
 * @author Vanina Pintos
 */
public abstract class List{
    private String category;

    /**
     * <h1>Constructor de la clase List</h1>
     * 
     * Unico constructor de la clase List, recibe una categoria
     *  
     * @param category - validar antes de pasar por parametro
     * 
     * @see List#validCategory(java.lang.String); 
     * @see List#validThisCategory();
     * 
     * @author Vanina Pintos
     */
    public List(String category) {
        this.category = category;
    }
    
    /**
     * <h1>Obtener categoria</h1>
     * 
     * @return String | categoria actual del objeto
     * 
     * @author Vanina Pintos
     */
    public String getCategory(){
        return category;
    }
    
    /**
     * <h1>Cambiar categoria</h1>
     * 
     * (String category) recibe la nueva categoria que se le quiere asignar, 
     * si es valida entonces se realiza la modificacion
     * 
     * @param category | nueva categoria 
     * 
     * @return boolean | true si la categoria es valida
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
     * <h1>Cambiar categoria</h1>
     * 
     * validCategory(String category) recibe una categoria a validar
     * 
     * @param category | categoria a validar
     * 
     * @return boolean | true si la categoria es valida
     * 
     * @throws EmptyCategoryListException | si la contraseña se envia en un String vacio ""
     * 
     * @author Vanina Pintos
     */
    public boolean validCategory(String category) throws EmptyCategoryListException{
        boolean valid = false;
        
        if(category.isEmpty()){
            throw new EmptyCategoryListException("ingrese una categoria."); 
        }else{
            valid = true;
        }
        
        return valid;
    }
    
    /**
     * <h1>Validar cateforia del objeto</h1>
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
