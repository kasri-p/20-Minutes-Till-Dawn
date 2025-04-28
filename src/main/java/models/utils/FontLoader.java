// Create a new utility class to handle font loading
package models.utils;

import javafx.scene.text.Font;

public class FontLoader {
    private static boolean fontsLoaded = false;

    public static void loadFonts() {
        if (!fontsLoaded) {
            Font customFont = Font.loadFont(
                    FontLoader.class.getResourceAsStream("/Font/ChevyRay.ttf"),
                    20
            );

            if (customFont != null) {
                System.out.println("Font loaded successfully: " + customFont.getFamily());
                fontsLoaded = true;
            } else {
                System.err.println("Failed to load custom font");
            }
        }
    }

    public static Font getCustomFont(double size) {
        loadFonts();
        return Font.loadFont(
                FontLoader.class.getResourceAsStream("/Font/ChevyRay.ttf"),
                20
        );
    }
}