module module_name {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    exports views;
    opens views to javafx.fxml;
}