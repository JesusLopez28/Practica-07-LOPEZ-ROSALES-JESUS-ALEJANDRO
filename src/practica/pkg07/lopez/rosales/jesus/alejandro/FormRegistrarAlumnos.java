/*
 López Rosales Jesús Alejandro
 22110104       3°O        POE
 */
package practica.pkg07.lopez.rosales.jesus.alejandro;

import java.awt.Color;
import java.awt.event.KeyEvent;

public class FormRegistrarAlumnos extends javax.swing.JFrame {

    FormMenu principal;
    PilaAlumnos listaAlumnos;

    public FormRegistrarAlumnos(FormMenu menu, PilaAlumnos lista) {
        initComponents();
        principal = menu;
        listaAlumnos = lista;
        lbMensaje.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPop = new javax.swing.JButton();
        btnPush = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        lbNombre = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        lbApellido = new javax.swing.JLabel();
        comboCarrera = new javax.swing.JComboBox();
        lbCarrera = new javax.swing.JLabel();
        lbRegistro = new javax.swing.JLabel();
        txtRegistro = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        lbMensaje = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnPop.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btnPop.setText("Pop");
        btnPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopActionPerformed(evt);
            }
        });

        btnPush.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btnPush.setText("Push");
        btnPush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPushActionPerformed(evt);
            }
        });

        btnRegresar.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N

        lbNombre.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lbNombre.setText("Nombre:");

        lbTitulo.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("REGISTRO DE USUARIOS:");

        lbApellido.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lbApellido.setText("Apellido:");

        comboCarrera.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        comboCarrera.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Calidad Total y Productividad", "Construcción", "Control Automático e Instrumentación", "Diseño y Mecánica Industrial", "Desarrollo Electrónico", "Desarrollo de Software", "Electromecánica", "Electrónica y Comunicaciones", "Sistemas Electrónicos y Telecomunicaciones", "Mecánica Automotriz", "Máquinas Herramientas", "Químico en Alimentos", "Químico Industrial", "Químico en Fármacos" }));

        lbCarrera.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lbCarrera.setText("Carrera:");

        lbRegistro.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lbRegistro.setText("Registro:");

        txtRegistro.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        txtRegistro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRegistroKeyTyped(evt);
            }
        });

        txtApellido.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lbTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lbNombre)
                                        .addGap(18, 18, Short.MAX_VALUE)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comboCarrera, 0, 1, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPush)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPop)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRegresar)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbTitulo)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCarrera)
                    .addComponent(comboCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRegistro)
                    .addComponent(txtRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPush)
                    .addComponent(btnPop)
                    .addComponent(btnRegresar)
                    .addComponent(btnLimpiar))
                .addGap(18, 18, 18)
                .addComponent(lbMensaje)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopActionPerformed
        // TODO add your handling code here:
        if (listaAlumnos.pila == null) {
            lbMensaje.setVisible(true);
            lbMensaje.setText("La pila ALUMNOS está vacía");
            lbMensaje.setForeground(Color.RED);
        } else {
            listaAlumnos.pop();
            lbMensaje.setVisible(true);
            lbMensaje.setText("Se recorrió la pila de Alumnos.");
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
        FormMenu.lbMensaje.setText("");
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        this.actionLimpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
        String nombre, apellido, carrera;
        String registroStr;
        int registro;
        nombre = txtNombre.getText();
        apellido = txtApellido.getText();
        registroStr = txtRegistro.getText();
        carrera = "";
        if (!registroStr.isEmpty() && registroStr.length() == 8) {
            registro = Integer.parseInt(registroStr);
        } else {
            lbMensaje.setVisible(true);
            lbMensaje.setText("El registro debe tener 8 dígitos.");
            lbMensaje.setForeground(Color.RED);
            return;
        }
        if (comboCarrera.getSelectedItem() != null) {
            carrera = (String) comboCarrera.getSelectedItem();
        }
        if (!nombre.isEmpty() && !apellido.isEmpty() && !carrera.isEmpty()) {
            listaAlumnos.push(nombre, apellido, registro, carrera);
            lbMensaje.setVisible(true);
            lbMensaje.setText("Alumno registrado.");
            lbMensaje.setForeground(Color.BLUE);
        } else {
            lbMensaje.setVisible(true);
            lbMensaje.setText("Por favor ingrese todos los datos.");
            lbMensaje.setForeground(Color.RED);
        }
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
            java.util.logging.Logger.getLogger(FormRegistrarAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JLabel lbApellido;
    private javax.swing.JLabel lbCarrera;
    private javax.swing.JLabel lbMensaje;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbRegistro;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRegistro;
    // End of variables declaration//GEN-END:variables
}
