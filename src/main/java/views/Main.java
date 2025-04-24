package views;

import javafx.application.Application;
import javafx.stage.Stage;
import models.App;

public class Main extends Application {
    public static Stage stage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        App.load();
        stage.show();
    }
}
