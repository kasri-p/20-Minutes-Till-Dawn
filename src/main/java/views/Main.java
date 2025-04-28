package views;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import models.App;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // Load the custom font
        Font customFont = Font.loadFont(getClass().getResourceAsStream("/Font/ChevyRay.ttf"), 20);

        Label label = new Label("Twenty Minutes Till Dawn");
        label.setFont(customFont);
        stage.setScene(new Scene(label, 400, 200));
        App.load();
        stage.show();
    }
}