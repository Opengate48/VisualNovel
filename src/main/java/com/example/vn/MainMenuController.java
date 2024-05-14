package com.example.vn;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

import static com.example.vn.VNApplication.currentFrameNumber;
import static com.example.vn.VNApplication.currentStage;

public class MainMenuController {

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
        currentStage.close();
    }

    @FXML
    void play(ActionEvent event) throws IOException {
        currentFrameNumber = 1;
        //Stage currentStage = (Stage) playBtn.getScene().getWindow();
        VNApplication.changeScene("cf1_.fxml");
        //currentStage.hide();
    }

    @FXML
    void toSaves(ActionEvent event) throws IOException {
        VNApplication.changeScene("saves_screen.fxml");
    }

    @FXML
    void initialize() {
        assert exitBtn != null : "fx:id=\"exitBtn\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert loadBtn != null : "fx:id=\"loadBtn\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert mmbg != null : "fx:id=\"mmbg\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert playBtn != null : "fx:id=\"playBtn\" was not injected: check your FXML file 'hello-view.fxml'.";
    }

}
