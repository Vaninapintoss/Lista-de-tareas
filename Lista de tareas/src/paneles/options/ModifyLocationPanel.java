/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package paneles.options;

import java.io.IOException;
import location.Exceptions.InvalidLocationException;
import location.Location;
import user.User;
import user.UsersSystem;

/**
 *
 * @author sofia
 */
public class ModifyLocationPanel extends javax.swing.JPanel {

    /**
     * Creates new form ModifyLocationPanel
     */
    private String city, state, country;
    private User user;
    private UsersSystem users;
    public ModifyLocationPanel(User user, UsersSystem users) {
        this.user = user;
        this.users = users;
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

        buttonModify = new javax.swing.JButton();
        ciudadLabel = new javax.swing.JLabel();
        provinciaLabel = new javax.swing.JLabel();
        paisLabel = new javax.swing.JLabel();
        text_city = new javax.swing.JTextField();
        text_state = new javax.swing.JTextField();
        text_country = new javax.swing.JTextField();
        fondoTexto = new javax.swing.JLabel();
        fondoTexto1 = new javax.swing.JLabel();
        fondoTexto2 = new javax.swing.JLabel();
        text_errorCity = new javax.swing.JLabel();
        text_errorState = new javax.swing.JLabel();
        text_errorCountry = new javax.swing.JLabel();
        text_errorModify = new javax.swing.JLabel();
        text_locationSuccesful = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setBackground(new java.awt.Color(195, 225, 203));
        setMinimumSize(new java.awt.Dimension(700, 450));
        setPreferredSize(new java.awt.Dimension(700, 450));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonModify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modifyUser/Location/botonModificar.png"))); // NOI18N
        buttonModify.setBorderPainted(false);
        buttonModify.setContentAreaFilled(false);
        buttonModify.setMaximumSize(new java.awt.Dimension(110, 40));
        buttonModify.setMinimumSize(new java.awt.Dimension(110, 40));
        buttonModify.setPreferredSize(new java.awt.Dimension(110, 40));
        buttonModify.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modifyUser/Location/botonModificarMouseOver.png"))); // NOI18N
        buttonModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModifyActionPerformed(evt);
            }
        });
        add(buttonModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, -1, -1));

        ciudadLabel.setBackground(new java.awt.Color(195, 225, 203));
        ciudadLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        ciudadLabel.setForeground(new java.awt.Color(195, 225, 203));
        ciudadLabel.setText("Ciudad");
        add(ciudadLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

        provinciaLabel.setBackground(new java.awt.Color(195, 225, 203));
        provinciaLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        provinciaLabel.setForeground(new java.awt.Color(195, 225, 203));
        provinciaLabel.setText("Provincia/Estado");
        add(provinciaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        paisLabel.setBackground(new java.awt.Color(195, 225, 203));
        paisLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        paisLabel.setForeground(new java.awt.Color(195, 225, 203));
        paisLabel.setText("Pais");
        add(paisLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));

        text_city.setBackground(new java.awt.Color(195, 225, 203));
        text_city.setForeground(new java.awt.Color(102, 102, 102));
        text_city.setBorder(null);
        text_city.setMaximumSize(new java.awt.Dimension(370, 30));
        text_city.setMinimumSize(new java.awt.Dimension(370, 30));
        text_city.setPreferredSize(new java.awt.Dimension(370, 30));
        add(text_city, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 350, -1));

        text_state.setBackground(new java.awt.Color(195, 225, 203));
        text_state.setForeground(new java.awt.Color(102, 102, 102));
        text_state.setBorder(null);
        text_state.setMaximumSize(new java.awt.Dimension(370, 30));
        text_state.setMinimumSize(new java.awt.Dimension(370, 30));
        text_state.setPreferredSize(new java.awt.Dimension(370, 30));
        add(text_state, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 350, -1));

        text_country.setBackground(new java.awt.Color(195, 225, 203));
        text_country.setForeground(new java.awt.Color(102, 102, 102));
        text_country.setBorder(null);
        text_country.setMaximumSize(new java.awt.Dimension(370, 30));
        text_country.setMinimumSize(new java.awt.Dimension(370, 30));
        text_country.setPreferredSize(new java.awt.Dimension(370, 30));
        add(text_country, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 350, -1));

        fondoTexto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonesLogIn/barraTexto.png"))); // NOI18N
        add(fondoTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        fondoTexto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonesLogIn/barraTexto.png"))); // NOI18N
        add(fondoTexto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        fondoTexto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonesLogIn/barraTexto.png"))); // NOI18N
        add(fondoTexto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        text_errorCity.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        text_errorCity.setForeground(new java.awt.Color(255, 153, 153));
        text_errorCity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        add(text_errorCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 120, 370, 20));

        text_errorState.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        text_errorState.setForeground(new java.awt.Color(255, 153, 153));
        text_errorState.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        add(text_errorState, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 200, 370, 20));

        text_errorCountry.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        text_errorCountry.setForeground(new java.awt.Color(255, 153, 153));
        text_errorCountry.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        add(text_errorCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 370, 20));

        text_errorModify.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        text_errorModify.setForeground(new java.awt.Color(255, 153, 153));
        text_errorModify.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(text_errorModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 370, 20));

        text_locationSuccesful.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        text_locationSuccesful.setForeground(new java.awt.Color(0, 204, 0));
        text_locationSuccesful.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(text_locationSuccesful, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 370, 20));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modifyUser/background.png"))); // NOI18N
        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    /**
     * resetInfoText
     */
    private void resetInfoText()
    {
        text_errorCity.setText("");
        text_errorState.setText("");
        text_errorCountry.setText("");
        text_errorModify.setText("");
        text_locationSuccesful.setText("");
    }
    
    /**
     * buttonModifyActionPerformed
     * @param evt 
     */
    private void buttonModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModifyActionPerformed
        
        boolean modify = true;
        
        resetInfoText();
        
        if(text_city.getText().isEmpty())
        {
            text_errorCity.setText("Ingrese una ciudad");
            modify = false;
        }
        if(text_state.getText().isEmpty())
        {
            text_errorState.setText("Ingrese una provincia o estado");
            modify = false;
        }
        if(text_country.getText().isEmpty())
        {
            text_errorCountry.setText("Ingrese un pais");
            modify = false;
        }
        
        if(modify)
        {
            //si todos los campos tienen texto
           
            try
            {
                //asigno la localizacion al usuario                
                //la asigno al usuario
                user.setLocation(text_city.getText(), text_state.getText(),
                                 text_country.getText());
                
                //actualizo el usuario en el sistema
                users.modifyUser(user);
                
                text_locationSuccesful.setText("Localizacion modificada exitosamente");
            }
            catch(InvalidLocationException ex)
            {
                text_errorModify.setText("Localizacion invalida");
            }
            catch(IOException ex)
            {
                text_errorModify.setText("Algo salio mal");
            }
        }
    }//GEN-LAST:event_buttonModifyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton buttonModify;
    private javax.swing.JLabel ciudadLabel;
    private javax.swing.JLabel fondoTexto;
    private javax.swing.JLabel fondoTexto1;
    private javax.swing.JLabel fondoTexto2;
    private javax.swing.JLabel paisLabel;
    private javax.swing.JLabel provinciaLabel;
    private javax.swing.JTextField text_city;
    private javax.swing.JTextField text_country;
    private javax.swing.JLabel text_errorCity;
    private javax.swing.JLabel text_errorCountry;
    private javax.swing.JLabel text_errorModify;
    private javax.swing.JLabel text_errorState;
    private javax.swing.JLabel text_locationSuccesful;
    private javax.swing.JTextField text_state;
    // End of variables declaration//GEN-END:variables
}
