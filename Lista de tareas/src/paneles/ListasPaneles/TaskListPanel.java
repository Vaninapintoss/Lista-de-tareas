/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package paneles.ListasPaneles;

/**
 *
 * @author sofia
 */
public class TaskListPanel extends javax.swing.JPanel {

    /**
     * Creates new form TaskListPanel
     */
    public TaskListPanel() {
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

        titleTaskList = new javax.swing.JLabel();
        infoNewList = new javax.swing.JLabel();
        text_newList = new javax.swing.JTextField();
        buttonCreate = new javax.swing.JButton();
        backGroundText = new javax.swing.JLabel();
        backgroundTaskList = new javax.swing.JLabel();

        setBackground(new java.awt.Color(195, 225, 203));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleTaskList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listas/tituloListaSimpleGeneral.png"))); // NOI18N
        titleTaskList.setMaximumSize(new java.awt.Dimension(660, 55));
        titleTaskList.setMinimumSize(new java.awt.Dimension(660, 55));
        titleTaskList.setPreferredSize(new java.awt.Dimension(660, 55));
        add(titleTaskList, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        infoNewList.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        infoNewList.setForeground(new java.awt.Color(195, 225, 203));
        infoNewList.setText("Crear nueva lista");
        add(infoNewList, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, 30));

        text_newList.setBackground(new java.awt.Color(195, 225, 203));
        text_newList.setForeground(new java.awt.Color(102, 102, 102));
        text_newList.setBorder(null);
        text_newList.setPreferredSize(new java.awt.Dimension(100, 30));
        add(text_newList, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 440, -1));

        buttonCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listas/botonCrear.png"))); // NOI18N
        buttonCreate.setBorderPainted(false);
        buttonCreate.setContentAreaFilled(false);
        buttonCreate.setMaximumSize(new java.awt.Dimension(94, 30));
        buttonCreate.setMinimumSize(new java.awt.Dimension(94, 30));
        buttonCreate.setPreferredSize(new java.awt.Dimension(94, 30));
        buttonCreate.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listas/botonCrearMouseOver.png"))); // NOI18N
        add(buttonCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, -1, -1));

        backGroundText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listas/espacioTextoList.png"))); // NOI18N
        backGroundText.setMaximumSize(new java.awt.Dimension(465, 30));
        backGroundText.setMinimumSize(new java.awt.Dimension(465, 30));
        backGroundText.setPreferredSize(new java.awt.Dimension(465, 30));
        add(backGroundText, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        backgroundTaskList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listas/fondoListas.png"))); // NOI18N
        backgroundTaskList.setMaximumSize(new java.awt.Dimension(660, 315));
        backgroundTaskList.setMinimumSize(new java.awt.Dimension(660, 315));
        backgroundTaskList.setPreferredSize(new java.awt.Dimension(660, 315));
        add(backgroundTaskList, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backGroundText;
    private javax.swing.JLabel backgroundTaskList;
    private javax.swing.JButton buttonCreate;
    private javax.swing.JLabel infoNewList;
    private javax.swing.JTextField text_newList;
    private javax.swing.JLabel titleTaskList;
    // End of variables declaration//GEN-END:variables
}
