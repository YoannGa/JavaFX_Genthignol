/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genthignol;

import genthignol.AuthentificationCode;
import genthignol.Contexte;
import javafx.event.ActionEvent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 *
 * @author Louise
 */
class AuthentificationControllerCode {
    
    private TextField login;
    private PasswordField password;
    AuthentificationCode ui;
    
    Contexte context;
    
    
    public void setUI(AuthentificationCode ui){
        login = ui.login;
        password = ui.password;
        this.ui = ui;
        ui.setController(this);         
    }
    
    public void setContexte(Contexte contexte){
        this.context = contexte;
        contexte.loginUtilisateurConnecteProperty().bind(login.textProperty());
        contexte.passwordUtilisateurConnecteProperty().bind(password.textProperty());
    } 
    
    
    void processOk(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void processCancel(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
