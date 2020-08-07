package ru.eskendarov.trackerapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class App extends Application {

    private final String TITLE = "Tracker App";

    @Override
    public void start(Stage stage) {
        stage.setScene(new Scene(new BorderPane(), 600, 300));
        stage.setTitle(TITLE);
        stage.setResizable(false);
        stage.show();
    }
}