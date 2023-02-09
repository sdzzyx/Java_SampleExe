module com.example.helloworlddesktopapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.helloworlddesktopapp to javafx.fxml;
    exports com.example.helloworlddesktopapp;
}