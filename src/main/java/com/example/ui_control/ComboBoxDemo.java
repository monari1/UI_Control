package com.example.ui_control;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.Objects;

public class ComboBoxDemo extends Application {
    private  String[] flagTitles = {"Doctor", "Me GodFather", "Event"};
    private ImageView[] flagImages = {
            new ImageView(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/image/images.jpeg")))),
            new ImageView(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/image/goodpic.jpg")))),
            new ImageView(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/image/event2.jpg")))),
    };
    private String[] flagDescription = new String[3];
    private final DescriptionPane descriptionPane = new DescriptionPane();
    private final ComboBox<String> cbo = new ComboBox<>();



    @Override
    public void start(Stage primaryStage) {

        flagDescription[0] = "this is an image of a doctor";
        flagDescription[1] = "this is an image of me in a cape";
        flagDescription[2] = "this is me in an event";

        setDisplay(0);

        BorderPane pane = new BorderPane();

        BorderPane paneForComboBox = new BorderPane();
        paneForComboBox.setLeft(new Label("Select an image you want to view"));
        paneForComboBox.setCenter(cbo);
        pane.setTop(paneForComboBox);
        cbo.setPrefWidth(400);
        cbo.setValue("Doctor");


        ObservableList<String> items = FXCollections.observableArrayList(flagTitles);
        cbo.getItems().addAll(items);
        pane.setCenter(descriptionPane);

        cbo.setOnAction(e -> setDisplay(items.indexOf(cbo.getValue())));

        Scene scene = new Scene(pane, 450, 170);
        primaryStage.setTitle("Combo Box Demo"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

    }
    public void setDisplay(int index){
        descriptionPane.setTitle(flagTitles[index]);
        descriptionPane.setImageView(flagImages[index]);
        descriptionPane.setDescription(flagDescription[index]);
    }
}
