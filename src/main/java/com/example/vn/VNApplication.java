package com.example.vn;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class VNApplication extends Application {
    private static Stage currentStage;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(VNApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1021, 680);
        currentStage.setResizable(false);
        stage.setTitle("My VM");
        stage.setScene(scene);
        currentStage = stage;
        stage.show();
    }

    public static void changeScene(String source) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(VNApplication.class.getResource(source));
        stage.setTitle("My VN");
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