package com.example.clashofclans.Model.Building;

import com.example.clashofclans.HelloApplication;
import com.example.clashofclans.Values;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class HomeLevel3 extends Building {
    private ImageView imageView;

    public HomeLevel3() {
        super(Values.HOME3_DAMAGE, Values.DefensiveType.NORMAL);
        imageView = new ImageView(new Image(HelloApplication.class.getResource("Building/HomeLevel3.png").toString()));
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


}
