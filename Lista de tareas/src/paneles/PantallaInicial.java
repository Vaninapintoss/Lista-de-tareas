package paneles;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import user.User;
import user.UsersSystem;
import visualElements.ButtonImage;
import visualElements.VisualLoginSignupPage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author sofia
 */
public class PantallaInicial extends javax.swing.JFrame {

    /**
     * Creates new form PantallaInicial
     */
    public PantallaInicial() 
    {
        //creo y cargo el sistema de usuarios
        sistemaUsuarios = new UsersSystem();
        
        //leo los usuarios del archivo);
        try
        {
            String read = sistemaUsuarios.readUsersInFile();
            
            
        }
        catch(IOException ex)
        {
            jLabel1.setText(ex.getMessage());
        }
        
        initComponents();
        setLocationRelativeTo(null);//para que la ventana inicie en el centro de la pantalla
        
        //creo los paneles
        login = new LoginPanel();
 
        signup = new SignupPanel();
        
        //creo los elementos visuales de los botones
        visualButtons = new VisualLoginSignupPage();
        
        //confirmo el tamaño del contenedor en los paneles
        login.setSize(700, 310);
        signup.setSize(700, 310);
        
        //posicion con respecto al contenedor
        login.setLocation(0, 0);
        signup.setLocation(0, 0);
        
        //cargo al principio la pantalla de LogIn
        contentPantalla(login);
        
        loginOn = true;//esta el login en la pantalla
        signupOn = false;//no esta el signup en la pantalla
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoPantallaInicial = new javax.swing.JPanel();
        content = new javax.swing.JPanel();
        buttonLogin = new javax.swing.JButton();
        buttonSignup = new javax.swing.JButton();
        imagenBugGato = new javax.swing.JLabel();
        imagenTitulo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        botonCerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FondoPantallaInicial.setBackground(new java.awt.Color(195, 225, 203));
        FondoPantallaInicial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        content.setBackground(new java.awt.Color(255, 204, 204));
        content.setMaximumSize(new java.awt.Dimension(700, 307));
        content.setMinimumSize(new java.awt.Dimension(700, 307));
        content.setPreferredSize(new java.awt.Dimension(700, 307));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );

        FondoPantallaInicial.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, -1, 310));

        buttonLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonesLogIn/BotonLogin.png"))); // NOI18N
        buttonLogin.setBorderPainted(false);
        buttonLogin.setContentAreaFilled(false);
        buttonLogin.setPreferredSize(new java.awt.Dimension(140, 30));
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });
        FondoPantallaInicial.add(buttonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, -1));

        buttonSignup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonesLogIn/BotonSignUpOf.png"))); // NOI18N
        buttonSignup.setBorderPainted(false);
        buttonSignup.setContentAreaFilled(false);
        buttonSignup.setPreferredSize(new java.awt.Dimension(140, 30));
        buttonSignup.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonesLogIn/BotonSignUpMouseOver.png"))); // NOI18N
        buttonSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSignupActionPerformed(evt);
            }
        });
        FondoPantallaInicial.add(buttonSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        imagenBugGato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonesLogIn/BugTheCat.png"))); // NOI18N
        FondoPantallaInicial.add(imagenBugGato, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 126, -1, -1));

        imagenTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonesLogIn/TituloSignUp.png"))); // NOI18N
        FondoPantallaInicial.add(imagenTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 69, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonMinimizar.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setMaximumSize(new java.awt.Dimension(16, 16));
        jButton1.setMinimumSize(new java.awt.Dimension(16, 16));
        jButton1.setPreferredSize(new java.awt.Dimension(16, 16));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonMinimizarMouseOver.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        FondoPantallaInicial.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, -1, -1));

        botonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonCerrar.png"))); // NOI18N
        botonCerrar.setBorderPainted(false);
        botonCerrar.setContentAreaFilled(false);
        botonCerrar.setMaximumSize(new java.awt.Dimension(16, 16));
        botonCerrar.setMinimumSize(new java.awt.Dimension(16, 16));
        botonCerrar.setPreferredSize(new java.awt.Dimension(16, 16));
        botonCerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonCerrarMouseOver.png"))); // NOI18N
        botonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarActionPerformed(evt);
            }
        });
        FondoPantallaInicial.add(botonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FondoPantallaInicial.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 240, -1));

        getContentPane().add(FondoPantallaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void abrirApp(User user)
    {
        AppUserLists app = new AppUserLists(user, sistemaUsuarios);
        app.setVisible(true);
        homeScreen.dispose();
    }
    
    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        
        if(signupOn)
        {
            //cambio el contenido por el login
            contentPantalla(login);
            
            //cambio el boton de login
            changeJButton(buttonSignup, visualButtons.getSignupOf());
            
            //cambio el boton de signup
            changeJButton(buttonLogin, visualButtons.getLoginOn());
        
            loginOn = true;//esta el login en la pantalla
            signupOn = false;//no esta el signup en la pantalla
        }
    }//GEN-LAST:event_buttonLoginActionPerformed

    private void buttonSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSignupActionPerformed
        // TODO add your handling code here:
        //si estamos en la pantalla de logIn se puede pasar a la de signup
        if(loginOn)
        {
            //cambio el contenido por el signup
            contentPantalla(signup);
            
            //cambio el boton de login
            changeJButton(buttonSignup, visualButtons.getSignupOn());
            
            //cambio el boton de signup
            changeJButton(buttonLogin, visualButtons.getLoginOf());
            
            loginOn = false;//esta el login en la pantalla
            signupOn = true;//no esta el signup en la pantalla
        }
             
    }//GEN-LAST:event_buttonSignupActionPerformed

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCerrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jButton1ActionPerformed

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
    
    
    private void contentPantalla(Component panel)
    {
        content.removeAll();
        content.add(panel,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
    
    public static LoginPanel login;
    public static SignupPanel signup;
    //para saber cuando se activan los botones de login y signup
    public static boolean loginOn;
    public static boolean signupOn;
    //botones de signUp y logIn
    public static VisualLoginSignupPage visualButtons;
    
    public static PantallaInicial homeScreen;
    
    //usuarios
    public static UsersSystem sistemaUsuarios;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {      
        
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                homeScreen = new PantallaInicial();
                homeScreen.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FondoPantallaInicial;
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton buttonLogin;
    private javax.swing.JButton buttonSignup;
    private javax.swing.JPanel content;
    private javax.swing.JLabel imagenBugGato;
    private javax.swing.JLabel imagenTitulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
