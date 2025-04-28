package models.utils;

import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.image.Image;

public class CursorManager {
    private static ImageCursor customCursor;


    private static void loadCursor() {
        if (customCursor == null) {
            try {
                Image cursorImage = new Image(CursorManager.class.getResourceAsStream("/images/cursor.png"));
                customCursor = new ImageCursor(cursorImage);
            } catch (Exception e) {
                System.err.println("Failed to load custom cursor: " + e.getMessage());
            }
        }
    }
    
    public static void setCustomCursor(Scene scene) {
        loadCursor();
        if (customCursor != null) {
            scene.setCursor(customCursor);
        }
    }
}