package views;

import controllers.RegisterMenuController;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class RegisterMenu extends Application {
    public static Stage stage;
    final RegisterMenuController controller = new RegisterMenuController();

    @FXML
    private TextField username;
    @FXML
    private TextField password;

    @Override
    public void start(Stage stage) throws Exception {
        URL url = Main.class.getResource("/FXML/RegisterMenu.fxml");
        assert url != null;
        stageCreator(url, "20 minutes till dawn");
    }

    public void stageCreator(URL url, String title) throws IOException {
        AnchorPane root = FXMLLoader.load(url);
        Scene scene = new Scene(root);
        Image icon = new Image(Main.class.getResource("/Images/icon.png").toExternalForm());
    }
}
