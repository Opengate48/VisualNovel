package com.example.vn;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.robot.Robot;

import static com.example.vn.VNApplication.*;

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

    @FXML
    void nxt(ActionEvent event) throws IOException {
        if (curFrameChaneIdx < frameChain.size()){
            System.out.println(curFrameChaneIdx);
            curFrameChaneIdx += 1;
            changeScene(frameChain.get(curFrameChaneIdx - 1));
            System.out.println(curFrameChaneIdx);
            return;
        }
        System.out.println(curFrameChaneIdx);
        currentFrameNumber += 1;
        String postfix = currentFxmlName.substring(currentFxmlName.indexOf('_'));
        Integer currentFrameNumberInt = currentFrameNumber;
        VNApplication.changeScene("cf" + currentFrameNumberInt.toString() + postfix);

        frameChain.add("cf" + currentFrameNumberInt.toString() + postfix);
        curFrameChaneIdx += 1;
        System.out.println(curFrameChaneIdx);

    }
    @FXML
    void bck(ActionEvent event) throws IOException {
        if (curFrameChaneIdx < 2){
            return;
        }
        curFrameChaneIdx -= 1;
        System.out.println(curFrameChaneIdx);
        changeScene(frameChain.get(curFrameChaneIdx - 1));

    }
    @FXML
    void save(ActionEvent event) throws FileNotFoundException {
        File file = new File("src/main/resources/save/save.txt");
        if (file != null){
            System.out.println("Susu");
        }
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println(currentFxmlName);
        printWriter.print(currentFrameNumber);
        printWriter.close();
    }
    @FXML
    void toMM(ActionEvent event) throws IOException {
        stopMusic();
        VNApplication.changeScene("mm.fxml");
        chooseMusic("mm_msc.mp3");
        playMusic();
    }
}

