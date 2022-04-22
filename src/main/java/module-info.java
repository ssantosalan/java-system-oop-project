module com.example.javasystemoopproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.javasystemoopproject to javafx.fxml;
    exports com.example.javasystemoopproject;
}