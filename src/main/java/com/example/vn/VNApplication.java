package com.example.vn;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VNApplication extends Application {
    static Stage currentStage;
    static String currentFxmlName;
    static int currentFrameNumber;
    static List<String> frameChain = new ArrayList<>();
    static int curFrameChaneIdx;
    private static MediaPlayer mediaPlayer;
    static void chooseMusic(String filename) {
        File file = new File("src/main/resources/music/" + filename);
        if(file != null){
            String selectedFile = file.toURI().toString();
            Media media = new Media(selectedFile);
            mediaPlayer = new MediaPlayer(media);
            mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
        }
    }
    static void stopMusic() {
        mediaPlayer.stop();
    }
    static void playMusic() {
        mediaPlayer.play();
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(VNApplication.class.getResource("mm.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1021, 680);
        currentStage = new Stage();
        currentStage.setResizable(false);
        stage.setTitle("My VM");
        stage.setScene(scene);
        currentStage = stage;
        stage.show();
        chooseMusic("mm_msc.mp3");
        playMusic();
        curFrameChaneIdx = 0;
    }

    public static void changeScene(String source) throws IOException {
        currentFxmlName = source;
        //currentFrameNumber = Integer.parseInt(currentFxmlName.substring(2, currentFxmlName.indexOf('_')));
        Parent root = FXMLLoader.load(VNApplication.class.getResource(currentFxmlName));
        currentStage.setResizable(false);
        currentStage.setScene(new Scene(root, 1021, 680));
        currentStage.show();

        //FXMLLoader fxmlLoader = new FXMLLoader(VNApplication.class.getResource("hello-view.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 1021, 680);
        //currentStage.setTitle("My VM");
        //currentStage.setScene(scene);
        //currentStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}