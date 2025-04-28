package views;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import models.utils.FontLoader;

public class Main extends Application {
    private Stage stage;

    @FXML
    private Button startButton;

    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;

        // Use an FXMLLoader to set 'this' as the controller
//        FXMLLoader loader = new FXMLLoader(url);
//        AnchorPane root = loader.load();

        Label label = new Label("20 Minutes Till Dawn");
        label.setFont(FontLoader.getCustomFont(20));
        Scene scene = new Scene(label);
        stage.setScene(scene);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void initialize() {
        // Set the font programmatically for this specific button
        startButton.setFont(FontLoader.getCustomFont(16));
    }

    @FXML
    private void handleExitButtonAction() {
        Platform.exit();
    }
}