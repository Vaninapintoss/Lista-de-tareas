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
    
    public ButtonImage getSignupOn()
    {
        return signupOn;
    }
    
    public ButtonImage getSignupOf()
    {
        return signupOf;
    }
    
    public ButtonImage getLoginOn()
    {
        return loginOn;
    }
    
    public ButtonImage getLoginOf()
    {
        return loginOf;
    }
}
