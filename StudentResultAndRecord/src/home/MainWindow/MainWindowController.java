package home.MainWindow;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDrawer;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.Loader;
import home.helperClasses.HelperClass;
import home.result.CreateResultController;
import home.student.addStudent.AddStudentController;
import home.subject.addSubject.AddSubjectController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class MainWindowController implements Initializable
{
    @FXML
    private AnchorPane homeAnchorScene;

    @FXML
    public AnchorPane homeSwithableContentLayout;

    @FXML
    private JFXDrawer settingDrawerWind;

    @FXML
    private Label homeClgName;

    @FXML
    private Label annotateHomeHeadName;

    @FXML
    private JFXButton homeStudentBtn;

    @FXML
    private JFXButton homeSubjectBtn;

    @FXML
    private JFXButton homeResultBtn;

    @FXML
    private JFXButton homeRecordBtn;

    @FXML
    private JFXButton homeDataEntryOperatorBtn;

    HelperClass helperClass = new HelperClass() ;

    @FXML
    void setOnHomeDEOClick(ActionEvent event) throws IOException
    {
    }

    @FXML
    void setOnHomeRecordClick(ActionEvent event) throws IOException {
        AnchorPane requestedScene = helperClass.loadFxWithScene("../record/RecordFx.fxml");
        helperClass.getSceneDetails().getChildren().setAll(requestedScene);
    }

    @FXML
    void setOnHomeResultClick(ActionEvent event) throws IOException
    {
/*
        AnchorPane requestedScene = helperClass.loadFxWithScene("../result/CreateResultFx.fxml");
        helperClass.getSceneDetails().getChildren().setAll(requestedScene);
*/
        FXMLLoader getRespondedFX = helperClass.getFxLoader("../result/CreateResultFx.fxml");
        AnchorPane window = getRespondedFX.load();
        helperClass.getSceneDetails().getChildren().setAll(window);
        CreateResultController createResultController = getRespondedFX.getController();
        createResultController.setHeaderEventValue("headerResultBtn");
    }

    @FXML
    void setOnHomeStudentClick(ActionEvent event) throws IOException
    {
/*
        AnchorPane loaderTypeWindow = null;
        AnchorPane requestedScene = helperClass.loadFxWithScene("../student/addStudent/AddStudentFx.fxml",loaderTypeWindow);
        helperClass.getSceneDetails().getChildren().setAll(requestedScene);
 */
/*
        AnchorPane window  = helperClass.loadFxWithScene("../student/addStudent/AddStudentFx.fxml");
        helperClass.getSceneDetails().getChildren().setAll(window);
*/
        FXMLLoader getRespondedFX = helperClass.getFxLoader("../student/addStudent/AddStudentFx.fxml");
        AnchorPane window = getRespondedFX.load();
        helperClass.getSceneDetails().getChildren().setAll(window);
        AddStudentController studentController = getRespondedFX.getController();
        studentController.setHeaderEventValue("headerStudentBtn");
    }

    @FXML
    void setOnHomeSubjectClick(ActionEvent event) throws IOException
    {
/*
        AnchorPane requestedScene =helperClass.loadFxWithScene("../subject/addSubject/AddSubjectFx.fxml");
        AnchorPane windows =  helperClass.getSceneDetails();
        System.out.println(windows);
        windows.getChildren().setAll(requestedScene);
*/
        FXMLLoader getRespondedFX = helperClass.getFxLoader("../subject/addSubject/AddSubjectFx.fxml");
        AnchorPane window = getRespondedFX.load();
        helperClass.getSceneDetails().getChildren().setAll(window);
        AddSubjectController studentController = getRespondedFX.getController();
        studentController.setHeaderEventValue("headerSubjectBtn");
    }

    @FXML
    void setOnSetting(ActionEvent event) throws IOException
    {
        VBox hodSettingWindow = FXMLLoader.load(getClass().getResource("SettingDrawer.fxml"));
        settingDrawerWind.setSidePane(hodSettingWindow);
        settingDrawerWind.setDefaultDrawerSize(206);
        if(settingDrawerWind.isClosed())
        {
            settingDrawerWind.open();
            settingDrawerWind.setMinWidth(206);
        }
        else
        {
            settingDrawerWind.close();
            settingDrawerWind.setMaxWidth(0);
        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
       helperClass.setSceneDetails(homeSwithableContentLayout);
    }
}
