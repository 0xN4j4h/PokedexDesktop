package com.example.formproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class FormularioController {
    @FXML
    private Button btn;

    @FXML
    private Button btnclose;

    @FXML
    void onClose(ActionEvent event) {
    Stage stage = (Stage) btnclose.getScene().getWindow();
    stage.close();
    }

    @FXML
    void onLogin(ActionEvent event) {

    }

}