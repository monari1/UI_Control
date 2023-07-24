package com.example.ui_control;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Objects;

public class ButtonBase extends Application {
    protected Text text = new Text(50, 50, "JavaFx Programming");
    public BorderPane getButton(){
        HBox paneForButtons = new HBox(20);
        Button btRight = new Button("Right", new ImageView(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/image/frank.jpeg")))));
        Button btLeft = new Button("Left", new ImageView(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/image/event2.jpg")))));

        paneForButtons.getChildren().addAll(btRight, btLeft);
        paneForButtons.setAlignment(Pos.CENTER);
        paneForButtons.setStyle("-fx-border-color:green");

        BorderPane pane = new BorderPane();
        pane.setBottom(paneForButtons);

        Pane paneForText = new Pane();
        paneForText.getChildren().add(text);


        btLeft.setOnAction(e->text.setX(text.getX()-10));
        btRight.setOnAction(e->text.setX(text.getX()+10));
        return pane;

    }


    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(getButton(), 450, 200);
        primaryStage.setTitle("Button UI Control");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
