/*
 López Rosales Jesús Alejandro
 22110104       3°O        POE
 */
package practica.pkg07.lopez.rosales.jesus.alejandro;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.DefaultBoundedRangeModel;

public class FormRegistrarLibros extends javax.swing.JFrame {

    FormMenu principal;
    PilaLibros listaLibros;

    public FormRegistrarLibros(FormMenu menu, PilaLibros lista) {
        initComponents();
        principal = menu;
        listaLibros = lista;
        lbMensaje.setVisible(false);
        scrollAño.setMinimum(1000);
        scrollAño.setMaximum(2023);
        DefaultBoundedRangeModel modelo = new DefaultBoundedRangeModel();
        modelo.setMinimum(1000);
        modelo.setMaximum(2023);
        modelo.setValue(2023);
        scrollAño.setModel(modelo);
        lbAño.setText("Año: 2023");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbMensaje = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnPop = new javax.swing.JButton();
        lbAño = new javax.swing.JLabel();
        btnPush = new javax.swing.JButton();
        lbEditorial = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        txtEditorial = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        lbTituloLibro = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        lbAutor = new javax.swing.JLabel();
        scrollAño = new javax.swing.JScrollBar();

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

        btnPop.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btnPop.setText("Pop");
        btnPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopActionPerformed(evt);
            }
        });

        lbAño.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lbAño.setText("Año:");

        btnPush.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btnPush.setText("Push");
        btnPush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPushActionPerformed(evt);
            }
        });

        lbEditorial.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lbEditorial.setText("Editorial:");

        btnRegresar.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        txtEditorial.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        txtEditorial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEditorialKeyTyped(evt);
            }
        });

        txtAutor.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N

        txtTitulo.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N

        lbTituloLibro.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lbTituloLibro.setText("Título:");

        lbTitulo.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("REGISTRO DE LIBROS:");

        lbAutor.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lbAutor.setText("Autor:");

        scrollAño.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        scrollAño.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        scrollAño.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                scrollAñoAdjustmentValueChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPush)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addComponent(btnLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegresar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                                .addComponent(lbAño, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lbTituloLibro)
                            .addComponent(lbEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEditorial)
                            .addComponent(txtTitulo)
                            .addComponent(scrollAño, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(txtAutor))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbTitulo)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTituloLibro)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAutor)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbAño, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollAño, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEditorial)
                    .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        this.actionLimpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopActionPerformed
        // TODO add your handling code here:
        if (listaLibros.pila == null) {
            lbMensaje.setVisible(true);
            lbMensaje.setText("La pila LIBROS está vacía");
            lbMensaje.setForeground(Color.RED);
        } else {
            listaLibros.pop();
            lbMensaje.setVisible(true);
            lbMensaje.setText("Se recorrió la pila de Libros.");
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
        FormMenu.lbMensaje.setText("");
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtEditorialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEditorialKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        lbMensaje.setVisible(false);
        if (caracter == KeyEvent.VK_ENTER) {
            this.actionPush();
            this.actionLimpiar();
            lbMensaje.setVisible(true);
        }
    }//GEN-LAST:event_txtEditorialKeyTyped

    private void scrollAñoAdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_scrollAñoAdjustmentValueChanged
        // TODO add your handling code here:
        lbAño.setText("Año: " + String.valueOf(scrollAño.getValue()));
    }//GEN-LAST:event_scrollAñoAdjustmentValueChanged

    private void actionPush() {
        String titulo, autor, editorial;
        int año;
        titulo = txtTitulo.getText();
        autor = txtAutor.getText();
        año = scrollAño.getValue();
        editorial = txtEditorial.getText();

        if (!titulo.isEmpty() && !autor.isEmpty() && año != 0 && !editorial.isEmpty()) {
            listaLibros.push(titulo, autor, año, editorial);
            lbMensaje.setVisible(true);
            lbMensaje.setText("Libro registrado.");
            lbMensaje.setForeground(Color.BLUE);
        } else {
            lbMensaje.setVisible(true);
            lbMensaje.setText("Por favor ingrese todos los datos.");
            lbMensaje.setForeground(Color.RED);
        }
    }

    private void actionLimpiar() {
        txtTitulo.setText("");
        txtAutor.setText("");
        txtEditorial.setText("");
        scrollAño.setValue(0);
        lbMensaje.setVisible(false);
        txtTitulo.requestFocus();
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
            java.util.logging.Logger.getLogger(FormRegistrarLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JLabel lbAutor;
    private javax.swing.JLabel lbAño;
    private javax.swing.JLabel lbEditorial;
    private javax.swing.JLabel lbMensaje;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbTituloLibro;
    private javax.swing.JScrollBar scrollAño;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
