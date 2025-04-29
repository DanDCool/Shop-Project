module org.example.shop {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.shop to javafx.fxml;
    exports org.example.shop;
}