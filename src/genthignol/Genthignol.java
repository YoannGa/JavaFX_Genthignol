/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genthignol;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author clarisse.lou
 */
public class Genthignol extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        BorderPane rootLayout = (BorderPane) new AuthentificationCode();
        
        
        
        
        Contexte contexte = new Contexte(new Personnes());
        Scene scene = new Scene (rootLayout);
        primaryStage.setScene(scene);
        scene.getStylesheets().add(AuthentificationController.class.getResource("LaBotey.css").toExternalForm());
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
