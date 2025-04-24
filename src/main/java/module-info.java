module module_name {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires com.google.gson;

    exports views;
    opens views to javafx.fxml;
}