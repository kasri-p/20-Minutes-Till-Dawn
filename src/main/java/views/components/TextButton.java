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
        setFont(FontLoader.getCustomFont(fontSize));

        setStyle("-fx-background-color: transparent; -fx-border-color: transparent; -fx-text-fill: #990033;");

        setOnMouseEntered(e -> setStyle("-fx-background-color: transparent; -fx-border-color: transparent; -fx-text-fill: #ffcccc;"));
        setOnMouseExited(e -> setStyle("-fx-background-color: transparent; -fx-border-color: transparent; -fx-text-fill: #990033;"));
    }
}