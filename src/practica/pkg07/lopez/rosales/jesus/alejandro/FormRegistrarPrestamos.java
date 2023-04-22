/*
 López Rosales Jesús Alejandro
 22110104       3°O        POE
 */
package practica.pkg07.lopez.rosales.jesus.alejandro;

import java.awt.Color;
import java.awt.event.KeyEvent;

public class FormRegistrarPrestamos extends javax.swing.JFrame {

    FormMenu principal;
    PilaPrestamos listaPrestamos;

    public FormRegistrarPrestamos(FormMenu menu, PilaPrestamos lista) {
        initComponents();
        principal = menu;
        listaPrestamos = lista;
        lbMensaje.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbMensaje = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        comboCarrera = new javax.swing.JComboBox();
        btnPop = new javax.swing.JButton();
        lbCarrera = new javax.swing.JLabel();
        btnPush = new javax.swing.JButton();
        lbRegistro = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        txtRegistro = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        lbNombre = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        lbApellido = new javax.swing.JLabel();
        comboCarrera1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbMensaje.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        lbMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMensaje.setText("Mensaje");

        btnLimpiar.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        comboCarrera.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N

        btnPop.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btnPop.setText("Pop");
        btnPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopActionPerformed(evt);
            }
        });

        lbCarrera.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lbCarrera.setText("Fecha Prestamo:");

        btnPush.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btnPush.setText("Push");
        btnPush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPushActionPerformed(evt);
            }
        });

        lbRegistro.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lbRegistro.setText("Fecha Devolución:");

        btnRegresar.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        txtRegistro.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        txtRegistro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRegistroKeyTyped(evt);
            }
        });

        txtApellido.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N

        lbNombre.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lbNombre.setText("Alumno:");

        lbTitulo.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("REGISTRO DE PRESTAMOS:");

        lbApellido.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lbApellido.setText("Libro:");

        comboCarrera1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPush)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbNombre)
                                .addGap(77, 77, 77)
                                .addComponent(comboCarrera, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbRegistro)
                                        .addComponent(lbCarrera)
                                        .addComponent(lbApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtRegistro)
                                        .addComponent(txtApellido)
                                        .addComponent(comboCarrera1, 0, 250, Short.MAX_VALUE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCarrera1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbApellido))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCarrera))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRegistro)
                    .addComponent(txtRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPush)
                    .addComponent(btnPop)
                    .addComponent(btnLimpiar)
                    .addComponent(btnRegresar))
                .addGap(18, 18, 18)
                .addComponent(lbMensaje)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        this.actionLimpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopActionPerformed
        // TODO add your handling code here:
        if (listaPrestamos.pila == null) {
            lbMensaje.setVisible(true);
            lbMensaje.setText("La pila PRESTAMOS está vacía");
            lbMensaje.setForeground(Color.RED);
        } else {
            listaPrestamos.pop();
            lbMensaje.setVisible(true);
            lbMensaje.setText("Se recorrió la pila de Prestamos.");
            lbMensaje.setForeground(Color.BLUE);
        }
    }//GEN-LAST:event_btnPopActionPerformed

    private void btnPushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPushActionPerformed
        // TODO add your handling code here:
        this.actionPush();
        this.actionLimpiar();
        lbMensaje.setVisible(true);
    }//GEN-LAST:event_btnPushActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        FormMenu.txtUsuario.setText(principal.usuario.toUpperCase());
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtRegistroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRegistroKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        lbMensaje.setVisible(false);
        if (caracter == KeyEvent.VK_ENTER) {
            this.actionPush();
            this.actionLimpiar();
            lbMensaje.setVisible(true);
        }
    }//GEN-LAST:event_txtRegistroKeyTyped

    private void actionPush() {
        
    }

    private void actionLimpiar() {
        txtNombre.setText("");
        txtApellido.setText("");
        txtRegistro.setText("");
        comboCarrera.setSelectedIndex(0);
        lbMensaje.setVisible(false);
        txtNombre.requestFocus();
    }

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
            java.util.logging.Logger.getLogger(FormRegistrarPrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnPop;
    private javax.swing.JButton btnPush;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox comboCarrera;
    private javax.swing.JComboBox comboCarrera1;
    private javax.swing.JLabel lbApellido;
    private javax.swing.JLabel lbCarrera;
    private javax.swing.JLabel lbMensaje;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbRegistro;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtRegistro;
    // End of variables declaration//GEN-END:variables
}
