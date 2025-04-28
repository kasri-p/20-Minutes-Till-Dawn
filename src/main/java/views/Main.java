package views;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import models.App;

import java.net.URL;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        URL fontUrl = Main.class.getResource("/Font/ChevyRay.ttf");
        if (fontUrl == null) {
            System.err.println("Font file not found!");
        } else {
            Font.loadFont(fontUrl.toExternalForm(), 10);
        }
        FXMLLoader loader = new FXMLLoader(Main.class.getResource("/FXML/StartMenu.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("/CSS/style.css").toExternalForm());

        stage.setTitle("Twenty Minutes Till Dawn");
        stage.setScene(scene);
        App.load();
        stage.show();
    }
}