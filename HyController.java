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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ADIL RAZA
 */
public class HyController implements Initializable {

    @FXML
    private AnchorPane AnchorPane;
    @FXML
    private Button start;
    @FXML
    private Button android;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void start(ActionEvent event) throws IOException {
   try{
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Android.fxml"));
Parent root1 = (Parent) fxmlLoader.load();
Stage stage = new Stage();
stage.setScene(new Scene(root1));  
stage.show(); 
   }catch( Exception ex){
   
       System.out.println(ex.toString());
   }
    }

    @FXML
    private void web(ActionEvent event) throws IOException {
    
   try{
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Android.fxml"));
Parent root1 = (Parent) fxmlLoader.load();
Stage stage = new Stage();
stage.setScene(new Scene(root1));  
stage.show(); 
   }catch( Exception ex){
   
       System.out.println(ex.toString());
   }
    
    }

    @FXML
    private void Android(ActionEvent event) throws IOException {
   
    try{
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Android.fxml"));
Parent root1 = (Parent) fxmlLoader.load();
Stage stage = new Stage();
stage.setScene(new Scene(root1));  
stage.show(); 
   }catch( Exception ex){
   
       System.out.println(ex.toString());
   }
    }

    @FXML
    private void ghrap(ActionEvent event) throws IOException {
  
     try{
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Android.fxml"));
Parent root1 = (Parent) fxmlLoader.load();
Stage stage = new Stage();
stage.setScene(new Scene(root1));  
stage.show(); 
   }catch( Exception ex){
   
       System.out.println(ex.toString());
   }
    }

    @FXML
    private void work(ActionEvent event) throws IOException {
   try{
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Android.fxml"));
Parent root1 = (Parent) fxmlLoader.load();
Stage stage = new Stage();
stage.setScene(new Scene(root1));  
stage.show(); 
   }catch( Exception ex){
   
       System.out.println(ex.toString());
   }}
}
