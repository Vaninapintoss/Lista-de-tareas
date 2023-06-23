/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package paneles.ListasPaneles;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import list.List;
import static paneles.AppUserLists.userLists;
import static paneles.PantallaInicial.app;
import userLists.UserLists;
import userLists.exceptions.CategoryListAlreadyExistException;

/**
 *
 * @author sofia
 */
public class TaskListPanel extends javax.swing.JPanel {

    
    /**
     * Creates new form TaskListPanel
     */
    private ArrayList<JButton> buttons;
    private int number;
    private UserLists userLists;
    
    public TaskListPanel(UserLists userLists) {
        this.userLists = userLists;
        initComponents();
        updateButtons();        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text_error = new javax.swing.JLabel();
        buttonGoBack = new javax.swing.JButton();
        titleTaskList = new javax.swing.JLabel();
        infoNewList = new javax.swing.JLabel();
        text_newList = new javax.swing.JTextField();
        buttonCreate = new javax.swing.JButton();
        backGroundText = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();
        backgroundTaskList = new javax.swing.JLabel();

        setBackground(new java.awt.Color(195, 225, 203));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text_error.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        text_error.setForeground(new java.awt.Color(255, 153, 153));
        text_error.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        add(text_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 350, 20));

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
        add(buttonGoBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        titleTaskList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listas/tituloListaSimpleGeneral.png"))); // NOI18N
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
        buttonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCreateActionPerformed(evt);
            }
        });
        add(buttonCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, -1, -1));

        backGroundText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listas/espacioTextoList.png"))); // NOI18N
        add(backGroundText, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(0, 128, 97));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(0, 128, 97));
        jScrollPane1.setOpaque(false);

        panel.setBackground(new java.awt.Color(0, 128, 97));
        panel.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane1.setViewportView(panel);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 600, 200));

        backgroundTaskList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listas/fondoListas.png"))); // NOI18N
        add(backgroundTaskList, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void buttonGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGoBackActionPerformed
        //vuelve a la pantalla principal
        app.replaceScreen(app.homescreenApp);
    }//GEN-LAST:event_buttonGoBackActionPerformed

    //agrego las listas guardadas en el archivo en la lista de botones
    private void updateButtons()
    {
        JButton button;
        String listas = userLists.getSimpleLists().showLists();//obtengo todas las listas en un string
        panel.removeAll();
        if(!listas.isEmpty())
        {
            //las divido en un array
            String[] parts = listas.split("_");
        
            for(String aux : parts)
            {
                button = createButton(aux);//creo un boton y le envio la info de la lista
                System.out.println(0);
                panel.add(button);//acgrego el boton al panel
            }
            
        }
        
        panel.updateUI();//actualizar ver botones
    }
    
    private JButton createButton(String info)
    {
        //crear boton
        JButton button = new JButton(info);
        
        //visual del boton
        button.setBackground(new Color(0,82,77));
        button.setForeground(new Color(195,225,203));
        
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //crear SimpleTaskPanel y enviarle la lista
                
            }
        }
        );
        
        return button;
    }
    
    private void buttonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCreateActionPerformed
        
        text_error.setText("");//reinicio los mensajes de error
        try
        {
            //trato de agregar una nueva lista
            userLists.addSimpleList(text_newList.getText());
            
            //actualizo los botones
            updateButtons();  
        }
        catch(CategoryListAlreadyExistException ex)
        {
            //si existe tiro un mensaje
            text_error.setText("La lista "+text_newList.getText()+" ya existe");
        }
 
        text_newList.setText("");//reseteo el campo de texto
    }//GEN-LAST:event_buttonCreateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backGroundText;
    private javax.swing.JLabel backgroundTaskList;
    private javax.swing.JButton buttonCreate;
    private javax.swing.JButton buttonGoBack;
    private javax.swing.JLabel infoNewList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel text_error;
    private javax.swing.JTextField text_newList;
    private javax.swing.JLabel titleTaskList;
    // End of variables declaration//GEN-END:variables
}
