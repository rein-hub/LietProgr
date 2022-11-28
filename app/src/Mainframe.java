import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Mainframe {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button button;

    @FXML
    private PasswordField password;

    @FXML
    private TextField username;

    @FXML
    private Label wrongLogIn;

    @FXML
    void userLogIn(ActionEvent event) throws IOException {
        checkLogin();
    }

    @FXML
    void clearLabel(MouseEvent event) throws IOException{
        wrongLogIn.setText(" ");
    }

    private void checkLogin() throws IOException {
        App m = new App();
        if(username.getText().toString().equals("admin") && password.getText().toString().equals("123")){
            m.changeScene("afterLogin.fxml");
        }
        else if (username.getText().isEmpty() && password.getText().isEmpty()){
            wrongLogIn.setText("Please enter data.");
        }else{
            wrongLogIn.setText("Wrong username or password.");
        }
    }

    

    @FXML
    void initialize() {
        assert button != null : "fx:id=\"button\" was not injected: check your FXML file 'Mainframe.fxml'.";
        assert password != null : "fx:id=\"password\" was not injected: check your FXML file 'Mainframe.fxml'.";
        assert username != null : "fx:id=\"username\" was not injected: check your FXML file 'Mainframe.fxml'.";
        assert wrongLogIn != null : "fx:id=\"wrongLogIn\" was not injected: check your FXML file 'Mainframe.fxml'.";

    }

}
