package lk.ijse.carhire_new1.controller;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class CustomerFormController implements Initializable {
    public TextField custIdText;
    public TextField custTitleText;
    public TextField custNameText;
    public TextField nicText;
    public TableView customerTable;
    public Button saveButton;
    public Button updateButton;
    public Button deleteButton;
    public TextField mobileText;
    public TextField addressText;
    public AnchorPane root;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
