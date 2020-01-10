package home.helperClasses;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelperClass
{
    public   AnchorPane mainSwitchableScene;
    public  void setSceneDetails(AnchorPane addStudentAnchor)
    {
        mainSwitchableScene = addStudentAnchor;
    }

    public  AnchorPane loadFxWithScene(String path) throws IOException
    {
        AnchorPane window;
        FXMLLoader loaderWindow = new FXMLLoader();
        loaderWindow.setLocation(getClass().getResource(path));
        window = loaderWindow.load();
        return window;
    }

    public  FXMLLoader getFxLoader(String path) throws IOException
    {
        FXMLLoader sceneWindow= new FXMLLoader();
        sceneWindow.setLocation(getClass().getResource(path));
        return sceneWindow;
    }

    public  AnchorPane getSceneDetails() throws IOException
    {
        return  mainSwitchableScene;
    }

    public void getAndCloseWindow(JFXButton closeWindow) throws IOException
    {
        AnchorPane window = loadFxWithScene("../MainWindow/MainWindowFx.fxml");
        Stage homeStage = (Stage) closeWindow.getScene().getWindow();
        homeStage.setScene(new Scene(window,1366,765));
    }
}
