/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package paneles.ListasPaneles;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.time.LocalDate;
import javax.swing.JButton;
import list.exceptions.ElementAlreadyExistException;
import list.exceptions.TaskUntilNotCompletedException;
import list.task.DateTask;
import static paneles.PantallaInicial.app;
import userLists.UserLists;
import userLists.exceptions.UnfinishedTasksException;

/**
 *
 * @author sofia
 */
public class CalendarTaskPanel extends javax.swing.JPanel {

    private UserLists userLists;
    private String category;
    /**
     * Creates new form CalendarTaskPanel
     */
    public CalendarTaskPanel(UserLists userLists, String category) {
        
        this.userLists = userLists;
        this.category = category;
        initComponents();
        updateButtons();
        text_titleList.setText(category.toUpperCase());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonDeleteList = new javax.swing.JButton();
        text_titleList = new javax.swing.JLabel();
        titleTaskList = new javax.swing.JLabel();
        text_error = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        text_day = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        text_month = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        text_year = new javax.swing.JTextField();
        text_newTask = new javax.swing.JTextField();
        infoNewList = new javax.swing.JLabel();
        buttonCreate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();
        backGroundText = new javax.swing.JLabel();
        backgroundTaskList = new javax.swing.JLabel();
        buttonGoBack1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(195, 225, 203));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonDeleteList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listas/botonDelete.png"))); // NOI18N
        buttonDeleteList.setBorderPainted(false);
        buttonDeleteList.setContentAreaFilled(false);
        buttonDeleteList.setMaximumSize(new java.awt.Dimension(37, 37));
        buttonDeleteList.setMinimumSize(new java.awt.Dimension(37, 37));
        buttonDeleteList.setPreferredSize(new java.awt.Dimension(37, 37));
        buttonDeleteList.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listas/botonDeleteMouseOver.png"))); // NOI18N
        buttonDeleteList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteListActionPerformed(evt);
            }
        });
        add(buttonDeleteList, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, -1, -1));

        text_titleList.setBackground(new java.awt.Color(195, 225, 203));
        text_titleList.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        text_titleList.setForeground(new java.awt.Color(195, 225, 203));
        text_titleList.setText("PROGRA");
        add(text_titleList, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 21, -1, 30));

        titleTaskList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listas/titulosListaSimpleParticular.png"))); // NOI18N
        add(titleTaskList, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        text_error.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        text_error.setForeground(new java.awt.Color(255, 153, 153));
        text_error.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        add(text_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 350, 20));

        jLabel1.setBackground(new java.awt.Color(195, 225, 203));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(195, 225, 203));
        jLabel1.setText("Dia");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, 30));

        text_day.setBackground(new java.awt.Color(195, 225, 203));
        text_day.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        text_day.setForeground(new java.awt.Color(102, 102, 102));
        text_day.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_day.setBorder(null);
        text_day.setOpaque(false);
        text_day.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text_dayKeyTyped(evt);
            }
        });
        add(text_day, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 30, 30));

        jLabel4.setBackground(new java.awt.Color(195, 225, 203));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(195, 225, 203));
        jLabel4.setText("Mes");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, 30));

        text_month.setBackground(new java.awt.Color(195, 225, 203));
        text_month.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        text_month.setForeground(new java.awt.Color(102, 102, 102));
        text_month.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_month.setBorder(null);
        text_month.setOpaque(false);
        text_month.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text_monthKeyTyped(evt);
            }
        });
        add(text_month, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 30, 30));

        jLabel5.setBackground(new java.awt.Color(195, 225, 203));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(195, 225, 203));
        jLabel5.setText("Año");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, 30));

        text_year.setBackground(new java.awt.Color(195, 225, 203));
        text_year.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        text_year.setForeground(new java.awt.Color(102, 102, 102));
        text_year.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_year.setBorder(null);
        text_year.setOpaque(false);
        text_year.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text_yearKeyTyped(evt);
            }
        });
        add(text_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 30, 30));

        text_newTask.setBackground(new java.awt.Color(195, 225, 203));
        text_newTask.setForeground(new java.awt.Color(102, 102, 102));
        text_newTask.setBorder(null);
        text_newTask.setPreferredSize(new java.awt.Dimension(100, 30));
        add(text_newTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 440, -1));

        infoNewList.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        infoNewList.setForeground(new java.awt.Color(195, 225, 203));
        infoNewList.setText("Crear nueva tarea");
        add(infoNewList, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, 30));

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

        jScrollPane1.setBackground(new java.awt.Color(0, 128, 97));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(0, 128, 97));
        jScrollPane1.setOpaque(false);

        panel.setBackground(new java.awt.Color(0, 128, 97));
        panel.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane1.setViewportView(panel);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 600, 200));

        backGroundText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listas/espacioTextoList.png"))); // NOI18N
        add(backGroundText, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        backgroundTaskList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listas/fondoListas.png"))); // NOI18N
        add(backgroundTaskList, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        buttonGoBack1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonVolver.png"))); // NOI18N
        buttonGoBack1.setBorderPainted(false);
        buttonGoBack1.setContentAreaFilled(false);
        buttonGoBack1.setMaximumSize(new java.awt.Dimension(37, 37));
        buttonGoBack1.setMinimumSize(new java.awt.Dimension(37, 37));
        buttonGoBack1.setPreferredSize(new java.awt.Dimension(37, 37));
        buttonGoBack1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonVolverMouseOver.png"))); // NOI18N
        buttonGoBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGoBack1ActionPerformed(evt);
            }
        });
        add(buttonGoBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    //agrego las listas guardadas en el archivo en la lista de botones
    public void updateButtons()
    {
        JButton button;
        try
        {
            userLists.readSimpleFromFile();
        }
        catch(IOException ex)
        {}
        
        String listas = userLists.getDateLists().getDateList(category).showTasks();
        panel.removeAll();
        if(!listas.isEmpty())
        {
            //las divido en un array
            String[] parts = listas.split("_");
        
            for(String aux : parts)
            {
                button = createButton(aux);//creo un boton y le envio la info de la lista
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
                // | 
                //elimino la tarea de la lista
                
                //las divido en un array
                String[] parts = info.split(" | ");
                try
                {
                    userLists.getDateLists().getDateList(category).deleteTask(parts[1]);
                }
                catch(TaskUntilNotCompletedException ex)
                {
                    System.out.println("no elimina");
                }
                
                userLists.saveSimpleInFile();
                
                //actualizo el panel
                updateButtons();
            }
        }
        );
        
        return button;
    }
    
    private void text_dayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_dayKeyTyped
        //valida que la tecla ingresada por teclado sea solo numero
        char validate = evt.getKeyChar();

        if(Character.isLetter(validate))
        {
            //borro la ultima letra ingresara
            evt.consume();
        }
    }//GEN-LAST:event_text_dayKeyTyped

    private void text_monthKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_monthKeyTyped
        //valida que la tecla ingresada por teclado sea solo numero
        char validate = evt.getKeyChar();

        if(Character.isLetter(validate))
        {
            //borro la ultima letra ingresara
            evt.consume();
        }
    }//GEN-LAST:event_text_monthKeyTyped

    private void text_yearKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_yearKeyTyped
        //valida que la tecla ingresada por teclado sea solo numero
        char validate = evt.getKeyChar();

        if(Character.isLetter(validate))
        {
            //borro la ultima letra ingresara
            evt.consume();
        }
    }//GEN-LAST:event_text_yearKeyTyped

    private void buttonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCreateActionPerformed

        
        text_error.setText("");//reinicio los mensajes de error
        if(text_newTask.getText().isEmpty())
        {
            text_error.setText("No se puede agregar una tarea vacia");
        }
        else if((text_day.getText().isEmpty())||(text_month.getText().isEmpty())||
                (text_month.getText().isEmpty()))
        {
            text_error.setText("Completar la fecha a finalizar");
        }
        else
        {
            try
            {
                //trato de agregar una nueva lista
                int year = Integer.parseInt(text_year.getText());
                int month = Integer.parseInt(text_month.getText());
                int day = Integer.parseInt(text_day.getText());
                
                LocalDate date = LocalDate.of(year, month, day);
                
                DateTask task = new DateTask(text_newTask.getText(),date);
                
                userLists.getDateLists().getDateList(category).addTask(task);

                userLists.saveSimpleInFile();
                //actualizo los botones
                updateButtons();
            }
            catch(ElementAlreadyExistException ex)
            {
                //si existe tiro un mensaje
                text_error.setText("La tarea "+text_newTask.getText()+" ya existe");
            }
        }

        text_newTask.setText("");//reseteo el campo de texto
        text_day.setText("");
        text_month.setText("");
        text_year.setText("");

    }//GEN-LAST:event_buttonCreateActionPerformed

    private void buttonGoBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGoBack1ActionPerformed
        //vuelve a la pantalla principal
        app.replaceScreen(app.homescreenApp);
    }//GEN-LAST:event_buttonGoBack1ActionPerformed

    private void buttonDeleteListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteListActionPerformed
        // TODO add your handling code here:
        try
        {
            userLists.deleteDateList(category);//elimino la lista

            //vuelvo a la pantalla principal
            app.replaceScreen(app.homescreenApp);
        }
        catch(UnfinishedTasksException ex)
        {
            text_error.setText("No se puede eliminar un lista con tareas pendientes");
        }
    }//GEN-LAST:event_buttonDeleteListActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backGroundText;
    private javax.swing.JLabel backgroundTaskList;
    private javax.swing.JButton buttonCreate;
    private javax.swing.JButton buttonDeleteList;
    private javax.swing.JButton buttonGoBack1;
    private javax.swing.JLabel infoNewList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField text_day;
    private javax.swing.JLabel text_error;
    private javax.swing.JTextField text_month;
    private javax.swing.JTextField text_newTask;
    private javax.swing.JLabel text_titleList;
    private javax.swing.JTextField text_year;
    private javax.swing.JLabel titleTaskList;
    // End of variables declaration//GEN-END:variables
}
