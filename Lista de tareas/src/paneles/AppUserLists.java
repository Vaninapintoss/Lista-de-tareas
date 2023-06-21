/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package paneles;

import java.awt.Frame;
import user.User;

/**
 *
 * @author sofia
 */
public class AppUserLists extends javax.swing.JFrame {

    /**
     * Creates new form AppUserLists
     */
    public static User user;
    public AppUserLists() {
        initComponents();
        setLocationRelativeTo(null);//para que la ventana inicie en el centro de la pantalla
    }

    public void setUser(User userN)
    {
        user = userN;
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
        botonCerrar = new javax.swing.JButton();
        botonMinimizar = new javax.swing.JButton();
        barraArriba = new javax.swing.JPanel();
        content = new javax.swing.JPanel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(botonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, -1, -1));

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
        getContentPane().add(botonMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, -1, -1));

        barraArriba.setBackground(new java.awt.Color(195, 225, 203));

        javax.swing.GroupLayout barraArribaLayout = new javax.swing.GroupLayout(barraArriba);
        barraArriba.setLayout(barraArribaLayout);
        barraArribaLayout.setHorizontalGroup(
            barraArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        barraArribaLayout.setVerticalGroup(
            barraArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(barraArriba, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 50));

        content.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        getContentPane().add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 700, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMinimizarActionPerformed
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_botonMinimizarActionPerformed

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCerrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
                new AppUserLists().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraArriba;
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton botonMinimizar;
    private javax.swing.JPanel content;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
