package home.loginRegisterForget.forget;

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

public class ForgetController implements Initializable
{
    @FXML
    private Label annotateForgetUser;

    String forgetUser=null;

    HelperClass helperClass = new HelperClass();

    @FXML
    void setOnBack(ActionEvent event) throws IOException
    {
        AnchorPane loginWindow = helperClass.loadFxWithScene("../loginRegisterForget/login/LoginFx.fxml");
        Stage stage = (Stage) annotateForgetUser.getScene().getWindow();
        stage.setScene(new Scene(loginWindow));
    }

    public void setCrossData(String indentityUser)
    {
        forgetUser = indentityUser;
        annotateForgetUser.setText("Password Recovery For "+forgetUser);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
    }

}
