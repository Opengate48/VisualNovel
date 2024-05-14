package com.example.vn;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

import static com.example.vn.VNApplication.currentFrameNumber;
import static com.example.vn.VNApplication.currentFxmlName;

public class BranchController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button bckBtn;

    @FXML
    private ImageView cfbg;

    @FXML
    private Button firstOptBtn;

    @FXML
    private Button nxtBtn;

    @FXML
    private Button saveBtn;

    @FXML
    private Button secondOptBtn;

    @FXML
    private Button toMMBtn;

    @FXML
    void bck(ActionEvent event) {

    }

    @FXML
    void chooseOne(ActionEvent event) throws IOException {
        currentFrameNumber += 1;
        String postfix = new String();
        if (currentFxmlName.substring(currentFxmlName.indexOf('_'), currentFxmlName.indexOf('.')).length() == 1){
            postfix = "_1.fxml";
        }
        else{
            postfix = currentFxmlName.substring(currentFxmlName.indexOf('_'), currentFxmlName.indexOf('.')) + "_1.fxml";
        }
        Integer currentFrameNumberInt = currentFrameNumber;
        VNApplication.changeScene("cf" + currentFrameNumberInt.toString() + postfix);
        System.out.println(currentFrameNumber);
    }

    @FXML
    void chooseTwo(ActionEvent event) throws IOException {
        currentFrameNumber += 1;
        String postfix = new String();
        if (currentFxmlName.substring(currentFxmlName.indexOf('_'), currentFxmlName.indexOf('.')).length() == 1){
            postfix = "_2.fxml";
        }
        else{
            postfix = currentFxmlName.substring(currentFxmlName.indexOf('_'), currentFxmlName.indexOf('.')) + "_2.fxml";
        }
        Integer currentFrameNumberInt = currentFrameNumber;
        System.out.println("cf" + currentFrameNumberInt.toString() + postfix);
        VNApplication.changeScene("cf" + currentFrameNumberInt.toString() + postfix);

    }

    @FXML
    void nxt(ActionEvent event) {

    }

    @FXML
    void save(ActionEvent event) {

    }

    @FXML
    void toMM(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert bckBtn != null : "fx:id=\"bckBtn\" was not injected: check your FXML file 'cf3.fxml'.";
        assert cfbg != null : "fx:id=\"cfbg\" was not injected: check your FXML file 'cf3.fxml'.";
        assert firstOptBtn != null : "fx:id=\"firstOptBtn\" was not injected: check your FXML file 'cf3.fxml'.";
        assert nxtBtn != null : "fx:id=\"nxtBtn\" was not injected: check your FXML file 'cf3.fxml'.";
        assert saveBtn != null : "fx:id=\"saveBtn\" was not injected: check your FXML file 'cf3.fxml'.";
        assert secondOptBtn != null : "fx:id=\"secondOptBtn\" was not injected: check your FXML file 'cf3.fxml'.";
        assert toMMBtn != null : "fx:id=\"toMMBtn\" was not injected: check your FXML file 'cf3.fxml'.";

    }

}

