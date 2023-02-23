package com.example.animation;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.event.ActionEvent;

import java.io.IOException;

public class HelloApplication extends Application {
   // final static javafx.scene.image.Image dog6 = new javafx.scene.image.Image(HelloApplication.class.getResource("6.jpg").toString());
   final static javafx.scene.image.Image dog6 = new javafx.scene.image.Image("file:/Users/danielelibrone/Desktop/java project/animation/src/main/resources/6.jpg");
   //final static javafx.scene.image.Image dog5 = new javafx.scene.image.Image(HelloApplication.class.getResource("5.jpeg").toString());
   final static javafx.scene.image.Image dog5 = new javafx.scene.image.Image("file:/Users/danielelibrone/Desktop/java project/animation/src/main/resources/5.jpg");
    //final static javafx.scene.image.Image dog4 = new javafx.scene.image.Image(HelloApplication.class.getResource("4.jpeg").toString());
    final static javafx.scene.image.Image dog4 = new javafx.scene.image.Image("file:/Users/danielelibrone/Desktop/java project/animation/src/main/resources/4.jpg");

    private Group dog;

    @Override
    public void start(Stage stage) throws IOException {
        final ImageView doggo6=new ImageView(dog6);
        final ImageView doggo5=new ImageView(dog5);
        final ImageView doggo4=new ImageView(dog4);
        dog=new Group(doggo6);

        dog.setTranslateX(-600);
        dog.setTranslateY(-300);

        Timeline t=new Timeline();
        t.setCycleCount(Animation.INDEFINITE);

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(100),
                (ActionEvent event)->{
                    dog.getChildren().setAll(doggo6);
                } )
        );

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(200),
                (ActionEvent event)->{
                    dog.getChildren().setAll(doggo5);
                } )
        );

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(300),
                (ActionEvent event)->{
                    dog.getChildren().setAll(doggo4);
                } )
        );
        t.play();
        stage.setScene(new Scene(dog,600,700));
        stage.show();
/*
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

 */
    }

    public static void main(String[] args) {
        launch();
    }
}