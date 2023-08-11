package com.example.ui_control;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.util.Objects;

public class TextAreaDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Declare and create a description pane
        DescriptionPane descriptionPane = new DescriptionPane();
// Set title, text, and image in the description pane
        descriptionPane.setTitle("Canada");
        String description = "The Canadian national flag ... ";
        descriptionPane.setImageView( new ImageView(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/image/images.jpeg")))));
        descriptionPane.setDescription(description);
// Create a scene and place it in the stage
        Scene scene = new Scene(descriptionPane, 450, 200);
        primaryStage.setTitle("TextAreaDemo"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage


    }
}
