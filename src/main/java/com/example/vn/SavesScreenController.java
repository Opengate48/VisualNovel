package com.example.vn;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import static com.example.vn.VNApplication.currentFxmlName;
import static com.example.vn.VNApplication.currentStage;

public class SavesScreenController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView mmbg;

    @FXML
    private Button toMMBtn;

    @FXML
    void toMM(ActionEvent event) throws IOException {
        VNApplication.changeScene("mm.fxml");
    }
    class loadBtnsEventHandler implements EventHandler<ActionEvent>{
        public void handle(ActionEvent event){

        }
    }

    @FXML
    void initialize() throws IOException {
        assert mmbg != null : "fx:id=\"mmbg\" was not injected: check your FXML file 'saves_screen.fxml'.";
        assert toMMBtn != null : "fx:id=\"toMMBtn\" was not injected: check your FXML file 'saves_screen.fxml'.";
        //currentStage
    }

}
