package views;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import models.utils.FontLoader;

public class Main extends Application {
    private Stage stage;

    @FXML
    private Button startButton;

    @FXML
    private Button settingsButton;

    @FXML
    private Button quitButton;

    @FXML
    private HBox topNavBar;

    @FXML
    private HBox bottomNavBar;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/StartMenu.fxml"));
        Scene scene = new Scene(loader.load());
        
        stage.setTitle("20 Minutes Till Dawn");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void initialize() {
        if (startButton != null) {
            startButton.setFont(FontLoader.getCustomFont(16));
        }

        if (settingsButton != null) {
            settingsButton.setFont(FontLoader.getCustomFont(16));
        }

        if (quitButton != null) {
            quitButton.setFont(FontLoader.getCustomFont(16));
        }
    }

    @FXML
    private void handleExitButtonAction() {
        Platform.exit();
    }

    @FXML
    private void handleStartButtonAction() {
        // Handle start button action
        System.out.println("Start button clicked");
    }
}