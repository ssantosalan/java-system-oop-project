module com.example.fxproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.fxproject to javafx.fxml;
    exports com.example.fxproject;
}