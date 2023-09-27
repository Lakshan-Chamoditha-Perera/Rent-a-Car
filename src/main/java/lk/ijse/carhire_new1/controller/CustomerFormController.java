package lk.ijse.carhire_new1.controller;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import lk.ijse.carhire_new1.db.FactoryConfiguration;
import lk.ijse.carhire_new1.service.ServiceFactory;
import lk.ijse.carhire_new1.service.custom.CustomerService;
import lk.ijse.carhire_new1.service.util.ServiceType;
import org.hibernate.Session;

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
    private CustomerService customerService;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        init();
        Session session = FactoryConfiguration.getFactoryConfiguration().getSession();// for testing purpose
    }

    void init() {
        customerService = ServiceFactory.getInstance().getService(ServiceType.Customer_Service);
    }
}
