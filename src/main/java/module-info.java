module com.example.silenceinterruptedbysounds {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.silenceinterruptedbysounds to javafx.fxml;
    exports com.example.silenceinterruptedbysounds;
}