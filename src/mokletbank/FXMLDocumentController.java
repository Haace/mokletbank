/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mokletbank;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author AdityaHarisCandra
 */
public class FXMLDocumentController implements Initializable {
    
    String pin="";
    String PIN="030700";
    int kesempatan=3;
    int tmp;
    

    @FXML
    private Label label;
    @FXML
    private JFXButton btn4;
    @FXML
    private JFXButton btn5;
    @FXML
    private JFXButton btn6;
    @FXML
    private JFXButton btn7;
    @FXML
    private JFXButton btn8;
    @FXML
    private JFXButton btn9;
    @FXML
    private JFXButton btn0;
    @FXML
    private JFXButton btnok;
    @FXML
    private JFXButton btn1;
    @FXML
    private JFXButton btn2;
    @FXML
    private JFXButton btn3;
    @FXML
    private JFXButton btnc;
    @FXML
    private JFXPasswordField passwordfield;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void empat(ActionEvent event) {
         pin += "4";
        passwordfield.setText (pin);
    }

    @FXML
    private void lima(ActionEvent event) {
         pin += "5";
        passwordfield.setText (pin);
    }

    @FXML
    private void enam(ActionEvent event) {
         pin += "6";
        passwordfield.setText (pin);
    }

    @FXML
    private void tuju(ActionEvent event) {
         pin += "7";
        passwordfield.setText (pin);
    }

    @FXML
    private void delapan(ActionEvent event) {
         pin += "8";
        passwordfield.setText (pin);
    }

    @FXML
    private void sembilan(ActionEvent event) {
         pin += "9";
        passwordfield.setText (pin);
    }

    @FXML
    private void enol(ActionEvent event) {
         pin += "0";
        passwordfield.setText (pin);
    }

    @FXML
    private void oke(ActionEvent event) {
        if(pin.equals(PIN)){
        try {
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLduwek.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 830, 450);
            
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Moklet Bank");
            stage.show();
            
        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
        }
        }
        else{
            kesempatan -= 1;
            JOptionPane.showMessageDialog(null, "PIN Salah \n Tersisa"+ kesempatan+"kesempatan lagi!");
            passwordfield.setText("");
            pin = "";
            if (kesempatan == 0){
                System.exit(0);
            }
        }
    }
    

    

    @FXML
    private void satu(ActionEvent event) {
        pin += "1";
        passwordfield.setText (pin);
    }

    @FXML
    private void dua(ActionEvent event) {
         pin += "2";
        passwordfield.setText (pin);
    }

    @FXML
    private void tiga(ActionEvent event) {
         pin += "3";
        passwordfield.setText (pin);
    }

    @FXML
    private void clear(ActionEvent event) {
         pin = "";
        passwordfield.setText ("");
    }
    
}
