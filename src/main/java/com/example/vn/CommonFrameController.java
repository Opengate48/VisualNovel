package com.example.vn;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class CommonFrameController {

    public CommonFrameController(int curFrameNumbr){
        curFrameNumber = curFrameNumbr;
    }

    public CommonFrameController(){
        new CommonFrameController(1);
    }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView cfbg;

    @FXML
    private Button nxtBtn;

    private int curFrameNumber;

    @FXML
    void nxt(ActionEvent event) throws IOException {
        VNApplication.changeScene("cf" + curFrameNumber + ".fxml");
        curFrameNumber += 1;
    }

    @FXML
    void initialize() {
        assert cfbg != null : "fx:id=\"cfbg\" was not injected: check your FXML file 'coommon-frame.fxml'.";
        assert nxtBtn != null : "fx:id=\"nxtBtn\" was not injected: check your FXML file 'coommon-frame.fxml'.";

    }

}

