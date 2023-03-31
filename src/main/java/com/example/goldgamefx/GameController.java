package com.example.goldgamefx;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.fxml.*;
import javafx.scene.*;
import java.net.URL;
import java.security.Key;
import java.util.ResourceBundle;

public class GameController implements Initializable {

    @FXML
    private ImageView hero;
    private Image[] forwardArray = {new Image("C:\\Users\\ponteba\\Desktop\\mods\\fabric-example-mod-1.17\\GoldGameFX\\src\\main\\java\\com\\example\\goldgamefx\\graphics\\hero\\hero-forward1.png"),
            new Image("C:\\Users\\ponteba\\Desktop\\mods\\fabric-example-mod-1.17\\GoldGameFX\\src\\main\\java\\com\\example\\goldgamefx\\graphics\\hero\\hero-forward2.png"),
            new Image("C:\\Users\\ponteba\\Desktop\\mods\\fabric-example-mod-1.17\\GoldGameFX\\src\\main\\java\\com\\example\\goldgamefx\\graphics\\hero\\hero-forward3.png")};

    private Image[] backwardArray = {new Image("C:\\Users\\ponteba\\Desktop\\mods\\fabric-example-mod-1.17\\GoldGameFX\\src\\main\\java\\com\\example\\goldgamefx\\graphics\\hero\\hero-backward1.png"),
            new Image("C:\\Users\\ponteba\\Desktop\\mods\\fabric-example-mod-1.17\\GoldGameFX\\src\\main\\java\\com\\example\\goldgamefx\\graphics\\hero\\hero-backward2.png"),
            new Image("C:\\Users\\ponteba\\Desktop\\mods\\fabric-example-mod-1.17\\GoldGameFX\\src\\main\\java\\com\\example\\goldgamefx\\graphics\\hero\\hero-backward3.png")};

    private Image[] leftArray = {new Image("C:\\Users\\ponteba\\Desktop\\mods\\fabric-example-mod-1.17\\GoldGameFX\\src\\main\\java\\com\\example\\goldgamefx\\graphics\\hero\\hero-left1.png"),
            new Image("C:\\Users\\ponteba\\Desktop\\mods\\fabric-example-mod-1.17\\GoldGameFX\\src\\main\\java\\com\\example\\goldgamefx\\graphics\\hero\\hero-left2.png"),
            new Image("C:\\Users\\ponteba\\Desktop\\mods\\fabric-example-mod-1.17\\GoldGameFX\\src\\main\\java\\com\\example\\goldgamefx\\graphics\\hero\\hero-left3.png")};


    private int count = 0;


    //region Movement
    public void animatePlayer(Image[] list){
        hero.setImage(list[count]);
        count++;
        resetCount();
        try{
            Thread.sleep(100);
        }

        catch (Exception exception){
            System.out.println("fortnite");
        }
    }


    public void moveUp(){
        hero.setY(hero.getY() - 10);

        animatePlayer(forwardArray);
    }

    public void moveLeft(){
        hero.setX(hero.getX() - 10);
        hero.setScaleX(1);
        animatePlayer(leftArray);
    }

    public void moveDown(){
        hero.setY(hero.getY() + 10);

        animatePlayer(backwardArray);
    }

    public void moveRight(){
        hero.setX(hero.getX() + 10);
        hero.setScaleX(-1);
        animatePlayer(leftArray);
    }

    public void resetCount(){
        if (count > 2){
            count = 0;
        }
    }

    public void setIdle(){
        hero.setImage(forwardArray[0]);
    }
    //endregion

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

}

