package views;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class FontTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Load the font (make sure the font file is on the classpath or loaded from a proper location)
        Font customFont = Font.loadFont(getClass().getResourceAsStream("/Font/ChevyRay.ttf"), 20);

        Label label = new Label("Hello with custom font!");
        if (customFont != null) {
            label.setFont(customFont);
        } else {
            label.setFont(Font.font("System", 20));
            System.out.println("Failed to load custom font - using system font instead.");
        }

        primaryStage.setScene(new Scene(label, 400, 200));
        primaryStage.show();
    }
}