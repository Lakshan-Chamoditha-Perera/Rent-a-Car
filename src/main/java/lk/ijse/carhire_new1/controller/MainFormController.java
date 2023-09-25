package lk.ijse.carhire_new1.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFormController {
    public Button customerButton;
    public AnchorPane node;


    public void customerAction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(this.getClass().getResource("/view/Customer_form.fxml"));

        this.node.getChildren().clear();
        this.node.getChildren().add(root);

    }
}
