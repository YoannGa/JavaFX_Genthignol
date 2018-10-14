/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genthignol;

import genthignol.AuthentificationControllerCode;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Louise
 */
public class AuthentificationCode extends BorderPane {
    Label title;
    TextField login;
    PasswordField password;
    AuthentificationControllerCode controller;
    
    public AuthentificationCode() {
        
        super();
        title = new Label("Identification");
        title.setId("Titre");
        this.setTop(title); 
        
        GridPane centerPane = new GridPane();
        Label label1 = new Label("Login");
        label1.setPrefWidth(100);
        centerPane.add(label1, 0,0);
        login = new TextField();
        centerPane.add(login, 1, 0);
        Label label2 = new Label("Password");
        centerPane.add(label2,0,1);
        password = new PasswordField();
        centerPane.add(password, 1, 1);
        this.setCenter(centerPane);
        
        FlowPane bottomPane = new FlowPane();
        bottomPane.setHgap(10);
        Button okButton = new Button("OK");
        okButton.setDefaultButton(true);
        okButton.setOnAction(e -> {controller.processOk(e);});
        Button cancelButton = new Button("Cancel");
        cancelButton.setCancelButton(true);
        cancelButton.setOnAction(e ->{controller.processCancel(e);});
        bottomPane.getChildren().addAll(okButton, cancelButton);
        this.setBottom(bottomPane);
        this.setPrefSize(437, 187);
        this.setPadding(new Insets(10,0,10,0));
        
    }

    void setController(AuthentificationControllerCode aThis) {
        this.controller = aThis;
    }
    
    
    
    
}
