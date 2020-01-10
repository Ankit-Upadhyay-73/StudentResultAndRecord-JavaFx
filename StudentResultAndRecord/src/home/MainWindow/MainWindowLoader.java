package home.MainWindow;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;

public class MainWindowLoader extends Application
{
    int height , width;
    {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        height = (int) screenSize.getHeight();
        width = (int) screenSize.getWidth();
        System.out.println("height "+height);
        System.out.println("width "+width);
    }
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent window = FXMLLoader.load(getClass().getResource("MainWindowFx.fxml"));
        primaryStage.setScene(new Scene(window,width,730));
        primaryStage.show();
        primaryStage.setResizable(false);
    }

    public static void  main(String[] args)
    {
        launch(args);
    }
}
