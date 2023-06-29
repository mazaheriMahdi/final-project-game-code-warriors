package com.example.clashofclans.Model.Hero;

import com.example.clashofclans.HelloApplication;
import com.example.clashofclans.Values;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Knight extends Hero {
    private ImageView imageView = new ImageView();
    public Knight() {
        super(new Image(HelloApplication.class.getResource("Heroes/Knight/Knight_01__WALK_000.png").toString()),Values.KNIGHT_HEALTH, Values.KNIGHT_HIT,10, Values.KNIGHT_SPEED,Values.KNIGHT_HITRANGE);
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
