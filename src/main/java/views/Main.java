package views;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import models.utils.CursorManager;
import models.utils.FontLoader;
import views.components.TextButton;

public class Main extends Application {
    private Stage stage;

    @FXML
    private VBox centerVBox;

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

        // Load fonts before creating the scene
        FontLoader.loadFonts();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/MainMenu.fxml"));
        Scene scene = new Scene(loader.load());

        // Set custom cursor
        CursorManager.setCustomCursor(scene);

        // Ensure the stage is set to a fixed size that matches your background image
        stage.setWidth(900);
        stage.setHeight(600);
        stage.setResizable(false);

        stage.setTitle("20 Minutes Till Dawn");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void initialize() {
        // Create text buttons with larger font size for better visibility over background
        TextButton startButton = new TextButton("Play Game", 24);
        TextButton settingsButton = new TextButton("Settings", 24);
        TextButton quitButton = new TextButton("Quit", 24);

        // Set action handlers
        startButton.setOnAction(event -> handleStartButtonAction());
        quitButton.setOnAction(event -> handleExitButtonAction());

        // Add buttons to the center VBox
        if (centerVBox != null) {
            centerVBox.getChildren().addAll(startButton, settingsButton, quitButton);
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