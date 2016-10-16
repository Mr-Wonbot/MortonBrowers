/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mortonbrowers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JFrame;

/**
 *
 * @author A-Rod
 */
public class MortonBrowers extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MortonBrowersFXML.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
        
}

/**
 * @param args the command line arguments
 */
public static void main(String[] args) {
        launch(args);
       
        
    }
    
}
