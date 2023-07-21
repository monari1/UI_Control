package com.example.ui_control;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Samples extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new HBox(20);

        // Load the image using a try-catch block to handle potential exceptions
        try {
            Image image = new Image("frank.jpeg");
//            Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/image/frank.jpeg")));
            pane.getChildren().add(new ImageView(image));
        } catch (NullPointerException e) {
            System.err.println("Error: Unable to load the image. Make sure 'frank.jpeg' is in the correct location.");
            e.printStackTrace();
        }

        primaryStage.setScene(new Scene(pane, 400, 300));
        primaryStage.show();
    }
}
