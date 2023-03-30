module com.example.goldgamefx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.goldgamefx to javafx.fxml;
    exports com.example.goldgamefx;
}