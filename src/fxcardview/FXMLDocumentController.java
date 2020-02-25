/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxcardview;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;

/**
 *
 * @author SUWIMA
 */
public class FXMLDocumentController implements Initializable {
    @FXML
    private GridPane cardHolder;
    ObservableList<CustomerCard> list = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        list.add(new CustomerCard(1, "Pawan Ghewande", "96******30", "10/02/2019", "3"));
        list.add(new CustomerCard(2, "Pawan Ghewande", "96******30", "10/02/2019", "4"));
        list.add(new CustomerCard(3, "Pawan Ghewande", "96******30", "10/02/2019", "5"));
        list.add(new CustomerCard(4, "Pawan Ghewande", "96******30", "10/02/2019", "6"));
        list.add(new CustomerCard(5, "Pawan Ghewande", "96******30", "10/02/2019", "7"));
        list.add(new CustomerCard(6, "Pawan Ghewande", "96******30", "10/02/2019", "8"));
        list.add(new CustomerCard(7, "Pawan Ghewande", "96******30", "10/02/2019", "9"));
        list.add(new CustomerCard(8, "Pawan Ghewande", "96******30", "10/02/2019", "10"));
        list.add(new CustomerCard(9, "Pawan Ghewande", "96******30", "10/02/2019", "11"));
        list.add(new CustomerCard(10, "Pawan Ghewande","96******30", "10/02/2019", "12"));
        list.add(new CustomerCard(11, "Pawan Ghewande","96******30", "10/02/2019", "13"));
        list.add(new CustomerCard(12, "Pawan Ghewande","96******30", "10/02/2019", "14"));
        list.add(new CustomerCard(13, "Pawan Ghewande","96******30", "10/02/2019", "15"));
        list.add(new CustomerCard(14, "Pawan Ghewande","96******30", "10/02/2019", "16"));
        list.add(new CustomerCard(15, "Pawan Ghewande","96******30", "10/02/2019", "17"));
        list.add(new CustomerCard(16, "Pawan Ghewande","96******30", "10/02/2019", "17"));
        cardHolder.setAlignment(Pos.CENTER);
        cardHolder.setVgap(20.00);
        cardHolder.setHgap(20.00);
        cardHolder.setStyle("-fx-padding:10px;-fx-border-color:transparent");

        onSearch();
    }

    @FXML
    public void onSearch() {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                cardHolder.add(list.get(count), j, i);
                count++;
                //System.out.println(i + " " + j);
            }
        }

    }
}
