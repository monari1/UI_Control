module com.example.ui_control {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ui_control to javafx.fxml;
    exports com.example.ui_control;
}