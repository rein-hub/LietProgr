import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
 
public class App extends Application {

    private static Stage stg;

    Scene scene1, scene2;

    @Override
    public void start(Stage primaryStage) {

        stg = primaryStage;
        stg.setResizable(false);
        stg.setTitle("Hotel Database");

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Mainframe.fxml"));
            Parent root = (Parent) fxmlLoader.load();

            stg.setScene(new Scene(root));
            stg.show();


        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void changeScene(String fxml) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stg.getScene().setRoot(pane);
        
        if(fxml == "Mainframe.fxml"){
            stg.setResizable(false);
        }else{
            stg.setResizable(true);
        }
        
    }

 
 public static void main(String[] args) {
        launch(args);
    }
}