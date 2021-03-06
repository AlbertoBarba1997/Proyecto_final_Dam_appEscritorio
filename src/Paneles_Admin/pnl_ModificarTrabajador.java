/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles_Admin;

import Interfaces.Menu_admin_interfaz;
import Util.Utilidades;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juana
 */
public class pnl_ModificarTrabajador extends javax.swing.JPanel {

    Menu_admin_interfaz interfaz_menu_padre;
    BufferedReader inSocket;
    PrintWriter outSocket;
    
    String dniSeleccionado ;
    String nombre ;
    String apellidos;
    String correo;
    float salario;
    
    public pnl_ModificarTrabajador(Menu_admin_interfaz interfaz_menu_padre, BufferedReader inSocket, PrintWriter outSocket,Object[] datosTrabajador ) {
        initComponents();
        this.interfaz_menu_padre=interfaz_menu_padre;
        this.inSocket=inSocket;
        this.outSocket=outSocket;
        
        dniSeleccionado=(String) datosTrabajador[0];
        nombre=(String) datosTrabajador[1];
        apellidos=(String) datosTrabajador[2];
        correo=(String) datosTrabajador[3];
        salario=(Float) datosTrabajador[4];
        
        rellenarCampos();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        home_bt = new Recursos.RSButtonMetro();
        home_bt1 = new Recursos.RSButtonMetro();
        error_lb = new javax.swing.JLabel();
        dni_tf = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        nombre_tf = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        apellidos_tf = new javax.swing.JTextField();
        salario_tf = new javax.swing.JTextField();
        correo_tf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rol_combo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1390, 689));

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MODIFICAR TRABAJADOR");
        jLabel1.setAutoscrolls(true);

        home_bt.setBackground(new java.awt.Color(74, 31, 61));
        home_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8_back_arrow_50px.png"))); // NOI18N
        home_bt.setToolTipText("");
        home_bt.setColorHover(new java.awt.Color(112, 62, 97));
        home_bt.setColorNormal(new java.awt.Color(74, 31, 61));
        home_bt.setOpaque(false);
        home_bt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home_btMouseClicked(evt);
            }
        });
        home_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_btActionPerformed(evt);
            }
        });

        home_bt1.setBackground(new java.awt.Color(74, 31, 61));
        home_bt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8_checkmark_40px.png"))); // NOI18N
        home_bt1.setText("Modificar");
        home_bt1.setToolTipText("");
        home_bt1.setColorHover(new java.awt.Color(112, 62, 97));
        home_bt1.setColorNormal(new java.awt.Color(74, 31, 61));
        home_bt1.setOpaque(false);
        home_bt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home_bt1MouseClicked(evt);
            }
        });
        home_bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_bt1ActionPerformed(evt);
            }
        });

        error_lb.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        error_lb.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        dni_tf.setEditable(false);
        dni_tf.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        dni_tf.setForeground(new java.awt.Color(255, 255, 255));
        dni_tf.setBorder(null);
        dni_tf.setCaretColor(new java.awt.Color(255, 255, 255));
        dni_tf.setOpaque(false);
        dni_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dni_tfActionPerformed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));

        nombre_tf.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nombre_tf.setForeground(new java.awt.Color(255, 255, 255));
        nombre_tf.setBorder(null);
        nombre_tf.setCaretColor(new java.awt.Color(255, 255, 255));
        nombre_tf.setOpaque(false);
        nombre_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_tfActionPerformed(evt);
            }
        });

        jSeparator4.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator4.setForeground(new java.awt.Color(204, 204, 204));

        jSeparator5.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator5.setForeground(new java.awt.Color(204, 204, 204));

        jSeparator6.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator6.setForeground(new java.awt.Color(204, 204, 204));

        apellidos_tf.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        apellidos_tf.setForeground(new java.awt.Color(255, 255, 255));
        apellidos_tf.setBorder(null);
        apellidos_tf.setCaretColor(new java.awt.Color(255, 255, 255));
        apellidos_tf.setOpaque(false);
        apellidos_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidos_tfActionPerformed(evt);
            }
        });

        salario_tf.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        salario_tf.setForeground(new java.awt.Color(255, 255, 255));
        salario_tf.setBorder(null);
        salario_tf.setCaretColor(new java.awt.Color(255, 255, 255));
        salario_tf.setOpaque(false);
        salario_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salario_tfActionPerformed(evt);
            }
        });

        correo_tf.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        correo_tf.setForeground(new java.awt.Color(255, 255, 255));
        correo_tf.setBorder(null);
        correo_tf.setCaretColor(new java.awt.Color(255, 255, 255));
        correo_tf.setOpaque(false);
        correo_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correo_tfActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("*DNI: ");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("€");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");

        rol_combo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rol_combo.setForeground(new java.awt.Color(0, 0, 0));
        rol_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 - Administrador", "2 - Entrenador", "4 - Mantenimiento" }));
        rol_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rol_comboActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellidos:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Salario:");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("*Correo:");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Rol:");

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(home_bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(573, 573, 573))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(home_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(445, 445, 445)
                        .addComponent(jLabel1)
                        .addContainerGap(432, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(error_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel7)))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rol_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(apellidos_tf)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(salario_tf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dni_tf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nombre_tf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(correo_tf)
                                    .addComponent(jSeparator4)
                                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(390, 390, 390))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(home_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dni_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(apellidos_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(correo_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(salario_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel5)))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rol_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(54, 54, 54)
                        .addComponent(home_bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(error_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void home_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_btActionPerformed
        //esconderMenu();
    }//GEN-LAST:event_home_btActionPerformed

    private void home_btMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_btMouseClicked
        interfaz_menu_padre.cambiarPanelContenido(new pnl_Trabajadores(interfaz_menu_padre, inSocket, outSocket));
        
    }//GEN-LAST:event_home_btMouseClicked

    private void home_bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_bt1ActionPerformed
        //0 resetear mensaje error
        error_lb.setText("");

        //1 comprobar que los campos estan llenos
        if(dni_tf.getText().equals("") || nombre_tf.getText().equals("") || apellidos_tf.getText().equals("")){
            error_lb.setText("Rellene correctamente los campos obligatorios");
        }else{

            //2 Obtener campos del trabajador
            String DNI=dni_tf.getText();
            String nombre=nombre_tf.getText();
            String apellidos=apellidos_tf.getText();
            float salario=Float.parseFloat(salario_tf.getText());
            String correo=correo_tf.getText();
            int rol=Integer.parseInt((rol_combo.getSelectedItem().toString()).substring(0, 1));
            

            //3 Lanzar peticion al servidor para dar de alta al nuevo trabajador
            modificarTrabajador(DNI, nombre, apellidos, salario, correo, rol);

        }
    }//GEN-LAST:event_home_bt1ActionPerformed

    private void home_bt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_bt1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_home_bt1MouseClicked

    private void dni_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dni_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dni_tfActionPerformed

    private void nombre_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_tfActionPerformed

    private void apellidos_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidos_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidos_tfActionPerformed

    private void salario_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salario_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salario_tfActionPerformed

    private void correo_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correo_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correo_tfActionPerformed

    private void rol_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rol_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rol_comboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidos_tf;
    private javax.swing.JTextField correo_tf;
    private javax.swing.JTextField dni_tf;
    private javax.swing.JLabel error_lb;
    private Recursos.RSButtonMetro home_bt;
    private Recursos.RSButtonMetro home_bt1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField nombre_tf;
    private javax.swing.JComboBox<String> rol_combo;
    private javax.swing.JTextField salario_tf;
    // End of variables declaration//GEN-END:variables

    

    private void rellenarCampos() {
        dni_tf.setText(dniSeleccionado);
        nombre_tf.setText(nombre);
        apellidos_tf.setText(apellidos);
        correo_tf.setText(correo);
        salario_tf.setText(Float.toString(salario));
        
    }

    private void modificarTrabajador(String DNI, String nombre, String apellidos, float salario, String correo, int rol) {
        Thread thread_altaTrabajador = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    
                   

                    outSocket.write("C9-MODIFICAR_TRABAJADOR:"+DNI+","+nombre+","+apellidos+","+salario+","+correo+","+rol +"\n");
                    outSocket.flush();

                    String respuestaServidor = inSocket.readLine();
                    
                    
                    if (respuestaServidor.contains("S17-MODIFICACION_COMPLETADA")) interfaz_menu_padre.cambiarPanelContenido(new pnl_Trabajadores(interfaz_menu_padre, inSocket, outSocket)); 
                    else if(respuestaServidor.contains("S18-ERROR_CORREO")) error_lb.setText("Error de modificacion: Correo ya registrado previamente, pruebe con otro.");
                    else error_lb.setText("Error de modificacion. Puede que el trabajador haya sido eliminado por otro administrador.");

                } catch (IOException ex) {
                    Logger.getLogger(pnl_Trabajadores.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        thread_altaTrabajador.start();
    }
}
