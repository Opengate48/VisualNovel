package com.example.vn;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javax.sound.sampled.*;

import java.io.IOException;
import java.util.Objects;

public class VNApplication extends Application {
    static Stage currentStage;
    static String currentFxmlName;
    static int currentFrameNumber;
    @Override
    public void start(Stage stage) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        FXMLLoader fxmlLoader = new FXMLLoader(VNApplication.class.getResource("mm.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1021, 680);
        currentStage = new Stage();
        currentStage.setResizable(false);
        stage.setTitle("My VM");
        stage.setScene(scene);
        currentStage = stage;
        stage.show();
        AudioInputStream stream = AudioSystem.getAudioInputStream(
                Objects.requireNonNull(
                        VNApplication.class.getResource(
                                "sample-3s.wav"
                        )
                )
        );
        AudioFormat format = stream.getFormat();
        DataLine.Info info = new DataLine.Info(Clip.class, format);
        Clip clip = (Clip) AudioSystem.getLine(info);
        clip.open(stream);
        clip.loop(5);
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