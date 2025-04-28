module TwentyMinutesTillDawn {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires com.google.gson;
    requires java.desktop;
    exports views;
    opens views to javafx.fxml;
    opens models to com.google.gson, javafx.base, javafx.fxml;
}