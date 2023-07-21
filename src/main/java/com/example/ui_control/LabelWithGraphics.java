package com.example.ui_control;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class LabelWithGraphics extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        ImageView imageView;
        imageView = new ImageView(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/image/frank.jpeg"))));
        imageView.relocate(400, 200);
        Label lb1 = new Label("us states", imageView);
        lb1.setStyle("-fx-border-color: green; -fx-border-width:2");
        lb1.setContentDisplay(ContentDisplay.BOTTOM);
        lb1.setTextFill(Color.RED);

        Label lb2 = new Label("Circle", new Circle(50, 50, 32));
        lb2.setContentDisplay(ContentDisplay.TOP);

        Label lb3 = new Label("Rectangle", new Rectangle(10, 10, 50, 32));
        lb2.setContentDisplay(ContentDisplay.RIGHT);

        Ellipse ellipse = new Ellipse(50, 50, 50, 25);
        ellipse.setStroke(Color.GREEN);
        ellipse.setFill(Color.BLUE);
        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(ellipse, new Label("JavaFX"));
        Label lb4 = new Label("A pane inside a label", stackPane);
        lb4.setContentDisplay(ContentDisplay.LEFT);

        HBox pane = new HBox(20);
        pane.getChildren().addAll(lb1, lb2, lb3, lb4);

        Scene scene = new Scene(pane, 320, 240);
        stage.setTitle("Label with graphics");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}