/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Paneles_Admin.pnl_AltaCliente;
import Paneles_coach.pnl_AltaClase;
import Paneles_coach.pnl_Ejercicios;
import Util.Utilidades;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.MimetypesFileTypeMap;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author juana
 */
public class Ajustes_conexion_interfaz extends javax.swing.JFrame {

    String DIRECCION_IP_DEFAULT="192.168.0.11";
    int PUERTO_DEFAULT=9002;
    
    String DIRECCION_IP;
    int PUERTO;
    final File archivoConfiguracion=new File("./config_conection.txt");
    
    Loguin_interfaz interfazPadre=null;
    
    /* CONSTRUCTOR */
    public Ajustes_conexion_interfaz(Loguin_interfaz interfazPadre) {
        
        initComponents();
        setTitle("Ajustes de conexion");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        this.interfazPadre=interfazPadre;
        
        obtenerDatosConexion();
        rellenarDatosTextField();
    }

    private Ajustes_conexion_interfaz() {
         initComponents();
        setTitle("Ajustes de conexion");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        //this.interfazPadre=interfazPadre;
        
        obtenerDatosConexion();
        rellenarDatosTextField();
    }

    

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        direccionIP_tf = new javax.swing.JTextField();
        guardar_bt = new javax.swing.JButton();
        error_lb = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rSButtonMetro1 = new Recursos.RSButtonMetro();
        rSButtonMetro2 = new Recursos.RSButtonMetro();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        puerto_tf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        guardar_bt1 = new javax.swing.JButton();
        guardar_bt2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 234));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 234));

        direccionIP_tf.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        direccionIP_tf.setForeground(new java.awt.Color(0, 0, 0));
        direccionIP_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        direccionIP_tf.setOpaque(false);

        guardar_bt.setBackground(new java.awt.Color(74, 31, 61));
        guardar_bt.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        guardar_bt.setForeground(new java.awt.Color(255, 255, 255));
        guardar_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8_save_30px.png"))); // NOI18N
        guardar_bt.setText("GUARDAR");
        guardar_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_btActionPerformed(evt);
            }
        });

        error_lb.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        error_lb.setForeground(new java.awt.Color(74, 31, 61));
        error_lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel2.setBackground(new java.awt.Color(74, 31, 61));

        rSButtonMetro1.setBackground(new java.awt.Color(74, 31, 61));
        rSButtonMetro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8_subtract_40px.png"))); // NOI18N
        rSButtonMetro1.setColorHover(new java.awt.Color(112, 62, 97));
        rSButtonMetro1.setColorNormal(new java.awt.Color(74, 31, 61));
        rSButtonMetro1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonMetro1mouseClickedCerrar(evt);
            }
        });
        rSButtonMetro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMetro1ActionPerformed(evt);
            }
        });

        rSButtonMetro2.setBackground(new java.awt.Color(74, 31, 61));
        rSButtonMetro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8_multiply_40px_1.png"))); // NOI18N
        rSButtonMetro2.setColorHover(new java.awt.Color(112, 62, 97));
        rSButtonMetro2.setColorNormal(new java.awt.Color(74, 31, 61));
        rSButtonMetro2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonMetro2mouseClickedCerrar(evt);
            }
        });
        rSButtonMetro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMetro2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(454, Short.MAX_VALUE)
                .addComponent(rSButtonMetro1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rSButtonMetro2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSButtonMetro1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(rSButtonMetro2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(74, 31, 61));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8_settings_40px_2.png"))); // NOI18N
        jLabel1.setText("AJUSTES");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(74, 31, 61));
        jLabel2.setText("Direccion IP:");

        puerto_tf.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        puerto_tf.setForeground(new java.awt.Color(0, 0, 0));
        puerto_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        puerto_tf.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(74, 31, 61));
        jLabel3.setText("Puerto:");

        guardar_bt1.setBackground(new java.awt.Color(74, 31, 61));
        guardar_bt1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        guardar_bt1.setForeground(new java.awt.Color(255, 255, 255));
        guardar_bt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8_reset_25px.png"))); // NOI18N
        guardar_bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_bt1ActionPerformed(evt);
            }
        });

        guardar_bt2.setBackground(new java.awt.Color(74, 31, 61));
        guardar_bt2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        guardar_bt2.setForeground(new java.awt.Color(255, 255, 255));
        guardar_bt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8_reset_25px.png"))); // NOI18N
        guardar_bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_bt2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(direccionIP_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(guardar_bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(puerto_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(guardar_bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(error_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(guardar_bt)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(direccionIP_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardar_bt1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(puerto_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(error_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(guardar_bt))
                    .addComponent(guardar_bt2))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardar_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_btActionPerformed
        error_lb.setText("");
        
        //1 Obtener datos y comprobar que esten bien
        String direccionIP=direccionIP_tf.getText();
        int puerto;
        try {
            puerto = Integer.parseInt(puerto_tf.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "El puerto tiene que ser un numero entero.");
            return;
        }
        if(direccionIP.isEmpty()){
            JOptionPane.showMessageDialog(null, "Los campos deben de estar rellenos.");
            return;
        }else{
            
            try {
                archivoConfiguracion.delete();
                archivoConfiguracion.createNewFile();
                PrintWriter pw=new PrintWriter(archivoConfiguracion);
                pw.println("Direccion Ip:"+direccionIP +"\nPuerto:"+puerto);
                pw.flush();
                error_lb.setText("Guardada! Pruebe a iniciar sesion de nuevo.");
                
                
                
                
            } catch (FileNotFoundException ex) {
                error_lb.setText("Error al guardar.No se encuentra el archivo de configuracion.");
            } catch (IOException ex) {
                error_lb.setText("Error al guardar.");
            }
                
           
        }
        
    }//GEN-LAST:event_guardar_btActionPerformed

    private void rSButtonMetro1mouseClickedCerrar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonMetro1mouseClickedCerrar
        setState(ICONIFIED);
    }//GEN-LAST:event_rSButtonMetro1mouseClickedCerrar

    private void rSButtonMetro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonMetro1ActionPerformed

    private void rSButtonMetro2mouseClickedCerrar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonMetro2mouseClickedCerrar
       dispose();
    }//GEN-LAST:event_rSButtonMetro2mouseClickedCerrar

    private void rSButtonMetro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonMetro2ActionPerformed

    private void guardar_bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_bt1ActionPerformed
        direccionIP_tf.setText(DIRECCION_IP_DEFAULT);
    }//GEN-LAST:event_guardar_bt1ActionPerformed

    private void guardar_bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_bt2ActionPerformed
        puerto_tf.setText(""+PUERTO_DEFAULT);
    }//GEN-LAST:event_guardar_bt2ActionPerformed

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
            java.util.logging.Logger.getLogger(Ajustes_conexion_interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ajustes_conexion_interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ajustes_conexion_interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ajustes_conexion_interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ajustes_conexion_interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField direccionIP_tf;
    private javax.swing.JLabel error_lb;
    private javax.swing.JButton guardar_bt;
    private javax.swing.JButton guardar_bt1;
    private javax.swing.JButton guardar_bt2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField puerto_tf;
    private Recursos.RSButtonMetro rSButtonMetro1;
    private Recursos.RSButtonMetro rSButtonMetro2;
    // End of variables declaration//GEN-END:variables

    private void rellenarDatosTextField() {
        direccionIP_tf.setText(DIRECCION_IP);
        puerto_tf.setText(""+PUERTO);
    }
    
     private void obtenerDatosConexion() {
        BufferedReader br;
        
        System.out.println("Existe el archivo?"+archivoConfiguracion.exists());
        
        try{
            br=new BufferedReader(new FileReader(archivoConfiguracion));
            String linea=br.readLine();
            DIRECCION_IP=Utilidades.obtenerParametro(linea, 1);
            linea=br.readLine();
            try{
                PUERTO=Integer.parseInt(Utilidades.obtenerParametro(linea, 1));
            }catch(NumberFormatException ne){
                PUERTO=0;
            }
            
        }catch(Exception e){

            DIRECCION_IP=null;
            PUERTO=-1;
            e.printStackTrace();
        }
    }

    
}
