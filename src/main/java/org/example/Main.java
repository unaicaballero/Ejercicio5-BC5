package org.example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        // Boton 1
        Button boton1 = new Button("Rojo");
        boton1.setPrefSize(120, 40);
        boton1.setStyle("-fx-background-color: red; -fx-text-fill: white;");

        // Boton 2
        Button boton2 = new Button("Azul");
        boton2.setPrefSize(150, 60);
        boton2.setStyle("-fx-background-color: blue; -fx-text-fill: white;");

        // Boton 3
        Button boton3 = new Button("Verde");
        boton3.setPrefSize(100, 50);
        boton3.setStyle("-fx-background-color: green; -fx-text-fill: white;");

        // HBox
        HBox hbox = new HBox(10);
        hbox.getChildren().addAll(boton1, boton2);
        hbox.setAlignment(Pos.CENTER);

        // VBox
        VBox vbox = new VBox(15);
        vbox.getChildren().addAll(hbox, boton3);
        vbox.setAlignment(Pos.CENTER);

        // Escena
        Scene scene = new Scene(vbox, 500, 300);

        // Ventana
        stage.setTitle("Ejercicio 5");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}