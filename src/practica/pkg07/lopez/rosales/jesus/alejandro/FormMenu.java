/*
 López Rosales Jesús Alejandro
 22110104       3°O        POE
 */
package practica.pkg07.lopez.rosales.jesus.alejandro;

import java.awt.Color;

public class FormMenu extends javax.swing.JFrame {

    public String usuario;

    PilaAlumnos pilaAlumnos = new PilaAlumnos();
    PilaLibros pilaLibros = new PilaLibros();
    PilaPrestamos pilaPrestamos = new PilaPrestamos();

    public FormMenu(String usuario) {
        initComponents();
        this.usuario = usuario;
        txtUsuario.setForeground(Color.BLUE);
        txtUsuario.setText(usuario.toUpperCase());
        lbMensaje.setVisible(false);
        lbMensaje.setForeground(Color.RED);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsuario = new javax.swing.JLabel();
        lbUsuario = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        lbMensaje = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuAlumnos = new javax.swing.JMenu();
        itemRegistrarAlumnos = new javax.swing.JMenuItem();
        itemMostraAlumnos = new javax.swing.JMenuItem();
        menuLibros = new javax.swing.JMenu();
        itemRegistrarLibros = new javax.swing.JMenuItem();
        itemMostraLibros = new javax.swing.JMenuItem();
        menuPrestamos = new javax.swing.JMenu();
        itemRegistrarPrestamos = new javax.swing.JMenuItem();
        itemMostraPrestamos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtUsuario.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        txtUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtUsuario.setText("user");

        lbUsuario.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        lbUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUsuario.setText("Usuario:");

        btnSalir.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lbMensaje.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        lbMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMensaje.setText("Mensaje");

        jMenuBar1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N

        menuAlumnos.setText("Alumnos");
        menuAlumnos.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N

        itemRegistrarAlumnos.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        itemRegistrarAlumnos.setText("Registrar");
        itemRegistrarAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRegistrarAlumnosActionPerformed(evt);
            }
        });
        menuAlumnos.add(itemRegistrarAlumnos);

        itemMostraAlumnos.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        itemMostraAlumnos.setText("Mostrar");
        itemMostraAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMostraAlumnosActionPerformed(evt);
            }
        });
        menuAlumnos.add(itemMostraAlumnos);

        jMenuBar1.add(menuAlumnos);

        menuLibros.setText("Libros");
        menuLibros.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N

        itemRegistrarLibros.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        itemRegistrarLibros.setText("Registrar");
        itemRegistrarLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRegistrarLibrosActionPerformed(evt);
            }
        });
        menuLibros.add(itemRegistrarLibros);

        itemMostraLibros.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        itemMostraLibros.setText("Mostrar");
        itemMostraLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMostraLibrosActionPerformed(evt);
            }
        });
        menuLibros.add(itemMostraLibros);

        jMenuBar1.add(menuLibros);

        menuPrestamos.setText("Prestamos");
        menuPrestamos.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N

        itemRegistrarPrestamos.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        itemRegistrarPrestamos.setText("Registrar");
        itemRegistrarPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRegistrarPrestamosActionPerformed(evt);
            }
        });
        menuPrestamos.add(itemRegistrarPrestamos);

        itemMostraPrestamos.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        itemMostraPrestamos.setText("Mostrar");
        itemMostraPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMostraPrestamosActionPerformed(evt);
            }
        });
        menuPrestamos.add(itemMostraPrestamos);

        jMenuBar1.add(menuPrestamos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbUsuario)
                        .addGap(18, 18, 18)
                        .addComponent(txtUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 271, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUsuario)
                    .addComponent(txtUsuario)
                    .addComponent(btnSalir))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(lbMensaje)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        FormLogin login = new FormLogin();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void itemRegistrarAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegistrarAlumnosActionPerformed
        // TODO add your handling code here:
        FormRegistrarAlumnos registrarAlumnos = new FormRegistrarAlumnos(this, pilaAlumnos);
        registrarAlumnos.setVisible(true);
        registrarAlumnos.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_itemRegistrarAlumnosActionPerformed

    private void itemMostraAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMostraAlumnosActionPerformed
        // TODO add your handling code here:
        if (pilaAlumnos.pila == null) {
            lbMensaje.setVisible(true);
            lbMensaje.setText("La pila ALUMNOS está vacía");
        } else {
            lbMensaje.setVisible(false);
            FormMostrarAlumnos mostrarAlumnos = new FormMostrarAlumnos(this, pilaAlumnos);
            mostrarAlumnos.setVisible(true);
            mostrarAlumnos.setLocationRelativeTo(null);
            this.setVisible(false);
        }
    }//GEN-LAST:event_itemMostraAlumnosActionPerformed

    private void itemRegistrarLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegistrarLibrosActionPerformed
        // TODO add your handling code here:
        FormRegistrarLibros registrarLibros = new FormRegistrarLibros(this, pilaLibros);
        registrarLibros.setVisible(true);
        registrarLibros.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_itemRegistrarLibrosActionPerformed

    private void itemMostraLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMostraLibrosActionPerformed
        // TODO add your handling code here:
        if (pilaLibros.pila == null) {
            lbMensaje.setVisible(true);
            lbMensaje.setText("La pila LIBROS está vacía");
        } else {
            FormMostrarLibros mostrarLibros = new FormMostrarLibros(this, pilaLibros);
            mostrarLibros.setVisible(true);
            mostrarLibros.setLocationRelativeTo(null);
            this.setVisible(false);
        }
    }//GEN-LAST:event_itemMostraLibrosActionPerformed

    private void itemRegistrarPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegistrarPrestamosActionPerformed
        // TODO add your handling code here:
        if (pilaAlumnos.pila == null || pilaLibros.pila == null) {
            lbMensaje.setVisible(true);
            lbMensaje.setText("Para poder hacer prestamos debe de haber libros y alumnos registrados");
        } else {
            FormRegistrarPrestamos registrarPrestamos = new FormRegistrarPrestamos(this, pilaPrestamos, pilaAlumnos, pilaLibros);
            registrarPrestamos.setVisible(true);
            registrarPrestamos.setLocationRelativeTo(null);
            this.setVisible(false);
        }
    }//GEN-LAST:event_itemRegistrarPrestamosActionPerformed

    private void itemMostraPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMostraPrestamosActionPerformed
        // TODO add your handling code here:
        if (pilaPrestamos.pila == null) {
            lbMensaje.setVisible(true);
            lbMensaje.setText("La pila PRESTAMOS está vacía");
        } else {
            FormMostrarPrestamos mostrarPrestamos = new FormMostrarPrestamos(this, pilaPrestamos);
            mostrarPrestamos.setVisible(true);
            mostrarPrestamos.setLocationRelativeTo(null);
            this.setVisible(false);
        }
    }//GEN-LAST:event_itemMostraPrestamosActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JMenuItem itemMostraAlumnos;
    private javax.swing.JMenuItem itemMostraLibros;
    private javax.swing.JMenuItem itemMostraPrestamos;
    private javax.swing.JMenuItem itemRegistrarAlumnos;
    private javax.swing.JMenuItem itemRegistrarLibros;
    private javax.swing.JMenuItem itemRegistrarPrestamos;
    private javax.swing.JMenuBar jMenuBar1;
    public static javax.swing.JLabel lbMensaje;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JMenu menuAlumnos;
    private javax.swing.JMenu menuLibros;
    private javax.swing.JMenu menuPrestamos;
    public static javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
