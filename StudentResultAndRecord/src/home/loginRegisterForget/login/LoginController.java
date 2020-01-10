package home.loginRegisterForget.login;

import com.sun.deploy.util.FXLoader;
import home.MainWindow.MainWindowLoader;
import home.loginRegisterForget.forget.ForgetController;
import home.loginRegisterForget.register.SignUpController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable
{
    @FXML
    private AnchorPane loginAnchor;

    @FXML
    public AnchorPane mainLoginAnchor;

    @FXML
    public Label indentityUser;

    FXMLLoader loaderForRegister = new  FXMLLoader();
    FXMLLoader loaderForForget = new FXMLLoader();

    @FXML
    void setOnForget(ActionEvent event) throws IOException
    {
        loaderForForget.setLocation(getClass().getResource("../forget/ForgetFx.fxml"));
        AnchorPane pane=loaderForForget.load();
        mainLoginAnchor.getChildren().setAll(pane);
        ForgetController forgetController = loaderForForget.getController();
        forgetController.setCrossData(indentityUser.getText());
    }

    @FXML
    void setOnRegister(ActionEvent event) throws IOException
    {
        loaderForRegister.setLocation(getClass().getResource("../register/SignUpFx.fxml"));
        AnchorPane pane=loaderForRegister.load();
        loginAnchor.getChildren().setAll(pane);
        SignUpController signUpController = loaderForRegister.getController();
        signUpController.setCrossData(indentityUser.getText());
    }

    @FXML
    void setOnDEO(ActionEvent event) throws IOException
    {
        loginAnchor.setDisable(false);
        indentityUser.setText("As Data Entry Operator");
    }

    @FXML
    void setOnHead(ActionEvent event) throws IOException
    {
        loginAnchor.setDisable(false);
        indentityUser.setText("As Head");
    }

    @FXML
    void onLogin(ActionEvent event) throws Exception {
        Stage window = (Stage) loginAnchor.getScene().getWindow();
        MainWindowLoader mainWindowLoader = new MainWindowLoader();
        Stage primaryStage=new Stage();
        mainWindowLoader.start(primaryStage);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        loginAnchor.setDisable(true);
    }
}
