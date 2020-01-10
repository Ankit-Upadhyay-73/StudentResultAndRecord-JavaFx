package home.record;

import com.jfoenix.controls.JFXButton;
import home.helperClasses.HelperClass;
import home.student.addStudent.AddStudentController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class RecordController
{
    @FXML
    private JFXButton closeWindow;

    HelperClass helperClass = new HelperClass();

    @FXML
    void setOnClose(ActionEvent event) throws IOException
    {
        helperClass.getAndCloseWindow(closeWindow);
    }
}

