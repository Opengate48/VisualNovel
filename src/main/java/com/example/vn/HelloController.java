package com.example.vn;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button exitBtn;

    @FXML
    private Button loadBtn;

    @FXML
    private ImageView mmbg;

    @FXML
    private Button playBtn;

    @FXML
    void kill(ActionEvent event) {

    }

    @FXML
    void play(ActionEvent event) {

    }

    @FXML
    void toSaves(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert exitBtn != null : "fx:id=\"exitBtn\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert loadBtn != null : "fx:id=\"loadBtn\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert mmbg != null : "fx:id=\"mmbg\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert playBtn != null : "fx:id=\"playBtn\" was not injected: check your FXML file 'hello-view.fxml'.";
    }

}
