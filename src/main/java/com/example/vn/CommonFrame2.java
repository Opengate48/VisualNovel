package com.example.vn;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class CommonFrame2 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView actorImg;

    @FXML
    private ImageView bgImg;

    @FXML
    private Button nxtBtn;

    @FXML
    void nxt(ActionEvent event) throws IOException {
        VNApplication.changeScene("commonframe2.fxml");
    }

    @FXML
    void initialize() {
        assert actorImg != null : "fx:id=\"actorImg\" was not injected: check your FXML file 'commonframe3.fxml'.";
        assert bgImg != null : "fx:id=\"bgImg\" was not injected: check your FXML file 'commonframe3.fxml'.";
        assert nxtBtn != null : "fx:id=\"nxtBtn\" was not injected: check your FXML file 'commonframe3.fxml'.";

    }

}

