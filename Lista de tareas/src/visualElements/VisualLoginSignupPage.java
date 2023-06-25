/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visualElements;

/**
 *
 * @author sofia
 */
public class VisualLoginSignupPage 
{
    //---------------------------------------------------------------------------------- ATRIBUTOS
    private ButtonImage signupOn;
    private ButtonImage signupOf;
    private ButtonImage loginOn;
    private ButtonImage loginOf;
    
    //---------------------------------------------------------------------------------- METODOS
    /**
     * VisualLoginSignupPage
     */
    public VisualLoginSignupPage ()
    {
        signupOn = new ButtonImage("/imagenes/BotonesLogIn/BotonSignUp.png",
                             "/imagenes/BotonesLogIn/BotonSignUp.png",
                            "/imagenes/BotonesLogIn/BotonSignUp.png");
        signupOf = new ButtonImage("/imagenes/BotonesLogIn/BotonSignUpOf.png",
                             "/imagenes/BotonesLogIn/BotonSignUp.png",
                            "/imagenes/BotonesLogIn/BotonSignUpMouseOver.png");
        loginOn = new ButtonImage("/imagenes/BotonesLogIn/BotonLogin.png",
                            "/imagenes/BotonesLogIn/BotonLogin.png",
                           "/imagenes/BotonesLogIn/BotonLogin.png");
        loginOf = new ButtonImage("/imagenes/BotonesLogIn/BotonLoginOf.png",
                            "/imagenes/BotonesLogIn/BotonLogin.png",
                           "/imagenes/BotonesLogIn/BotonLoginMouseOver.png");
    }
    
    /**
     * ButtonImage
     * @return 
     */
    public ButtonImage getSignupOn()
    {
        return signupOn;
    }
    
    /**
     * getSignupOf
     * @return 
     */
    public ButtonImage getSignupOf()
    {
        return signupOf;
    }
    
    /**
     * getLoginOn
     * @return 
     */
    public ButtonImage getLoginOn()
    {
        return loginOn;
    }
    
    /**
     * getLoginOf
     * @return 
     */
    public ButtonImage getLoginOf()
    {
        return loginOf;
    }
}
