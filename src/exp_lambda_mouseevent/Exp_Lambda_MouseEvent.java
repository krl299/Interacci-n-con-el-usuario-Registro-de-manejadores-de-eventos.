package exp_lambda_mouseevent;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


/**
 *
 * @author Carlos
 */
public class Exp_Lambda_MouseEvent extends Application {
    @Override
    public void start(Stage primaryStage) {
         
            
        Text texto = new Text(100,125,"Programming is fun");
        
        texto.setOnMouseDragged(e-> {
            texto.setX(e.getX());
            texto.setY(e.getY());
        });
        
        Pane root = new Pane();
        root.getChildren().add(texto);               
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Mover Texto Con Un Ratón");
    

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
