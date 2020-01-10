package home.result;

import com.jfoenix.controls.JFXButton;
import home.helperClasses.HelperClass;
import home.student.addStudent.AddStudentController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CreateResultController implements Initializable
{
    HelperClass helperClass = new HelperClass();

    @FXML
    private AnchorPane createResultAnchor;

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

    @FXML
    void onHeaderDataEntryOperator(ActionEvent event) {

    }

    @FXML
    void onHeaderRecord(ActionEvent event) throws IOException {
        AnchorPane requestedScene = helperClass.loadFxWithScene("../record/RecordFx.fxml");
        helperClass.getSceneDetails().getChildren().setAll(requestedScene);
    }

    @FXML
    void onHeaderResult(ActionEvent event) throws IOException {
        AnchorPane requestedScene = helperClass.loadFxWithScene("../result/CreateResultFx.fxml");
        helperClass.getSceneDetails().getChildren().setAll(requestedScene);
    }

    @FXML
    void onHeaderStudent(ActionEvent event) throws IOException {
        AnchorPane StudentWindow = helperClass.loadFxWithScene("../student/addStudent/AddStudentFx.fxml");
        helperClass.getSceneDetails().getChildren().setAll(StudentWindow);
    }

    @FXML
    void onHeaderSubject(ActionEvent event) throws IOException {
        AnchorPane requestedScene = helperClass.loadFxWithScene("../subject/addSubject/AddSubjectFx.fxml");
        helperClass.getSceneDetails().getChildren().setAll(requestedScene);
    }

    @FXML
    void setOnClose(ActionEvent event) throws IOException {
        helperClass.getAndCloseWindow(closeWindow);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        helperClass.setSceneDetails(createResultAnchor);
    }

    public void setHeaderEventValue(String headerSubjectBtn)
    {
        this.headerResultBtn.setDisable(true);
    }
}


