
package Controlador;

import Modelo.LoginDAO;
import Modelo.login;
import Vista.PrincipalISV;
import Vista.PrincipalU;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControlLogin implements ActionListener {    
    private login log;
    private LoginDAO logind;
    private PrincipalU us;

    public ControlLogin(login log, LoginDAO logind, PrincipalU us) {
        this.log = log;
        this.logind = logind;
        this.us = us;
        this.us.btnIngresarUs.addActionListener(this);
        this.us.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == us.btnIngresarUs){
            if(us.txtUsuario1.getText().equals("")|| String.valueOf(us.txtContraseña.getPassword()).equals("")||String.valueOf(us.txtTelefono0.getText()).equals("") ){
                JOptionPane.showMessageDialog(null, "Las casillas estan vacias");
            }else {
                String NomUsuario = us.txtUsuario1.getText();
                String contraseña = String.valueOf(us.txtContraseña.getPassword());
                int telefono = Integer.parseInt(us.txtTelefono0.getText());
                log = logind.log(NomUsuario, contraseña, telefono);
                if(log.getNomUsuario() !=null){
                    PrincipalISV sv = new PrincipalISV();
                    sv.setVisible(true);
                    this.us.dispose();
                }else {
            JOptionPane.showMessageDialog(null, "Usuario, Contraseña o Telefono incorrecta");
        }
            }
         }
    }
}
