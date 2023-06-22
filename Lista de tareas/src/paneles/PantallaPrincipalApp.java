/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package paneles;

import static paneles.AppUserLists.user;

/**
 *
 * @author sofia
 */
public class PantallaPrincipalApp extends javax.swing.JPanel {

    /**
     * Creates new form PantallaPrincipalApp
     */
    public PantallaPrincipalApp() {
        initComponents();
        
        if(user.getLocation().isEmpty())
        {
            //si no tiene cargada una localizacion muestro un panel
        }
        else
        {
            //si tiene una localizacion muestro el clima
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentWeather = new javax.swing.JPanel();
        buttonTaskList = new javax.swing.JButton();
        buttonCalendarList = new javax.swing.JButton();
        buttonTrakingList = new javax.swing.JButton();

        setBackground(new java.awt.Color(195, 225, 203));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contentWeather.setBackground(new java.awt.Color(255, 204, 204));
        contentWeather.setMaximumSize(new java.awt.Dimension(660, 170));
        contentWeather.setMinimumSize(new java.awt.Dimension(660, 170));
        contentWeather.setPreferredSize(new java.awt.Dimension(660, 170));

        javax.swing.GroupLayout contentWeatherLayout = new javax.swing.GroupLayout(contentWeather);
        contentWeather.setLayout(contentWeatherLayout);
        contentWeatherLayout.setHorizontalGroup(
            contentWeatherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        contentWeatherLayout.setVerticalGroup(
            contentWeatherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        add(contentWeather, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        buttonTaskList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonTaskList.png"))); // NOI18N
        buttonTaskList.setBorderPainted(false);
        buttonTaskList.setContentAreaFilled(false);
        buttonTaskList.setMaximumSize(new java.awt.Dimension(661, 55));
        buttonTaskList.setMinimumSize(new java.awt.Dimension(661, 55));
        buttonTaskList.setPreferredSize(new java.awt.Dimension(661, 55));
        buttonTaskList.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonTaskListMouseOver.png"))); // NOI18N
        add(buttonTaskList, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        buttonCalendarList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonListaCalendario.png"))); // NOI18N
        buttonCalendarList.setBorderPainted(false);
        buttonCalendarList.setContentAreaFilled(false);
        buttonCalendarList.setMaximumSize(new java.awt.Dimension(661, 55));
        buttonCalendarList.setMinimumSize(new java.awt.Dimension(661, 55));
        buttonCalendarList.setPreferredSize(new java.awt.Dimension(661, 55));
        buttonCalendarList.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonListaCalendarioMouseOver.png"))); // NOI18N
        buttonCalendarList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCalendarListActionPerformed(evt);
            }
        });
        add(buttonCalendarList, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        buttonTrakingList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonListaTraqueo.png"))); // NOI18N
        buttonTrakingList.setBorderPainted(false);
        buttonTrakingList.setContentAreaFilled(false);
        buttonTrakingList.setMaximumSize(new java.awt.Dimension(661, 55));
        buttonTrakingList.setMinimumSize(new java.awt.Dimension(661, 55));
        buttonTrakingList.setPreferredSize(new java.awt.Dimension(661, 55));
        buttonTrakingList.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonListaTraqueoMouseOver.png"))); // NOI18N
        add(buttonTrakingList, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCalendarListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalendarListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCalendarListActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCalendarList;
    private javax.swing.JButton buttonTaskList;
    private javax.swing.JButton buttonTrakingList;
    private javax.swing.JPanel contentWeather;
    // End of variables declaration//GEN-END:variables
}
