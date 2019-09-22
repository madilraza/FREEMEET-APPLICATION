/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freemeet.application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author ADIL RAZA
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button start;
    @FXML
    private Button android;
    @FXML
    private Button web_1;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    private void start_main(MouseEvent event) throws IOException {
FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("main.FXML"));
Parent root1 = (Parent) fxmlLoader.load();
Stage stage = new Stage();
stage.setScene(new Scene(root1));  
stage.show();





    }

    @FXML
    private void start(ActionEvent event) {
    
    
    
    
    }

    @FXML
    private void web(ActionEvent event) throws IOException {
   FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("main.FXML"));
Parent root1 = (Parent) fxmlLoader.load();
Stage stage = new Stage();
stage.setScene(new Scene(root1));  
stage.show(); }

    @FXML
    private void Android(ActionEvent event) {
    }

    @FXML
    private void ghrap(ActionEvent event) {
    }

    @FXML
    private void work(ActionEvent event) {
    }

  
    
}
