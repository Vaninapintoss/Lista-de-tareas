/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package paneles.menu;

/**
 *
 * @author sofia
 */
public class menu extends javax.swing.JPanel 
{
    public static int option;//1 Ver usuario |2 Modificar contraseña |3 Modificar localizacion
                             //4 Eliminar usuario |5 Info sobre TaskMaster Pro

    /**
     * Creates new form menu
     */
    public menu() {
        initComponents();
        option = 0;//no hay ninguna opcion
    }
    
    public int getOpcion()
    {
        return option;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(195, 225, 203));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setMaximumSize(new java.awt.Dimension(182, 20));
        jButton1.setMinimumSize(new java.awt.Dimension(182, 20));
        jButton1.setPreferredSize(new java.awt.Dimension(182, 20));
        jButton1.setRequestFocusEnabled(false);
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jButton2.setMaximumSize(new java.awt.Dimension(182, 20));
        jButton2.setMinimumSize(new java.awt.Dimension(182, 20));
        jButton2.setPreferredSize(new java.awt.Dimension(182, 20));
        jButton2.setRequestFocusEnabled(false);
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jButton3.setMaximumSize(new java.awt.Dimension(182, 20));
        jButton3.setMinimumSize(new java.awt.Dimension(182, 20));
        jButton3.setPreferredSize(new java.awt.Dimension(182, 20));
        jButton3.setRequestFocusEnabled(false);
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jButton4.setMaximumSize(new java.awt.Dimension(182, 20));
        jButton4.setMinimumSize(new java.awt.Dimension(182, 20));
        jButton4.setPreferredSize(new java.awt.Dimension(182, 20));
        jButton4.setRequestFocusEnabled(false);
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jButton5.setMaximumSize(new java.awt.Dimension(182, 20));
        jButton5.setMinimumSize(new java.awt.Dimension(182, 20));
        jButton5.setPreferredSize(new java.awt.Dimension(182, 20));
        jButton5.setRequestFocusEnabled(false);
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu/background.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(203, 187));
        jLabel1.setMinimumSize(new java.awt.Dimension(203, 187));
        jLabel1.setPreferredSize(new java.awt.Dimension(203, 187));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
