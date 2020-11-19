/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author juana
 */
public class Menu_coach_interfaz extends javax.swing.JFrame {

    String nombreUsuario;
    Socket socketServidor;
    BufferedReader inSocket;
    PrintWriter outSocket;
    
    Color colorFondo;
    
    
    
    public Menu_coach_interfaz() {
        initComponents();
        setLocationRelativeTo(this);
        colorFondo=new Color(186,79,84);
        //esconderMenu();
        
    }
    
     public Menu_coach_interfaz(BufferedReader inSocket,PrintWriter outSocket, String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.inSocket=inSocket;
         this.outSocket=outSocket;
        
        colorFondo = new Color(186, 79, 84);

         initComponents();
         //iniciarConexion();

         System.out.println("Nombre que llega a la interfaz menu:" + nombreUsuario);
         this.nombreUsuario_lb.setText(nombreUsuario);

         setLocationRelativeTo(this);
         //esconderMenu();
        
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
        barra_panel = new javax.swing.JPanel();
        rSButtonMetro1 = new Recursos.RSButtonMetro();
        tema_bt = new Recursos.RSButtonMetro();
        home_bt = new Recursos.RSButtonMetro();
        menu_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombreUsuario_lb = new javax.swing.JLabel();
        clientes_bt = new Recursos.RSButtonMetro();
        ejercicios_bt = new Recursos.RSButtonMetro();
        rutinas_bt = new Recursos.RSButtonMetro();
        cerrarSession_bt = new Recursos.RSButtonMetro();
        clases_bt = new Recursos.RSButtonMetro();
        contenido_panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(186, 79, 84));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(186, 79, 84));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barra_panel.setBackground(new java.awt.Color(74, 31, 61));
        barra_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonMetro1.setBackground(new java.awt.Color(74, 31, 61));
        rSButtonMetro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8_multiply_40px.png"))); // NOI18N
        rSButtonMetro1.setColorHover(new java.awt.Color(112, 62, 97));
        rSButtonMetro1.setColorNormal(new java.awt.Color(74, 31, 61));
        rSButtonMetro1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseClickedCerrar(evt);
            }
        });
        rSButtonMetro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMetro1ActionPerformed(evt);
            }
        });
        barra_panel.add(rSButtonMetro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1590, 0, 60, 50));

        tema_bt.setBackground(new java.awt.Color(74, 31, 61));
        tema_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8_paint_palette_40px_2.png"))); // NOI18N
        tema_bt.setColorHover(new java.awt.Color(112, 62, 97));
        tema_bt.setColorNormal(new java.awt.Color(74, 31, 61));
        tema_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarTema(evt);
            }
        });
        barra_panel.add(tema_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 60, 50));

        home_bt.setBackground(new java.awt.Color(74, 31, 61));
        home_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8_home_40px_1.png"))); // NOI18N
        home_bt.setColorHover(new java.awt.Color(112, 62, 97));
        home_bt.setColorNormal(new java.awt.Color(74, 31, 61));
        home_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_btActionPerformed(evt);
            }
        });
        barra_panel.add(home_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        jPanel1.add(barra_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1650, 50));

        menu_panel.setBackground(new java.awt.Color(74, 31, 61));
        menu_panel.setForeground(new java.awt.Color(186, 79, 84));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("COACH");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8_male_user_125px_1.png"))); // NOI18N

        nombreUsuario_lb.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        nombreUsuario_lb.setForeground(new java.awt.Color(204, 204, 204));
        nombreUsuario_lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreUsuario_lb.setText("Juan Alberto Barba Aguilar");
        nombreUsuario_lb.setToolTipText("");

        clientes_bt.setBackground(new java.awt.Color(74, 31, 61));
        clientes_bt.setForeground(new java.awt.Color(204, 204, 204));
        clientes_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8_human_head_40px_2.png"))); // NOI18N
        clientes_bt.setText("CLIENTES");
        clientes_bt.setColorHover(new java.awt.Color(112, 62, 97));
        clientes_bt.setColorNormal(new java.awt.Color(74, 31, 61));
        clientes_bt.setColorTextHover(new java.awt.Color(204, 204, 204));
        clientes_bt.setColorTextNormal(new java.awt.Color(204, 204, 204));
        clientes_bt.setColorTextPressed(new java.awt.Color(204, 204, 204));
        clientes_bt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        clientes_bt.setHideActionText(true);
        clientes_bt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        clientes_bt.setIconTextGap(10);
        clientes_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientes_btActionPerformed(evt);
            }
        });

        ejercicios_bt.setBackground(new java.awt.Color(74, 31, 61));
        ejercicios_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8_dumbbell_40px.png"))); // NOI18N
        ejercicios_bt.setText("EJERCICIOS");
        ejercicios_bt.setColorHover(new java.awt.Color(112, 62, 97));
        ejercicios_bt.setColorNormal(new java.awt.Color(74, 31, 61));
        ejercicios_bt.setColorTextHover(new java.awt.Color(204, 204, 204));
        ejercicios_bt.setColorTextNormal(new java.awt.Color(204, 204, 204));
        ejercicios_bt.setColorTextPressed(new java.awt.Color(204, 204, 204));
        ejercicios_bt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ejercicios_bt.setHideActionText(true);
        ejercicios_bt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ejercicios_bt.setIconTextGap(10);
        ejercicios_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ejercicios_btActionPerformed(evt);
            }
        });

        rutinas_bt.setBackground(new java.awt.Color(74, 31, 61));
        rutinas_bt.setForeground(new java.awt.Color(204, 204, 204));
        rutinas_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8_treadmill_40px_2.png"))); // NOI18N
        rutinas_bt.setText("RUTINAS");
        rutinas_bt.setColorHover(new java.awt.Color(112, 62, 97));
        rutinas_bt.setColorNormal(new java.awt.Color(74, 31, 61));
        rutinas_bt.setColorTextHover(new java.awt.Color(204, 204, 204));
        rutinas_bt.setColorTextNormal(new java.awt.Color(204, 204, 204));
        rutinas_bt.setColorTextPressed(new java.awt.Color(204, 204, 204));
        rutinas_bt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        rutinas_bt.setHideActionText(true);
        rutinas_bt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rutinas_bt.setIconTextGap(12);
        rutinas_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutinas_btActionPerformed(evt);
            }
        });

        cerrarSession_bt.setBackground(new java.awt.Color(74, 31, 61));
        cerrarSession_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8_exit_40px_1.png"))); // NOI18N
        cerrarSession_bt.setText("CERRAR SESION");
        cerrarSession_bt.setColorHover(new java.awt.Color(112, 62, 97));
        cerrarSession_bt.setColorNormal(new java.awt.Color(74, 31, 61));
        cerrarSession_bt.setColorTextHover(new java.awt.Color(204, 204, 204));
        cerrarSession_bt.setColorTextNormal(new java.awt.Color(204, 204, 204));
        cerrarSession_bt.setColorTextPressed(new java.awt.Color(204, 204, 204));
        cerrarSession_bt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cerrarSession_bt.setHideActionText(true);
        cerrarSession_bt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cerrarSession_bt.setIconTextGap(10);
        cerrarSession_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSession_btActionPerformed(evt);
            }
        });

        clases_bt.setBackground(new java.awt.Color(74, 31, 61));
        clases_bt.setForeground(new java.awt.Color(204, 204, 204));
        clases_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8_calendar_40px.png"))); // NOI18N
        clases_bt.setText("CLASES");
        clases_bt.setColorHover(new java.awt.Color(112, 62, 97));
        clases_bt.setColorNormal(new java.awt.Color(74, 31, 61));
        clases_bt.setColorTextHover(new java.awt.Color(204, 204, 204));
        clases_bt.setColorTextNormal(new java.awt.Color(204, 204, 204));
        clases_bt.setColorTextPressed(new java.awt.Color(204, 204, 204));
        clases_bt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        clases_bt.setHideActionText(true);
        clases_bt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        clases_bt.setIconTextGap(12);
        clases_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clases_btActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menu_panelLayout = new javax.swing.GroupLayout(menu_panel);
        menu_panel.setLayout(menu_panelLayout);
        menu_panelLayout.setHorizontalGroup(
            menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(nombreUsuario_lb, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cerrarSession_bt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rutinas_bt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clientes_bt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clases_bt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ejercicios_bt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        menu_panelLayout.setVerticalGroup(
            menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreUsuario_lb)
                .addGap(26, 26, 26)
                .addComponent(clientes_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ejercicios_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rutinas_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clases_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 379, Short.MAX_VALUE)
                .addComponent(cerrarSession_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(menu_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 260, 850));

        contenido_panel.setBackground(new java.awt.Color(186, 79, 84));
        contenido_panel.setForeground(new java.awt.Color(255, 0, 255));
        contenido_panel.setOpaque(false);
        contenido_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contenido_panelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout contenido_panelLayout = new javax.swing.GroupLayout(contenido_panel);
        contenido_panel.setLayout(contenido_panelLayout);
        contenido_panelLayout.setHorizontalGroup(
            contenido_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1390, Short.MAX_VALUE)
        );
        contenido_panelLayout.setVerticalGroup(
            contenido_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );

        jPanel1.add(contenido_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 1390, 850));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonMetro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonMetro1ActionPerformed

    private void mouseClickedCerrar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseClickedCerrar
        System.exit(0);
    }//GEN-LAST:event_mouseClickedCerrar

    private void ejercicios_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ejercicios_btActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ejercicios_btActionPerformed

    private void clientes_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientes_btActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientes_btActionPerformed

    private void rutinas_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutinas_btActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rutinas_btActionPerformed

    private void cerrarSession_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSession_btActionPerformed
        try {
            new Loguin_interfaz().setVisible(true);
            this.dispose();
        } catch (Exception e) {
            System.out.println("Fallo deslogueando");
        }
    }//GEN-LAST:event_cerrarSession_btActionPerformed

    private void clases_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clases_btActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clases_btActionPerformed

    private void cambiarTema(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarTema
       
       colorFondo=this.jPanel1.getBackground();
        if(colorFondo.equals(new Color(186,79,84))){
            colorFondo=new Color(59, 52, 52);
            this.jPanel1.setBackground(colorFondo);
        }else{
            colorFondo=new Color(186,79,84);
            this.jPanel1.setBackground(colorFondo);
        }
    }//GEN-LAST:event_cambiarTema

    private void contenido_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contenido_panelMouseClicked
        //esconderMenu();
    }//GEN-LAST:event_contenido_panelMouseClicked

    private void home_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_btActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_home_btActionPerformed

    /* ACCIONES DE MENU DEPLEGABLE (desactivado)
    //
    private void esconderMenu() {
        int posicion = this.menu_panel.getX();
        if(posicion > -1){
            Animacion.Animacion.mover_izquierda(0, -300, 2, 2, menu_panel);
        }
        
    }
    private void desplegarMenu(){
        int posicion = this.menu_panel.getX();
        if(posicion <= -1){
            Animacion.Animacion.mover_derecha(-300, 0, 2, 2, menu_panel);
        }
    }/*
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
            java.util.logging.Logger.getLogger(Menu_coach_interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_coach_interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_coach_interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_coach_interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_coach_interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barra_panel;
    private Recursos.RSButtonMetro cerrarSession_bt;
    private Recursos.RSButtonMetro clases_bt;
    private Recursos.RSButtonMetro clientes_bt;
    private javax.swing.JPanel contenido_panel;
    private Recursos.RSButtonMetro ejercicios_bt;
    private Recursos.RSButtonMetro home_bt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel menu_panel;
    private javax.swing.JLabel nombreUsuario_lb;
    private Recursos.RSButtonMetro rSButtonMetro1;
    private Recursos.RSButtonMetro rutinas_bt;
    private Recursos.RSButtonMetro tema_bt;
    // End of variables declaration//GEN-END:variables

//    private void iniciarConexion() {
//        try {
//            outSocket = new PrintWriter(socketServidor.getOutputStream());
//            inSocket = new BufferedReader(new InputStreamReader(socketServidor.getInputStream()));
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    
}
