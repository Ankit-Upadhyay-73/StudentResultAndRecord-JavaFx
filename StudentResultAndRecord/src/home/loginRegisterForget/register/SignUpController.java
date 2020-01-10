package home.loginRegisterForget.register;

import com.jfoenix.controls.*;
import home.helperClasses.HelperClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SignUpController implements Initializable
{
    @FXML
    public Label identityRegisterUser;

    @FXML
    private Label registration_date;

    @FXML
    private JFXTextField register_headname;

    @FXML
    private JFXComboBox<?> register_headof;

    @FXML
    private JFXComboBox<?> register_collegeorschoolselection;

    @FXML
    private JFXTextField register_mobileno;

    @FXML
    private JFXTextField register_email;

    @FXML
    private JFXPasswordField register_password;

    @FXML
    private JFXPasswordField register_confirmpassword;

    @FXML
    private JFXTextField register_otp;

    @FXML
    private JFXTextArea register_collegename;

    @FXML
    private JFXButton backbtn;

    HelperClass helperClass = new HelperClass();

    @FXML
    void setOnBack(ActionEvent event) throws IOException
    {
        AnchorPane loginWindow = helperClass.loadFxWithScene("../loginRegisterForget/login/LoginFx.fxml");
        Stage stage = (Stage) backbtn.getScene().getWindow();
        stage.setScene(new Scene(loginWindow));
    }

    String registerUser=null;
    public void setCrossData(String indentityUser)
    {
        //registerUser=indentityUser;
        identityRegisterUser.setText(indentityUser+" Registration with College And Course");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
//        identityRegisterUser.setText(registerUser+" Registration with College And Course");
    }
}
