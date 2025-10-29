package com.example.silenceinterruptedbysounds;

import com.example.silenceinterruptedbysounds.model.SoundsModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class sinsoController {

    @FXML
    public Slider volumeSlider;

    @FXML
    public Button playStopButton;

    @FXML
    public TextField dirForm;

    private SoundsModel  model = new SoundsModel();

    @FXML
    protected void toggleExecution() {

    }

    @FXML
    protected void volumeChanged() {

    }

    @FXML
    protected void dirSubmitted() {
        model.setDir(dirForm.getText());
    }

}
