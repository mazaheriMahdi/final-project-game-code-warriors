package com.example.clashofclans.Model.Building;

import com.example.clashofclans.HelloApplication;
import com.example.clashofclans.Values;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Canon extends DefensiveBuilding {

    private ImageView imageView ;
    public Canon() {
        super(Values.CANON_DAMAGE, Values.CANON_HIT, Values.CANON_HITRANGE);
        imageView = new ImageView(new Image(HelloApplication.class.getResource("Building/Canon.png").toString()));
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
