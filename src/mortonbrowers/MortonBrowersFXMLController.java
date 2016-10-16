/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mortonbrowers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author A-Rod
 */
public class MortonBrowersFXMLController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private TextField routeNum;
    @FXML
    private TextField stopNum;
    @FXML
    private TextField trailerPosition;
    @FXML
    private TextField caseQuantity;
    @FXML
    private TextField itemDescription;
    @FXML
    private TextArea additionalNotes;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("Submit");
        label.setText(
                  "\nRoute Number#    \t" + routeNum.getText()
                + "\nStops Number#    \t" + stopNum.getText()
                + "\nTrailer Position:\t" + trailerPosition.getText()
                + "\nCase Quantity:   \t" + caseQuantity.getText()
                + "\nItem Description:\t" + itemDescription.getText()
                +"\nAdditional Notes  \t" + additionalNotes.getText()
        );
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
