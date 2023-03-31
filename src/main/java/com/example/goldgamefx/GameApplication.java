package com.example.goldgamefx;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class GameApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(GameApplication.class.getResource("start-menu.fxml"));
        Parent root = fxmlLoader.load();
        GameController controller = fxmlLoader.getController();

        Scene scene = new Scene(root);


        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                switch (keyEvent.getCode()){
                    case W:
                        controller.moveUp();
                        break;
                    case A:
                        controller.moveLeft();
                        break;
                    case S:
                        controller.moveDown();
                        break;
                    case D:
                        controller.moveRight();
                        break;
                }
            }
        });
        stage.setTitle("Gold Game");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}