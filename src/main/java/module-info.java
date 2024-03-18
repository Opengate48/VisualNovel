module com.example.vn {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.vn to javafx.fxml;
    exports com.example.vn;
}