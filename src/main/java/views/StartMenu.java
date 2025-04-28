package views;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;

public class StartMenu extends Application {
    private Stage stage;

    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;

        URL url = getClass().getResource("/FXML/StartMenu.fxml");
        AnchorPane root = FXMLLoader.load(url);
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("/CSS/style.css").toExternalForm());

        stage.setTitle("Twenty Minutes Till Dawn");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private void handleExitButtonAction() {
        Platform.exit();
    }
}