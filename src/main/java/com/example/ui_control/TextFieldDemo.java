package com.example.ui_control;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TextFieldDemo extends ButtonDemo {
    @Override
    public BorderPane getPane(){
        BorderPane pane = super.getPane();
        BorderPane paneForTextField = new BorderPane();
        paneForTextField.setPadding(new Insets(5,5,5,5));
        paneForTextField.setStyle("-fx-border-color: green");
        paneForTextField.setLeft(new Label("Enter a new Message: "));

        TextField tf = new TextField();
        tf.setAlignment(Pos.BASELINE_CENTER);
        paneForTextField.setCenter(tf);

//        TextArea textArea = new TextArea();
//
//        textArea.setPrefRowCount(5);
//        textArea.setPrefColumnCount(20);
//        textArea.setFont(Font.font("Courier", 20));

//        ScrollPane scrollPane = new ScrollPane(textArea);
//        paneForTextField.setRight(textArea);


        pane.setTop(paneForTextField);



        tf.setOnAction(e->{text.setText(tf.getText());});
        return pane;


    }


    public static void main(String[] args) {
        launch(args);
    }


}
