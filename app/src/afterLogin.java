import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class afterLogin {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button logoutbtn;

    @FXML
    void userlogout(ActionEvent event) throws IOException {
        App m = new App();
        m.changeScene("Mainframe.fxml");
    }



    @FXML
    void initialize() {
        assert logoutbtn != null : "fx:id=\"logoutbtn\" was not injected: check your FXML file 'afterLogin.fxml'.";

    }

}
