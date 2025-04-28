package views;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.net.URL;

public class StartMenu extends Application {
    private Stage stage;

    @FXML
    private Button startButton;

    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;

        // Load your custom font
        Font customFont = Font.loadFont(getClass().getResourceAsStream("/Font/ChevyRay.ttf"), 20);
        if (customFont == null) {
            System.err.println("Failed to load custom font, proceeding with default fonts.");
        }

        // Use an FXMLLoader to set 'this' as the controller
        URL url = getClass().getResource("/FXML/StartMenu.fxml");
        FXMLLoader loader = new FXMLLoader(url);
        loader.setController(this);
        AnchorPane root = loader.load();

        Scene scene = new Scene(root);
        stage.setTitle("Twenty Minutes Till Dawn");
        stage.setScene(scene);
        stage.show();

        startButton.setFont(customFont);

    }

    @FXML
    private void handleExitButtonAction() {
        Platform.exit();
    }
}