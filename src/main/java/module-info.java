module org.example.tdmap {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens org.example.tdmap to javafx.fxml;
    exports org.example.tdmap;
}