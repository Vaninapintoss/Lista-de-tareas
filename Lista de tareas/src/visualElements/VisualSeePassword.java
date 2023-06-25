/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visualElements;

/**
 * VisualSeePassword
 * @author sofia
 */
public class VisualSeePassword 
{
    private ButtonImage seePassword;
    private ButtonImage dontSeePassword;
    
    /**
     * VisualSeePassword
     */
    public VisualSeePassword()
    {
        dontSeePassword = new ButtonImage("/imagenes/BotonesLogIn/seePasswordButton.png",
                                "/imagenes/BotonesLogIn/dontSeePasswordButton.png",
                               "/imagenes/BotonesLogIn/seePasswordButtonMouseOver.png");
        
        seePassword = new ButtonImage("/imagenes/BotonesLogIn/dontSeePasswordButton.png",
                                "/imagenes/BotonesLogIn/seePasswordButton.png",
                               "/imagenes/BotonesLogIn/dontSeePasswordButtonMouseOver.png");
    }
    
    /**
     * getSeePassword
     * @return ButtonImage
     */
    public ButtonImage getSeePassword()
    {
        return seePassword;
    }
    
    /**
     * getDontSeePassword
     * @return ButtonImage
     * 
     */
    public ButtonImage getDontSeePassword()
    {
        return dontSeePassword;
    }
}
