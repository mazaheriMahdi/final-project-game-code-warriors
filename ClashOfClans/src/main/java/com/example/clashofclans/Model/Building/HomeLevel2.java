package com.example.clashofclans.Model.Building;

import com.example.clashofclans.HelloApplication;
import com.example.clashofclans.Model.Interfaces.IAnimated;
import com.example.clashofclans.Model.Interfaces.IDamageHandler;
import com.example.clashofclans.Model.Interfaces.IGameComponent;
import com.example.clashofclans.Values;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HomeLevel2 extends Building implements IDamageHandler {
    private ImageView imageView ;
    public HomeLevel2() {
        super(Values.HOME2_DAMAGE, Values.DefensiveType.NORMAL,Values.HOME2_SCORE);
        imageView = new ImageView(new Image(HelloApplication.class.getResource("Building/HomeLevel2.png").toString()));
    }
    public HomeLevel2(double size) {
        this();
        getImageView(size);
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
    public int getHitRange() {
        return 0;
    }

    @Override
    public void setAttackToDefaultAnimation(IGameComponent target) {

    }

    @Override
    public IDamageHandler getDamageHandler() {
        return this;
    }

    @Override
    public IAnimated getAnimHandler() {
        return null;
    }


}
