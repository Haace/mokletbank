/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mokletbank;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author AdityaHarisCandra
 */
public class DuwekController implements Initializable {

   String nominal = "";
    int tmp;
    
    @FXML
    private JFXTextField button50;
    @FXML
    private JFXTextField button500;
    @FXML
    private JFXTextField button100;
    @FXML
    private JFXTextField button1000;
    @FXML
    private JFXTextField buttonLain;
    @FXML
    private JFXTextField button250;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void tekan50(ActionEvent event) {
        nominal = "Rp. 50.000";
        JOptionPane.showMessageDialog(null, "Selamat transaksi sebesar \n"+nominal+" telah berhasil");
    }

    @FXML
    private void tekan500(ActionEvent event) {
        nominal = "Rp. 500.000";
        JOptionPane.showMessageDialog(null, "Selamat transaksi sebesar \n"+nominal+" telah berhasil");
    }

    @FXML
    private void tekan100(ActionEvent event) {
        nominal = "Rp. 100.000";
        JOptionPane.showMessageDialog(null, "Selamat transaksi sebesar \n"+nominal+" telah berhasil");
    }

    @FXML
    private void tekan1000(ActionEvent event) {
        nominal = "Rp. 1.000.000";
        JOptionPane.showMessageDialog(null, "Selamat transaksi sebesar \n"+nominal+" telah berhasil");
    }

    private void tekan200(ActionEvent event) {
        nominal = "Rp. 200.000";
        JOptionPane.showMessageDialog(null, "Selamat transaksi sebesar \n"+nominal+" telah berhasil");
    }

    @FXML
    private void tekanLain(ActionEvent event) {
    }

    @FXML
    private void tekan250(ActionEvent event) {
    }
    
}
