/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uebung3.glockenspiel;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author nana
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private AnchorPane pane;
    @FXML
    private ImageView bg;
    @FXML
    private Button noteCstart;
    @FXML
    private Button noteD;
    @FXML
    private Button noteE;
    @FXML
    private Button noteF;
    @FXML
    private Button noteG;
    @FXML
    private Button noteA;
    @FXML
    private Button noteB;
    @FXML
    private Button noteCend;
    
    @FXML
    private void handleButtonAction1(ActionEvent event) {
//        System.out.println("You clicked me!");
        Sinusgenerator.play(Sinusgenerator.NOTE_C);
    }
    
    @FXML
    private void handleButtonAction2(ActionEvent event) {
//        System.out.println("You clicked me!");
        Sinusgenerator.play(Sinusgenerator.NOTE_D);
    }
    @FXML
    private void handleButtonAction3(ActionEvent event) {
//        System.out.println("You clicked me!");
        Sinusgenerator.play(Sinusgenerator.NOTE_E);
    }
    @FXML
    private void handleButtonAction4(ActionEvent event) {
//        System.out.println("You clicked me!");
        Sinusgenerator.play(Sinusgenerator.NOTE_F);
    }
    @FXML
    private void handleButtonAction5(ActionEvent event) {
//        System.out.println("You clicked me!");
        Sinusgenerator.play(Sinusgenerator.NOTE_G);
    }
    @FXML
    private void handleButtonAction6(ActionEvent event) {
        System.out.println("You clicked me!");
        Sinusgenerator.play(Sinusgenerator.NOTE_A);
    }
    
    @FXML
    private void handleButtonAction7(ActionEvent event) {
//        System.out.println("You clicked me!");
        Sinusgenerator.play(Sinusgenerator.NOTE_H);
    }
    
    @FXML
    private void handleButtonAction8(ActionEvent event) {
//        System.out.println("You clicked me!");
        Sinusgenerator.play(Sinusgenerator.NOTE_C2);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
