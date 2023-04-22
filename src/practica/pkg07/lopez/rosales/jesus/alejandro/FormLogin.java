/*
 López Rosales Jesús Alejandro
 22110104       3°O        POE
 */
package practica.pkg07.lopez.rosales.jesus.alejandro;

import java.awt.Color;

public class FormLogin extends javax.swing.JFrame {

    private final int tamaño = 20;
    private final int contador;

    Usuario usuarios[] = new Usuario[tamaño];

    public FormLogin() {
        initComponents();
        usuarios[0] = new Usuario("jesus", "3452");
        usuarios[1] = new Usuario("ivan", "2804");
        usuarios[2] = new Usuario("calos", "2010");
        usuarios[3] = new Usuario("andrea", "2012");
        usuarios[4] = new Usuario("ana", "2002");
        usuarios[5] = new Usuario("alex", "1999");

        for (int i = 6; i < tamaño; i++) {
            usuarios[i] = new Usuario();
        }

        contador = 6;
        lbMensaje.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lbUsuario = new javax.swing.JLabel();
        lbContraseña = new javax.swing.JLabel();
        lbMensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTitulo.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("LOGIN DE USUARIOS");

        txtUsuario.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N

        txtContraseña.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N

        btnIngresar.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lbUsuario.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lbUsuario.setText("Usuario:");

        lbContraseña.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lbContraseña.setText("Contraseña:");

        lbMensaje.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        lbMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMensaje.setText("Mensaje");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbContraseña)
                            .addComponent(lbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsuario)
                            .addComponent(txtContraseña)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbUsuario))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbContraseña))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar)
                    .addComponent(btnCancelar))
                .addGap(18, 18, 18)
                .addComponent(lbMensaje)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
        if (!txtUsuario.getText().isEmpty() || !txtContraseña.getText().isEmpty()) {
            boolean usuarioValidado = false;
            for (int i = 0; i < contador; i++) {
                String username = usuarios[i].getUsuario();
                String password = usuarios[i].getContraseña();
                if (username.equals(txtUsuario.getText()) && password.equals(txtContraseña.getText())) {
                    lbMensaje.setVisible(true);
                    lbMensaje.setText("Bien.");
                    lbMensaje.setForeground(Color.BLUE);
                    FormMenu menu = new FormMenu(username);
                    menu.setVisible(true);
                    menu.setLocationRelativeTo(null);
                    this.setVisible(false);
                    usuarioValidado = true;
                    break;
                }
            }
            if (!usuarioValidado) {
                lbMensaje.setVisible(true);
                lbMensaje.setText("Usuario y/o contraseña incorrectos.");
                lbMensaje.setForeground(Color.RED);
            }
        } else {
            lbMensaje.setVisible(true);
            lbMensaje.setText("Alguno de los campos está vacío.");
            lbMensaje.setForeground(Color.RED);
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

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
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel lbContraseña;
    private javax.swing.JLabel lbMensaje;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
