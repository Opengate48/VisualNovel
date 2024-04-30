package com.example.vn;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

import static com.example.vn.VNApplication.currentFxmlName;
import static com.example.vn.VNApplication.currentFrameNumber;

public class CommonFrameController {



    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button bckBtn;

    @FXML
    private ImageView cfbg;

    @FXML
    private Button nxtBtn;

    @FXML
    private Button saveBtn;

    @FXML
    private Button toMMBtn;

    //private static Integer curFrameNumber = 1;

    @FXML
    void nxt(ActionEvent event) throws IOException {
        currentFrameNumber += 1;
        String postfix = currentFxmlName.substring(currentFxmlName.indexOf('_'));
        Integer currentFrameNumberInt = currentFrameNumber;
        VNApplication.changeScene("cf" + currentFrameNumberInt.toString() + postfix);
        System.out.println(currentFxmlName);
    }

    @FXML
    void bck(ActionEvent event) {

    }

    @FXML
    void save(ActionEvent event) {

    }

    @FXML
    void toMM(ActionEvent event) {

    }
    @FXML
    void initialize() {
        assert bckBtn != null : "fx:id=\"bckBtn\" was not injected: check your FXML file 'cf1.fxml'.";
        assert cfbg != null : "fx:id=\"cfbg\" was not injected: check your FXML file 'cf1.fxml'.";
        assert nxtBtn != null : "fx:id=\"nxtBtn\" was not injected: check your FXML file 'cf1.fxml'.";
        assert saveBtn != null : "fx:id=\"saveBtn\" was not injected: check your FXML file 'cf1.fxml'.";
        assert toMMBtn != null : "fx:id=\"toMMBtn\" was not injected: check your FXML file 'cf1.fxml'.";

    }

}

