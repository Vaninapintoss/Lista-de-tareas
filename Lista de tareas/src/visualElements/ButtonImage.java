/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visualElements;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * ButtonImage
 * @author sofia
 */
public class ButtonImage 
{
    //---------------------------------------------------------------------------------- ATRIBUTOS
    private String icon;
    private String pressedIcon;
    private String rolloverIcon;
    
    //---------------------------------------------------------------------------------- METODOS
    /**
     * ButtonImage
     * @param icon | icon 
     * @param pressedIcon | pressedIcon
     * @param rolloverIcon | rolloverIcon
     */
    public ButtonImage(String icon, String pressedIcon, String rolloverIcon)
    {
        this.icon = icon;
        this.pressedIcon = pressedIcon;
        this.rolloverIcon = rolloverIcon;
    }
    
    /**
     * getIcon
     * @return String 
     */
    public String getIcon()
    {
        return icon;
    }
    
    /**
     * getPressedIcon
     * @return String
     */
    public String getPressedIcon()
    {
        return pressedIcon;
    }
    
    /**
     * getRolloverIcon
     * @return String
     */
    public String getRolloverIcon()
    {
        return rolloverIcon;
    }
    
}
