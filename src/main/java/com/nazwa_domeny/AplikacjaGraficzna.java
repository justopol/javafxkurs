package com.nazwa_domeny;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class AplikacjaGraficzna extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
       // stage(główne okno)-> scene(płótno, wyrysowujemy elementy)-> StackPane czyli root- poczatek, pierwszy  wyrysowany element-> Text musza byc powiazane w jakis sposob
        Text text = new Text("tekst z pierwszej aplikacji graficznej");

        StackPane stackPane = new StackPane();//root
        stackPane.getChildren().add(text);//dokladanei kolejnych elementów

        Scene scene = new Scene(stackPane);//płótno do rysowania obiektów
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}