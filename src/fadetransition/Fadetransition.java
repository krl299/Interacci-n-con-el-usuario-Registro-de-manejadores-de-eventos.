/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fadetransition;

import javafx.animation.FadeTransition; 
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Carlos
 */
public class Fadetransition extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Ellipse elipse=new Ellipse(70,55);
        FadeTransition ft=new FadeTransition(Duration.millis(400), elipse);
        
        ft.setFromValue(1.0);
        ft.setToValue(0.1);
        ft.setCycleCount(Timeline.INDEFINITE);
        ft.setAutoReverse(true);
        ft.play();
        
        elipse.setOnMousePressed(e->ft.pause());
        elipse.setOnMouseReleased(e->ft.play());
        elipse.setStroke(Color.BLACK);
        elipse.setFill(Color.RED);
        
        StackPane root = new StackPane();
        root.getChildren().add(elipse);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Fade Transition");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
