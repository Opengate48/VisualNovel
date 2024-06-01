package com.example.vn;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

import static com.example.vn.VNApplication.*;
import static com.example.vn.VNApplication.chooseMusic;



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
        curFrameChaneIdx = 0;
        currentFrameNumber = 1;
        frameChain = new ArrayList<>();
        VNApplication.changeScene("cf1_.fxml");
        chooseMusic("cf_msc.mp3");
        playMusic();
        frameChain.add("cf1_.fxml");
        System.out.println(frameChain.get(curFrameChaneIdx));
        curFrameChaneIdx += 1;
    }

    @FXML
    void toSaves(ActionEvent event) throws IOException {
        File file = new File("src/main/resources/save/save.txt");
        Scanner scanner = new Scanner(file);
        currentFxmlName = scanner.nextLine();
        currentFrameNumber = Integer.parseInt(scanner.nextLine());
        scanner.close();
        stopMusic();
        chooseMusic("cf_msc.mp3");
        playMusic();
        frameChain = new ArrayList<>();
        frameChain.add(currentFxmlName);
        curFrameChaneIdx = 1;
        System.out.println(currentFrameNumber);
        changeScene(currentFxmlName);
    }
}
