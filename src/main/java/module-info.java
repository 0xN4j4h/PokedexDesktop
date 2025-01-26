module com.example.formproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires javafx.graphics;


    opens com.example.formproject to javafx.fxml;
    exports com.example.formproject;
}