module com.example.silenceinterruptedbysounds {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.silenceinterruptedbysounds to javafx.fxml;
    exports com.example.silenceinterruptedbysounds;
    exports com.example.silenceinterruptedbysounds.model;
    opens com.example.silenceinterruptedbysounds.model to javafx.fxml;
}