
package Vista;

import Controlador.ControlLogin;
import Modelo.LoginDAO;
import Modelo.login;
import javax.swing.JOptionPane;


public class PrincipalU extends javax.swing.JFrame {
    login log = new login();
    LoginDAO logind = new LoginDAO();

    public PrincipalU() {
        initComponents();
        ControlLogin cl = new ControlLogin(log, logind, this);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelUsuario = new javax.swing.JPanel();
        txtUsuario1 = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        btnIngresarUs = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtTelefono0 = new javax.swing.JTextField();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario1.setBackground(new java.awt.Color(51, 51, 51));
        txtUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        jPanelUsuario.add(txtUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 150, -1));

        lblUsuario.setBackground(new java.awt.Color(255, 255, 255));
        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Usuario");
        jPanelUsuario.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        lblContraseña.setBackground(new java.awt.Color(255, 255, 255));
        lblContraseña.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(255, 255, 255));
        lblContraseña.setText("Contraseña");
        jPanelUsuario.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        txtContraseña.setBackground(new java.awt.Color(51, 51, 51));
        txtContraseña.setForeground(new java.awt.Color(255, 255, 255));
        jPanelUsuario.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 150, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/usu.png"))); // NOI18N
        jPanelUsuario.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 150, 160));

        btnIngresarUs.setBackground(new java.awt.Color(48, 36, 109));
        btnIngresarUs.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        btnIngresarUs.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresarUs.setText("INGRESAR");
        btnIngresarUs.setBorder(null);
        btnIngresarUs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresarUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarUsActionPerformed(evt);
            }
        });
        jPanelUsuario.add(btnIngresarUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 100, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Telefono");
        jPanelUsuario.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, 20));

        txtTelefono0.setBackground(new java.awt.Color(51, 51, 51));
        txtTelefono0.setForeground(new java.awt.Color(255, 255, 255));
        jPanelUsuario.add(txtTelefono0, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 150, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fondo jpg.jpg"))); // NOI18N
        jPanelUsuario.add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 441, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarUsActionPerformed
        // TODO add your handling code here:\
    }//GEN-LAST:event_btnIngresarUsActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnIngresarUs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JPanel jPanelUsuario;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblUsuario;
    public javax.swing.JPasswordField txtContraseña;
    public javax.swing.JTextField txtTelefono0;
    public javax.swing.JTextField txtUsuario1;
    // End of variables declaration//GEN-END:variables
}
