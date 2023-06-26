package com.example.clashofclans;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Image KNIGHT_0 = new Image(new FileInputStream("E:\\University\\java\\final-project-codewarriors\\ClashOfClans\\src\\main\\java\\com\\example\\clashofclans\\Knight_01__WALK_000.png"));
        Image KNIGHT_1 = new Image(new FileInputStream("E:\\University\\java\\final-project-codewarriors\\ClashOfClans\\src\\main\\resources\\Heroes\\Knight_01__WALK_001.png"));
        Image KNIGHT_2 = new Image("E:\\University\\java\\final-project-codewarriors\\ClashOfClans\\src\\main\\resources\\Heroes\\Knight_01__WALK_002.png");
        Image KNIGHT_3 = new Image("E:\\University\\java\\final-project-codewarriors\\ClashOfClans\\src\\main\\resources\\Heroes\\Knight_01__WALK_003.png");
        Image KNIGHT_4 = new Image("E:\\University\\java\\final-project-codewarriors\\ClashOfClans\\src\\main\\resources\\Heroes\\Knight_01__WALK_004.png");
        Image KNIGHT_5 = new Image("E:\\University\\java\\final-project-codewarriors\\ClashOfClans\\src\\main\\resources\\Heroes\\Knight_01__WALK_005.png");
        Image KNIGHT_6 = new Image("E:\\University\\java\\final-project-codewarriors\\ClashOfClans\\src\\main\\resources\\Heroes\\Knight_01__WALK_006.png");
        Image KNIGHT_7 = new Image("E:\\University\\java\\final-project-codewarriors\\ClashOfClans\\src\\main\\resources\\Heroes\\Knight_01__WALK_007.png");
        Image KNIGHT_8 = new Image("E:\\University\\java\\final-project-codewarriors\\ClashOfClans\\src\\main\\resources\\Heroes\\Knight_01__WALK_008.png");
        Image KNIGHT_9 = new Image("E:\\University\\java\\final-project-codewarriors\\ClashOfClans\\src\\main\\resources\\Heroes\\Knight_01__WALK_009.png");

        ImageView knight0 = new ImageView(KNIGHT_0);
        knight0.setFitWidth(300);
        knight0.setPreserveRatio(true);

        ImageView knight1 = new ImageView(KNIGHT_1);
        knight1.setFitWidth(300);
        knight1.setPreserveRatio(true);

        ImageView knight2 = new ImageView(KNIGHT_2);
        knight2.setFitWidth(300);
        knight2.setPreserveRatio(true);

        ImageView knight3 = new ImageView(KNIGHT_3);
        knight3.setFitWidth(300);
        knight3.setPreserveRatio(true);

        ImageView knight4 = new ImageView(KNIGHT_4);
        knight4.setFitWidth(300);
        knight4.setPreserveRatio(true);

        ImageView knight5 = new ImageView(KNIGHT_5);
        knight5.setFitWidth(300);
        knight5.setPreserveRatio(true);

        ImageView knight6 = new ImageView(KNIGHT_6);
        knight6.setFitWidth(300);
        knight6.setPreserveRatio(true);

        ImageView knight7 = new ImageView(KNIGHT_7);
        knight7.setFitWidth(300);
        knight7.setPreserveRatio(true);

        ImageView knight8 = new ImageView(KNIGHT_8);
        knight8.setFitWidth(300);
        knight8.setPreserveRatio(true);

        ImageView knight9 = new ImageView(KNIGHT_9);
        knight9.setFitWidth(300);
        knight9.setPreserveRatio(true);

        HBox root = new HBox(knight1);

        Timeline t = new Timeline();
        t.setCycleCount(Timeline.INDEFINITE);

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(200),
                (ActionEvent event) -> {
                    root.getChildren().setAll(knight1);
                }
        ));
        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(300),
                (ActionEvent event) -> {
                    root.getChildren().setAll(knight2);
                }
        ));
        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(400),
                (ActionEvent event) -> {
                    root.getChildren().setAll(knight3);
                }
        ));
        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(500),
                (ActionEvent event) -> {
                    root.getChildren().setAll(knight4);
                }
        ));
        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(600),
                (ActionEvent event) -> {
                    root.getChildren().setAll(knight5);
                }
        ));
        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(700),
                (ActionEvent event) -> {
                    root.getChildren().setAll(knight6);
                }
        ));
        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(800),
                (ActionEvent event) -> {
                    root.getChildren().setAll(knight7);
                }
        ));
        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(900),
                (ActionEvent event) -> {
                    root.getChildren().setAll(knight8);
                }
        ));
        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1000),
                (ActionEvent event) -> {
                    root.getChildren().setAll(knight9);
                }
        ));
        t.play();


        Scene scene = new Scene(root, 500, 500);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}