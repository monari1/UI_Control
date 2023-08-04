package com.example.ui_control;

import javafx.geometry.Insets;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class RadioButtonDemo extends CheckBoxDemo {

    @Override // Override the getPane() method in the super class
    public BorderPane getPane() {
        BorderPane pane = super.getPane();

        VBox paneForRadioButtons = new VBox(20);
        paneForRadioButtons.setPadding(new Insets(5,5,5,5));
        paneForRadioButtons.setStyle("-fx-border-width:10px; -fx-border-color:green");
        RadioButton rbRed = new RadioButton("Red");
        RadioButton rbBlue = new RadioButton("Blue");
        RadioButton rbGreen = new RadioButton("Green");


        paneForRadioButtons.getChildren().addAll(rbRed, rbBlue, rbGreen);
        pane.setLeft(paneForRadioButtons);

        ToggleGroup group = new ToggleGroup();
        rbRed.setToggleGroup(group);
        rbBlue.setToggleGroup(group);
        rbGreen.setToggleGroup(group);


        rbRed.setOnAction(e->{
            if (rbRed.isSelected()){
                text.setFill(Color.RED);
            }});
        rbBlue.setOnAction(e->{
            if (rbBlue.isSelected()){
                text.setFill(Color.BLUE);
            }
        });
        rbGreen.setOnAction(e->{
            if (rbGreen.isSelected()){
                text.setFill(Color.GREEN);
            }
        });

return pane;

    }

    public static void main(String[] args) {
        launch(args);
    }


}
