/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visualElements;

/**
 *
 * @author sofia
 */
public class ButtonImage 
{
    //---------------------------------------------------------------------------------- ATRIBUTOS
    private String icon;
    private String pressedIcon;
    private String rolloverIcon;
    
    //---------------------------------------------------------------------------------- METODOS
    public ButtonImage(String icon, String pressedIcon, String rolloverIcon)
    {
        this.icon = icon;
        this.pressedIcon = pressedIcon;
        this.rolloverIcon = rolloverIcon;
    }
    
    public String getIcon()
    {
        return icon;
    }
    
    public String getPressedIcon()
    {
        return pressedIcon;
    }
    
    public String getRolloverIcon()
    {
        return rolloverIcon;
    }
    
}
