package com.mycompany.cajeroview;

import com.mycompany.cajeropersistencia.DTO.UsuarioNuevoDTO;
import com.mycompany.cajeropersistencia.conexion.IConexion;
import com.mycompany.cajeropersistencia.exceptions.PersistenciaException;
import com.mycompany.cajeropersistencia.exceptions.ValidacionDTOException;
import javax.swing.JOptionPane;

/**
 *
 * @author TeLesheo
 */
public class RegistroUsuarioForm extends javax.swing.JFrame {

    private UsuarioNuevoDTO usuarioNuevo;
    private IConexion conexionBD;

    /**
     * Creates new form RegistroUsuarioForm
     */
    public RegistroUsuarioForm() {
        initComponents();
    }

    private void RegistrarUsuario() throws ValidacionDTOException, PersistenciaException {
        String correo = txt_correo.getText();
        String confirmacion_correo = txt_confirmacion_correo.getText();
        String passcode = txt_passcode.getText();
        String confirmacion_passcode = txt_confirmacion_passcode.getText();

        UsuarioNuevoDTO usuarioNuevo = new UsuarioNuevoDTO();
        usuarioNuevo.setEmail(correo);
        usuarioNuevo.setPasscode_usuario(passcode);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        txt_passcode = new javax.swing.JPasswordField();
        btn_siguiente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_confirmacion_correo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_confirmacion_passcode = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(17, 31, 77));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(242, 244, 247));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Avenir Next Condensed", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Contraseña");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, 48));

        txt_correo.setBackground(new java.awt.Color(255, 255, 255));
        txt_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_correoActionPerformed(evt);
            }
        });
        jPanel1.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 230, 30));

        txt_passcode.setBackground(new java.awt.Color(255, 255, 255));
        txt_passcode.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_passcode.setToolTipText("Contraseña");
        txt_passcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passcodeActionPerformed(evt);
            }
        });
        jPanel1.add(txt_passcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 230, 30));

        btn_siguiente.setBackground(new java.awt.Color(0, 194, 206));
        btn_siguiente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_siguiente.setForeground(new java.awt.Color(242, 244, 247));
        btn_siguiente.setText("Siguiente");
        btn_siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_siguienteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 125, 38));

        jLabel2.setFont(new java.awt.Font("Avenir Next Condensed", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Registrate como nuevo usuario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 48));

        jLabel4.setFont(new java.awt.Font("Avenir Next Condensed", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Correo electrónico");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 48));

        jLabel5.setFont(new java.awt.Font("Avenir Next Condensed", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Confirmar correo electrónico");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, 48));

        txt_confirmacion_correo.setBackground(new java.awt.Color(255, 255, 255));
        txt_confirmacion_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_confirmacion_correoActionPerformed(evt);
            }
        });
        jPanel1.add(txt_confirmacion_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 230, 30));

        jLabel3.setFont(new java.awt.Font("Avenir Next Condensed", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Confirmar contraseña");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, -1, 48));

        txt_confirmacion_passcode.setBackground(new java.awt.Color(255, 255, 255));
        txt_confirmacion_passcode.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_confirmacion_passcode.setToolTipText("Contraseña");
        txt_confirmacion_passcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_confirmacion_passcodeActionPerformed(evt);
            }
        });
        jPanel1.add(txt_confirmacion_passcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 230, 30));

        jPanel2.add(jPanel1, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_correoActionPerformed

    private void txt_passcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passcodeActionPerformed

    private void btn_siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_siguienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_siguienteActionPerformed

    private void txt_confirmacion_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_confirmacion_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_confirmacion_correoActionPerformed

    private void txt_confirmacion_passcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_confirmacion_passcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_confirmacion_passcodeActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(RegistroUsuarioForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(RegistroUsuarioForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(RegistroUsuarioForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(RegistroUsuarioForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new RegistroUsuarioForm().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_siguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt_confirmacion_correo;
    private javax.swing.JPasswordField txt_confirmacion_passcode;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JPasswordField txt_passcode;
    // End of variables declaration//GEN-END:variables
}
