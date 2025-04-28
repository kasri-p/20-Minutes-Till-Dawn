package views.components;

import javafx.scene.control.Button;
import models.utils.FontLoader;


public class TextButton extends Button {

    public TextButton(String text) {
        super(text);
        initialize();
    }

    public TextButton(String text, double fontSize) {
        super(text);
        initialize(fontSize);
    }

    private void initialize() {
        initialize(16);
    }

    private void initialize(double fontSize) {
        // Set the custom font
        setFont(FontLoader.getCustomFont(fontSize));

        // Remove background and border
        setStyle("-fx-background-color: transparent; -fx-border-color: transparent; -fx-text-fill: white;");

        // Add hover effect
        setOnMouseEntered(e -> setStyle("-fx-background-color: transparent; -fx-border-color: transparent; -fx-text-fill: #cccccc;"));
        setOnMouseExited(e -> setStyle("-fx-background-color: transparent; -fx-border-color: transparent; -fx-text-fill: white;"));
    }
}