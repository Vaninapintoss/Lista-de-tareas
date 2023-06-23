/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package paneles;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Frame;
import java.io.IOException;
import javax.swing.JPanel;
import paneles.ListasPaneles.TaskListPanel;
import static paneles.PantallaInicial.homeScreen;
import paneles.options.DeleteUserPanel;
import paneles.options.InfoTaskMasterProPanel;
import paneles.options.ModifyLocationPanel;
import paneles.options.ModifyPasswordPanel;
import paneles.options.SeeUserPanel;
import user.User;
import user.UsersSystem;
import userLists.UserLists;

/**
 *
 * @author sofia
 */
public class AppUserLists extends javax.swing.JFrame {

    public static User user;
    public static UsersSystem users;
    public static AppUserLists appActive;
    public PantallaPrincipalApp homescreenApp;
    private boolean menuOn;//si el menu esta abierto
    
    //pabeles
    private SeeUserPanel seeUserPanel;
    private ModifyPasswordPanel modifyPasswordPanel;
    private ModifyLocationPanel modifyLocationPanel;
    private DeleteUserPanel deleteUserPanel;
    private InfoTaskMasterProPanel infoAppPanel;
    private TaskListPanel taskListPanel;
    
    //info del ultimo panel activo
    private JPanel lastPanel;
    
    //lista
    public static UserLists userLists;
    
