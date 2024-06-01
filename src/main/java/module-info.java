module com.example.vn {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.media;


    opens com.example.vn to javafx.fxml;
    exports com.example.vn;
}