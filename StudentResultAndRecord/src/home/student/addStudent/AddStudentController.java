package home.student.addStudent;

import com.jfoenix.controls.JFXButton;
import home.helperClasses.HelperClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import sun.plugin.javascript.navig.Anchor;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AddStudentController implements Initializable {

    @FXML
    private AnchorPane switchableMainAddStudentAnchor;

    @FXML
    private JFXButton ActionOnStudent_UpdateBtn;

    @FXML
    private JFXButton ActionOnStudent_RemoveBtn;

    @FXML
    private JFXButton ActionOnStudent_ViewBtn;


    @FXML
    private AnchorPane addStudentAnchor;


    @FXML
    private Label annotateCourse_name;

    @FXML
    private JFXButton headerSubjectBtn;

    @FXML
    private JFXButton headerStudentBtn;

    @FXML
    private JFXButton headerResultBtn;

    @FXML
    private JFXButton headerRecordBtn;

    @FXML
    private JFXButton headerDataEntryOperatorBtn;

    @FXML
    private JFXButton closeWindow;

    HelperClass helperClass = new HelperClass();

    @FXML
    void onHeaderDataEntryOperator(ActionEvent event)
    {

    }

    @FXML
    void onHeaderRecord(ActionEvent event) throws IOException
    {
        AnchorPane requestedScene = helperClass.loadFxWithScene("../record/RecordFx.fxml");
        helperClass.getSceneDetails().getChildren().setAll(requestedScene);
    }

    @FXML
    void onHeaderResult(ActionEvent event) throws IOException
    {
        AnchorPane requestedScene = helperClass.loadFxWithScene("../result/CreateResultFx.fxml");
        helperClass.getSceneDetails().getChildren().setAll(requestedScene);
    }

    @FXML
    void onHeaderStudent(ActionEvent event) throws IOException
    {

    }

    @FXML
    void onHeaderSubject(ActionEvent event) throws IOException
    {
        AnchorPane requestedScene = helperClass.loadFxWithScene("../subject/addSubject/AddSubjectFx.fxml");
        helperClass.getSceneDetails().getChildren().setAll(requestedScene);
    }

    @FXML
    void setOnClose(ActionEvent event) throws IOException
    {
        helperClass.getAndCloseWindow(closeWindow);
    }

    @FXML
    void setOnRemove(ActionEvent event) throws IOException
    {
        AnchorPane window = helperClass.loadFxWithScene("../student/editStudent/removeStudent/RemoveStudentFx.fxml");
        switchableMainAddStudentAnchor.getChildren().setAll(window);
    }

    @FXML
    void setOnUpdate(ActionEvent event) throws IOException
    {
        AnchorPane window = helperClass.loadFxWithScene("../student/editStudent/updateStudent/UpdateStudentFx.fxml");
        switchableMainAddStudentAnchor.getChildren().setAll(window);
    }

    @FXML
    void setOnView(ActionEvent event) throws IOException
    {
        AnchorPane window = helperClass.loadFxWithScene("../student/viewStudent/ViewStudentFx.fxml");
        switchableMainAddStudentAnchor.getChildren().setAll(window);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        helperClass.setSceneDetails(addStudentAnchor);
    }

    public void setHeaderEventValue(String headerStudentBtn)
    {
        this.headerStudentBtn.setDisable(true);
    }
}
