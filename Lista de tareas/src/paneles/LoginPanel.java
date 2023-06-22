/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package paneles;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import static paneles.PantallaInicial.abrirApp;
import static paneles.PantallaInicial.sistemaUsuarios;
import user.User;
import user.exceptions.IncorrectPasswordException;
import user.exceptions.UserNotFoundException;
import visualElements.ButtonImage;
import visualElements.VisualSeePassword;

/**
 *
 * @author sofia
 */
public class LoginPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginPanel
     */
    public static boolean seePassword;//booleando que determina si se va la contraseña
    public static VisualSeePassword seePasswordButton;
    
    public LoginPanel() 
    {
        seePassword = false;
        seePasswordButton = new VisualSeePassword();
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text_email = new javax.swing.JTextField();
        text_password = new javax.swing.JPasswordField();
        infoUsuarioEmail = new javax.swing.JLabel();
        imagenFondoEmail = new javax.swing.JLabel();
        infoUsuarioPassword = new javax.swing.JLabel();
        imagenFondoContraseña = new javax.swing.JLabel();
        ButtonLogin = new javax.swing.JButton();
        errorText_login = new javax.swing.JLabel();
        errorText_email = new javax.swing.JLabel();
        errorText_password = new javax.swing.JLabel();
        butoonSeePassword = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 128, 97));
        setMaximumSize(new java.awt.Dimension(700, 307));
        setMinimumSize(new java.awt.Dimension(700, 307));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text_email.setBackground(new java.awt.Color(195, 225, 203));
        text_email.setForeground(new java.awt.Color(102, 102, 102));
        text_email.setBorder(null);
        text_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_emailActionPerformed(evt);
            }
        });
        add(text_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 350, 30));

        text_password.setBackground(new java.awt.Color(195, 225, 203));
        text_password.setForeground(new java.awt.Color(102, 102, 102));
        text_password.setBorder(null);
        add(text_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 350, 30));

        infoUsuarioEmail.setBackground(new java.awt.Color(195, 225, 203));
        infoUsuarioEmail.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        infoUsuarioEmail.setForeground(new java.awt.Color(195, 225, 203));
        infoUsuarioEmail.setText("Email");
        add(infoUsuarioEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        imagenFondoEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonesLogIn/barraTexto.png"))); // NOI18N
        add(imagenFondoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        infoUsuarioPassword.setBackground(new java.awt.Color(195, 225, 203));
        infoUsuarioPassword.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        infoUsuarioPassword.setForeground(new java.awt.Color(195, 225, 203));
        infoUsuarioPassword.setText("Contraseña");
        add(infoUsuarioPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        imagenFondoContraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonesLogIn/barraTexto.png"))); // NOI18N
        add(imagenFondoContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        ButtonLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonesLogIn/LogIn.png"))); // NOI18N
        ButtonLogin.setBorderPainted(false);
        ButtonLogin.setContentAreaFilled(false);
        ButtonLogin.setMaximumSize(new java.awt.Dimension(110, 40));
        ButtonLogin.setMinimumSize(new java.awt.Dimension(110, 40));
        ButtonLogin.setPreferredSize(new java.awt.Dimension(110, 40));
        ButtonLogin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonesLogIn/LogInMouseOver.png"))); // NOI18N
        ButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLoginActionPerformed(evt);
            }
        });
        add(ButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, -1, -1));

        errorText_login.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        errorText_login.setForeground(new java.awt.Color(255, 153, 153));
        errorText_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorText_login.setAutoscrolls(true);
        errorText_login.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        add(errorText_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 310, 20));

        errorText_email.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        errorText_email.setForeground(new java.awt.Color(255, 153, 153));
        errorText_email.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        errorText_email.setAutoscrolls(true);
        errorText_email.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        add(errorText_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 140, 20));

        errorText_password.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        errorText_password.setForeground(new java.awt.Color(255, 153, 153));
        errorText_password.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        errorText_password.setAutoscrolls(true);
        errorText_password.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        add(errorText_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 140, 20));

        butoonSeePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonesLogIn/dontSeePasswordButton.png"))); // NOI18N
        butoonSeePassword.setBorderPainted(false);
        butoonSeePassword.setContentAreaFilled(false);
        butoonSeePassword.setMaximumSize(new java.awt.Dimension(30, 30));
        butoonSeePassword.setMinimumSize(new java.awt.Dimension(30, 30));
        butoonSeePassword.setPreferredSize(new java.awt.Dimension(30, 30));
        butoonSeePassword.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonesLogIn/seePasswordButton.png"))); // NOI18N
        butoonSeePassword.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonesLogIn/dontSeePasswordButtonMouseOver.png"))); // NOI18N
        butoonSeePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butoonSeePasswordActionPerformed(evt);
            }
        });
        add(butoonSeePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void text_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_emailActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_text_emailActionPerformed

    private void ButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLoginActionPerformed
        boolean loginCorrect = true;
        // Se loguea un usuario
        //verificar que el usuario existe
        try
        {
            String email = text_email.getText();
            String password = text_password.getText();
            errorText_email.setText("");
            errorText_password.setText("");
            errorText_login.setText("");
            
            
            if(email.isEmpty())
            {
                loginCorrect = false;
                errorText_email.setText("Ingrese un email");                
            }
            
            if(password.isEmpty())
            {
                loginCorrect = false;
                errorText_password.setText("Ingrese una contraseña");  
            }
            
            if(loginCorrect)
            {
                User user = sistemaUsuarios.login(email, password);
                abrirApp(user);
            }
        }
        catch(UserNotFoundException ex)
        {
            errorText_login.setText(ex.getMessage());
        }
        catch(IncorrectPasswordException ex)
        {
            errorText_login.setText(ex.getMessage());
        }
    }//GEN-LAST:event_ButtonLoginActionPerformed

    private void butoonSeePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butoonSeePasswordActionPerformed
        if(seePassword)
        {
            //si esta configurado para ver la contraseña va a cambiar a no ver contraseña
            text_password.setEchoChar('•');
            seePassword = false;
            
            changeJButton(butoonSeePassword, seePasswordButton.getSeePassword());
        }
        else
        {
            //si esta configurado para no ver la contraseña va a cambiar a ver contraseña
            text_password.setEchoChar((char)0);
            seePassword = true;
            
            changeJButton(butoonSeePassword, seePasswordButton.getDontSeePassword());
        }
    }//GEN-LAST:event_butoonSeePasswordActionPerformed

    
    private void changeJButton(JButton boton, ButtonImage imagenBoton)
    {
        String icon = imagenBoton.getIcon();
        String pressedIcon = imagenBoton.getPressedIcon();
        String rolloverIcon = imagenBoton.getRolloverIcon();
        
        //cambio las caracteristicas del boton enviado por parametro
        boton.setIcon(new ImageIcon(getClass().getResource(icon)));
        boton.setPressedIcon(new ImageIcon(getClass().getResource(pressedIcon)));
        boton.setRolloverIcon(new ImageIcon(getClass().getResource(rolloverIcon)));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonLogin;
    private javax.swing.JButton butoonSeePassword;
    private javax.swing.JLabel errorText_email;
    private javax.swing.JLabel errorText_login;
    private javax.swing.JLabel errorText_password;
    private javax.swing.JLabel imagenFondoContraseña;
    private javax.swing.JLabel imagenFondoEmail;
    private javax.swing.JLabel infoUsuarioEmail;
    private javax.swing.JLabel infoUsuarioPassword;
    private javax.swing.JTextField text_email;
    private javax.swing.JPasswordField text_password;
    // End of variables declaration//GEN-END:variables
}
