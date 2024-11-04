module com.example.odtwarzaczfilmowy {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires javafx.media;

    opens com.example.odtwarzaczfilmowy to javafx.fxml;
    exports com.example.odtwarzaczfilmowy;
}