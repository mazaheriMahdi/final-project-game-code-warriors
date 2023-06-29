package com.example.clashofclans.Model.Building;

import com.example.clashofclans.HelloApplication;
import com.example.clashofclans.Values;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Barracks extends Building {
    ImageView imageView;

    public Barracks() {
        super(Values.BARRACKS_DAMAGE, Values.DefensiveType.NORMAL);
        imageView = new ImageView(new Image(HelloApplication.class.getResource("Building/Barracks").toString()));
    }

    @Override
    public ImageView getImageView(double size) {
        imageView.setFitWidth(size);
        imageView.setPreserveRatio(true);
        return imageView;
    }

    @Override
    public ImageView getImageView() {
        return imageView;
    }

    @Override
    public Insets getInsets() {
        return null;
    }
}
