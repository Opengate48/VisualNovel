package com.example.vn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

import static com.example.vn.VNApplication.*;
import static com.example.vn.VNApplication.playMusic;

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
    void bck(ActionEvent event) throws IOException {
        if (curFrameChaneIdx < 2){
            return;
        }
        curFrameChaneIdx -= 1;
        System.out.println(curFrameChaneIdx);
        changeScene(frameChain.get(curFrameChaneIdx - 1));
    }
    @FXML
    void chooseOne(ActionEvent event) throws IOException {
        if (curFrameChaneIdx < frameChain.size()){
            return;
        }
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
        frameChain.add("cf" + currentFrameNumberInt.toString() + postfix);
        curFrameChaneIdx += 1;
    }
    @FXML
    void chooseTwo(ActionEvent event) throws IOException {
        if (curFrameChaneIdx < frameChain.size()){
            return;
        }
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
        frameChain.add("cf" + currentFrameNumberInt.toString() + postfix);
        curFrameChaneIdx += 1;
    }
    @FXML
    void nxt(ActionEvent event) throws IOException {
        if (curFrameChaneIdx < frameChain.size()){
            curFrameChaneIdx += 1;
            changeScene(frameChain.get(curFrameChaneIdx - 1));
        }
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

