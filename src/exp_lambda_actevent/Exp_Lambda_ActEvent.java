/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp_lambda_actevent;

import static java.lang.Math.pow;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Carlos
 */

public class Exp_Lambda_ActEvent extends Application {
    private String ent_text1;
    @Override
    public void start(Stage primaryStage){
        //Generamos los componentes de la ventana
        Label text1 = new Label("Anual Interest Rate: ");
        Label text2 = new Label("Number of Years: ");
        Label text3 = new Label("Loan Amount: ");
        Label text4 = new Label("Monthly Payment: ");
        Label text5 = new Label("Total Payment: ");
        TextField ent_text1 = new TextField();
        TextField ent_text2 = new TextField();
        TextField ent_text3 = new TextField();
        TextField ent_text4 = new TextField();
        TextField ent_text5 = new TextField();
        Button btn1 = new Button("Calculate");
        btn1.addEventHandler(EventType.ROOT, new EventHandler<Event>() {
            @Override
            public void handle(Event e) {
                try{
                    Double i = Double.parseDouble(ent_text1.getText());
                    Integer n = Integer.parseInt(ent_text2.getText());
                    Integer h = Integer.parseInt(ent_text3.getText());
                    Double r = i/(100*12);
                    Double m = (h*r)/(1-pow((1+r),(-12*n)));
                    Double t = m*12*n;
                    ent_text4.setText(m.toString());
                    ent_text5.setText(t.toString());
                }
                catch(NumberFormatException ax){ax.printStackTrace();}
            }
        });

        //Generamos un grid para estructurar la interfaz
        GridPane malla = new GridPane();
        malla.add(text1, 0,1);
        malla.add(text2, 0,2);
        malla.add(text3, 0,3);
        malla.add(text4, 0,4);
        malla.add(text5, 0,5);
        malla.add(ent_text1, 1,1);
        malla.add(ent_text2, 1,2);
        malla.add(ent_text3, 1,3);
        malla.add(ent_text4, 1,4);
        malla.add(ent_text5, 1,5);
        malla.add(btn1, 1,6);
        
        //
        
        //colocamos esto de forma centrada
        malla.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(malla, 250, 250);
        primaryStage.setTitle("Expresiones Lambda. ActionEvent");
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