package com.example.clashofclans.View;

import com.example.clashofclans.Values;
import com.example.clashofclans.Widgets.*;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.concurrent.atomic.AtomicBoolean;

public class GamePage {
    private static StackPane root = new StackPane();
    public static void show(Stage stage) {
        root.setPrefSize(1000, 600);

        ScrollPane scrollPane = new ScrollPane(Values.loggedInUser.getMap());
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollPane.setPannable(true);

        InGameMenu menu = new InGameMenu();
        menu.setTranslateX(10);
        menu.setTranslateY(50);

        MenuButton menuButton = new MenuButton(30);
        menuButton.setTranslateX(-470);
        menuButton.setTranslateY(-270);
        menuButton.setOnMouseClicked(event -> {
            menu.setVisible(!menu.isVisible());
        });

        SettingButton settingButton = new SettingButton(30);
        settingButton.setTranslateX(-435);
        settingButton.setTranslateY(-270);

        Board scoreBoard = new Board(100, 30, "Score: " + Values.loggedInUser.getScore());
        scoreBoard.setTranslateY(-270);
        scoreBoard.setTranslateX(440);

        HeroesList heroesList = new HeroesList();
        heroesList.setTranslateY(225);


        root.getChildren().addAll(Values.loggedInUser.getMap(), menuButton, menu, settingButton, scoreBoard, heroesList);
        stage.setScene(new Scene(root, 1000, 600));
    }

    public static void showHeroList() {
        (root.getChildren().get(root.getChildren().size() - 1)).setVisible(!root.getChildren().get(root.getChildren().size() - 1).isVisible());
    }
}