    /**
     * Creates new form AppUserLists
     */
    public AppUserLists(User user, UsersSystem users) 
    {
        menuOn = false;//seteo el menu en false - cerrado
        this.user = user;//actualizo el usuario
        this.users = users;//actualizo los usuarios
        
        userLists = new UserLists(user.getEmail());//creo el objeto listas de usuario
        
        
        //actualizo la lista
        try
        {
            userLists.readSimpleFromFile();//actualizo la lista simple con el archivo correspondiente
            userLists.readDateFromFile();
            userLists.readTrackFromFile();
            System.out.println("hasta aca");
        }
        catch(IOException ex)
        {
            this.dispose();//cierro el programa
        }
        
        initComponents();
        setLocationRelativeTo(null);//para que la ventana inicie en el centro de la pantalla
        
        //creo los paneles
        homescreenApp = new PantallaPrincipalApp(this.user, userLists);
        
        //confirmo el tamaño del contenedor en los paneles
        homescreenApp.setSize(700, 450);
        
        //posicion con respecto al contenedor
        homescreenApp.setLocation(0, 0);
        
        //cargo al principio la pantalla de LogIn
        contentScreen(homescreenApp,contentScreenApp); 
        
        //menu
        contentMenu.setVisible(false);
        contentMenu.setLocation(0, 0);
        
        
        //boton atras
        buttonGoBack.setVisible(false);
    }
    
    
    public void contentScreen(Component panel, JPanel panelContent)
    {
        panelContent.removeAll();
        panelContent.add(panel,BorderLayout.CENTER);
        panelContent.revalidate();
        panelContent.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        ButtonMenu = new javax.swing.JButton();
        contentMenu = new javax.swing.JPanel();
        buttonSeeUser = new javax.swing.JButton();
        buttonChangePassword = new javax.swing.JButton();
        buttonChangeLocation = new javax.swing.JButton();
        buttonDeleteUser = new javax.swing.JButton();
        buttonInfo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        panelEmpty = new javax.swing.JPanel();
        buttonGoBack = new javax.swing.JButton();
        contentScreenApp = new javax.swing.JPanel();
        barraArriba = new javax.swing.JPanel();
        botonCerrar = new javax.swing.JButton();
        botonMinimizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 500));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu/botonMenu.png"))); // NOI18N
        ButtonMenu.setBorderPainted(false);
        ButtonMenu.setContentAreaFilled(false);
        ButtonMenu.setMaximumSize(new java.awt.Dimension(25, 25));
        ButtonMenu.setMinimumSize(new java.awt.Dimension(25, 25));
        ButtonMenu.setPreferredSize(new java.awt.Dimension(25, 25));
        ButtonMenu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu/botonMenuMouseOver.png"))); // NOI18N
        ButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMenuActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        contentMenu.setBackground(new java.awt.Color(204, 204, 255));
        contentMenu.setMaximumSize(new java.awt.Dimension(203, 180));
        contentMenu.setMinimumSize(new java.awt.Dimension(203, 180));
        contentMenu.setOpaque(false);
        contentMenu.setPreferredSize(new java.awt.Dimension(203, 180));
        contentMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonSeeUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu/botonVerUsuario.png"))); // NOI18N
        buttonSeeUser.setBorderPainted(false);
        buttonSeeUser.setContentAreaFilled(false);
        buttonSeeUser.setMaximumSize(new java.awt.Dimension(185, 20));
        buttonSeeUser.setMinimumSize(new java.awt.Dimension(185, 20));
        buttonSeeUser.setPreferredSize(new java.awt.Dimension(185, 20));
        buttonSeeUser.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu/botonVerUsuarioMouseOver.png"))); // NOI18N
        buttonSeeUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeeUserActionPerformed(evt);
            }
        });
        contentMenu.add(buttonSeeUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 20));

        buttonChangePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu/botonModificarContraseña.png"))); // NOI18N
        buttonChangePassword.setBorderPainted(false);
        buttonChangePassword.setContentAreaFilled(false);
        buttonChangePassword.setMaximumSize(new java.awt.Dimension(185, 20));
        buttonChangePassword.setMinimumSize(new java.awt.Dimension(185, 20));
        buttonChangePassword.setPreferredSize(new java.awt.Dimension(185, 20));
        buttonChangePassword.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu/botonModificarContraseñaMouseOver.png"))); // NOI18N
        buttonChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonChangePasswordActionPerformed(evt);
            }
        });
        contentMenu.add(buttonChangePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        buttonChangeLocation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu/botonModificarLocalizacion.png"))); // NOI18N
        buttonChangeLocation.setBorderPainted(false);
        buttonChangeLocation.setContentAreaFilled(false);
        buttonChangeLocation.setMaximumSize(new java.awt.Dimension(185, 20));
        buttonChangeLocation.setMinimumSize(new java.awt.Dimension(185, 20));
        buttonChangeLocation.setPreferredSize(new java.awt.Dimension(185, 20));
        buttonChangeLocation.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu/botonModificarLocalizacionMouseOver.png"))); // NOI18N
        buttonChangeLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonChangeLocationActionPerformed(evt);
            }
        });
        contentMenu.add(buttonChangeLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        buttonDeleteUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu/botonEliminarUsuario.png"))); // NOI18N
        buttonDeleteUser.setBorderPainted(false);
        buttonDeleteUser.setContentAreaFilled(false);
        buttonDeleteUser.setMaximumSize(new java.awt.Dimension(185, 20));
        buttonDeleteUser.setMinimumSize(new java.awt.Dimension(185, 20));
        buttonDeleteUser.setPreferredSize(new java.awt.Dimension(185, 20));
        buttonDeleteUser.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu/botonEliminarUsuarioMouseOver.png"))); // NOI18N
        buttonDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteUserActionPerformed(evt);
            }
        });
        contentMenu.add(buttonDeleteUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        buttonInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu/botonInfo.png"))); // NOI18N
        buttonInfo.setBorderPainted(false);
        buttonInfo.setContentAreaFilled(false);
        buttonInfo.setMaximumSize(new java.awt.Dimension(185, 20));
        buttonInfo.setMinimumSize(new java.awt.Dimension(185, 20));
        buttonInfo.setPreferredSize(new java.awt.Dimension(185, 20));
        buttonInfo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu/botonInfoMouseOver.png"))); // NOI18N
        buttonInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInfoActionPerformed(evt);
            }
        });
        contentMenu.add(buttonInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu/background.png"))); // NOI18N
        contentMenu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 180));

        getContentPane().add(contentMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 12, -1, 180));

        panelEmpty.setOpaque(false);

        buttonGoBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonVolver.png"))); // NOI18N
        buttonGoBack.setBorderPainted(false);
        buttonGoBack.setContentAreaFilled(false);
        buttonGoBack.setMaximumSize(new java.awt.Dimension(37, 37));
        buttonGoBack.setMinimumSize(new java.awt.Dimension(37, 37));
        buttonGoBack.setPreferredSize(new java.awt.Dimension(37, 37));
        buttonGoBack.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonVolverMouseOver.png"))); // NOI18N
        buttonGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGoBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEmptyLayout = new javax.swing.GroupLayout(panelEmpty);
        panelEmpty.setLayout(panelEmptyLayout);
        panelEmptyLayout.setHorizontalGroup(
            panelEmptyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmptyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonGoBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        panelEmptyLayout.setVerticalGroup(
            panelEmptyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEmptyLayout.createSequentialGroup()
                .addContainerGap(457, Short.MAX_VALUE)
                .addComponent(buttonGoBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(panelEmpty, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 500));

        contentScreenApp.setBackground(new java.awt.Color(255, 204, 204));
        contentScreenApp.setMaximumSize(new java.awt.Dimension(700, 450));
        contentScreenApp.setMinimumSize(new java.awt.Dimension(700, 450));

        javax.swing.GroupLayout contentScreenAppLayout = new javax.swing.GroupLayout(contentScreenApp);
        contentScreenApp.setLayout(contentScreenAppLayout);
        contentScreenAppLayout.setHorizontalGroup(
            contentScreenAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        contentScreenAppLayout.setVerticalGroup(
            contentScreenAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        getContentPane().add(contentScreenApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 700, 450));

        barraArriba.setBackground(new java.awt.Color(195, 225, 203));
        barraArriba.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        barraArriba.add(botonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, -1, -1));

        botonMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonMinimizar.png"))); // NOI18N
        botonMinimizar.setBorderPainted(false);
        botonMinimizar.setContentAreaFilled(false);
        botonMinimizar.setMaximumSize(new java.awt.Dimension(16, 16));
        botonMinimizar.setMinimumSize(new java.awt.Dimension(16, 16));
        botonMinimizar.setPreferredSize(new java.awt.Dimension(16, 16));
        botonMinimizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonMinimizarMouseOver.png"))); // NOI18N
        botonMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMinimizarActionPerformed(evt);
            }
        });
        barraArriba.add(botonMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/taskMasterProTitulo.png"))); // NOI18N
        barraArriba.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        getContentPane().add(barraArriba, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMinimizarActionPerformed
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_botonMinimizarActionPerformed

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        this.dispose();
        PantallaInicial.closeApp();
    }//GEN-LAST:event_botonCerrarActionPerformed

    public void closeApp()
    {
        homeScreen.goBackToLogin();
        this.dispose();    
    }
    
    private void ButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMenuActionPerformed
        //si el boton esta encendido se tiene que apagar
        if(menuOn)
        {
            //cierro el menu
            seeMenu(false);
        }
        else
        {
            //abro el menu
            seeMenu(true);
        }
    }//GEN-LAST:event_ButtonMenuActionPerformed

    public void replaceScreen(JPanel panel)
    {
        panel.setSize(700, 450);
        panel.setLocation(0, 0);
        
        contentScreen(panel,contentScreenApp); 
    }
    
    public void showGoBackButton()
    {
        buttonGoBack.setVisible(true);
    }
    
    private void buttonSeeUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeeUserActionPerformed
        //cambio la pantalla a ver usuario
        seeUserPanel = new SeeUserPanel(user);
        
        seeUserPanel.setSize(700, 450);
        seeUserPanel.setLocation(0, 0);
        
        contentScreen(seeUserPanel,contentScreenApp); 
        lastPanel = homescreenApp;
        
        //cierro el menu
        seeMenu(false);
        buttonGoBack.setVisible(true);
    }//GEN-LAST:event_buttonSeeUserActionPerformed

    private void buttonChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonChangePasswordActionPerformed
        //cambio la pantalla a modificar contraseña
        modifyPasswordPanel = new ModifyPasswordPanel(user, users);
        
        modifyPasswordPanel.setSize(700, 450);
        modifyPasswordPanel.setLocation(0, 0);
        
        contentScreen(modifyPasswordPanel,contentScreenApp); 
        lastPanel = homescreenApp;
        
        //cierro el menu
        seeMenu(false);
        buttonGoBack.setVisible(true);
    }//GEN-LAST:event_buttonChangePasswordActionPerformed

    private void buttonChangeLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonChangeLocationActionPerformed
        //cambio la pantalla a modificar la localizacion
        modifyLocationPanel = new ModifyLocationPanel(user, users);
        
        modifyLocationPanel.setSize(700, 450);
        modifyLocationPanel.setLocation(0, 0);
                
        contentScreen(modifyLocationPanel,contentScreenApp); 
        lastPanel = homescreenApp;
        
        //cierro el menu
        seeMenu(false);
        buttonGoBack.setVisible(true);
    }//GEN-LAST:event_buttonChangeLocationActionPerformed

    private void buttonDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteUserActionPerformed
        //cambio la pantalla a eliminar usuario
        deleteUserPanel = new DeleteUserPanel(user, users);
        
        deleteUserPanel.setSize(700, 450);
        deleteUserPanel.setLocation(0, 0);
                
        contentScreen(deleteUserPanel,contentScreenApp); 
        lastPanel = homescreenApp;
        
        //cierro el menu
        seeMenu(false);
        buttonGoBack.setVisible(true);
    }//GEN-LAST:event_buttonDeleteUserActionPerformed

    private void buttonInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInfoActionPerformed
        //cambio la pantalla a eliminar usuario
        infoAppPanel = new InfoTaskMasterProPanel();
        
        infoAppPanel.setSize(700, 450);
        infoAppPanel.setLocation(0, 0);
        
        contentScreen(infoAppPanel,contentScreenApp); 
        lastPanel = homescreenApp;
        
        //cierro el menu
        seeMenu(false);
        buttonGoBack.setVisible(true);
    }//GEN-LAST:event_buttonInfoActionPerformed

    private void buttonGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGoBackActionPerformed
        //actualizo el clima
        homescreenApp.updateWeather();
        
        contentScreen(lastPanel,contentScreenApp); 
        if(lastPanel.equals(homescreenApp))
            buttonGoBack.setVisible(false);
    }//GEN-LAST:event_buttonGoBackActionPerformed

    private void seeMenu(boolean see)
    {
        contentMenu.setVisible(see);

        menuOn = see;
    }
    
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
            java.util.logging.Logger.getLogger(AppUserLists.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppUserLists.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppUserLists.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppUserLists.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppUserLists(user, users).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonMenu;
    private javax.swing.JPanel barraArriba;
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton botonMinimizar;
    private javax.swing.JButton buttonChangeLocation;
    private javax.swing.JButton buttonChangePassword;
    private javax.swing.JButton buttonDeleteUser;
    private javax.swing.JButton buttonGoBack;
    private javax.swing.JButton buttonInfo;
    private javax.swing.JButton buttonSeeUser;
    private javax.swing.JPanel contentMenu;
    private javax.swing.JPanel contentScreenApp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPanel panelEmpty;
    // End of variables declaration//GEN-END:variables
}
