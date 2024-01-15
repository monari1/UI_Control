package com.example.ui_control;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

public class ComboBoxDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        ComboBox<String> cbo = new ComboBox<>();
        cbo.getItems().addAll("item 1", "item2", "item3", "item4");
        cbo.setStyle("-fx-color: red");
        cbo.setValue("item1");

        // Create a scene and place it in the stage
        Scene scene = new Scene(cbo, 50, 20);
        primaryStage.setTitle("TextAreaDemo"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

    }
}
