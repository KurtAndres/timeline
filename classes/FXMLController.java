/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Andrew
 */
public class FXMLController implements Initializable {

    @FXML
    private void handleMonthAction(ActionEvent event) {
        int month = 0;
        
        switch(month){
            case 0:
                System.out.println("Month!");
                break;
        }
    }
    @FXML
    private void handleDateBornAction(ActionEvent ae){
    }
                
        
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
