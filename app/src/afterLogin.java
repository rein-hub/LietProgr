import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

public class afterLogin{

    public int roomCount;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button cust_btn;

    @FXML
    private DatePicker cust_from;

    @FXML
    private TextField cust_name;

    @FXML
    private TextField cust_numb;

    @FXML
    private TextField cust_room;

    @FXML
    private DatePicker cust_to;

    @FXML
    private Button logoutbtn;

    @FXML
    private Button room_btn;

    @FXML
    private TextField room_cap;

    @FXML
    private TextField room_name;

    @FXML
    private TextField room_numb;

    @FXML
    private TableView<room> table;

    @FXML
    private TableColumn<room, Integer> colCap;

    @FXML
    private TableColumn<room, String> colName;

    @FXML
    private TableColumn<room, Integer> colNum;

    @FXML
    private Text txt_avail;

    @FXML
    private Text txt_occu;

    @FXML
    private Text txt_rooms;

    @FXML
    void addCustomer(ActionEvent event) {
        popup("INFORMATION","Adding customers is not supported yet.");
    }

    @FXML
    void addRoom(ActionEvent event) {

        if(room_numb.getText().isEmpty() || room_cap.getText().isEmpty() || room_name.getText().isEmpty()){

            popup("ERROR","Input fields can't be empty.");

        }else{
            try{
                String roomName = room_name.getText();
                int roomNum = Integer.parseInt(room_numb.getText());
                int roomCap = Integer.parseInt(room_cap.getText());

                room room1 = new room(roomName, roomCap, roomNum);
                table.getItems().add(room1);

                room_name.setText("");
                popup("INFORMATION","Room added successfully!");
                roomCount++;
                updateText();
            }
            catch (NumberFormatException ex){
                ex.printStackTrace();
                popup("ERROR","Room number or cap is not a number.");
            }
        }
    }

    private void popup(String type,String message){
        if(type == "ERROR"){
            Alert alert = new Alert(AlertType.ERROR, message, ButtonType.OK);
            alert.setTitle("Room Manager");
            alert.showAndWait();
        }else if (type == "INFORMATION"){
            Alert alert = new Alert(AlertType.INFORMATION, message, ButtonType.OK);
            alert.setTitle("Room Manager");
            alert.showAndWait();
        }else{
            Alert alert = new Alert(AlertType.NONE, message, ButtonType.OK);
            alert.setTitle("Room Manager");
            alert.showAndWait();
        }
    }

    void updateText(){
        txt_avail.setText("Available: " + roomCount);
        txt_occu.setText("Occupied: 0");
        txt_rooms.setText("Room Count: " + roomCount);
    }

    @FXML
    void userlogout(ActionEvent event) throws IOException {
        App m = new App();
        m.changeScene("Mainframe.fxml");
    }

    @FXML
    void initialize() {
        assert cust_btn != null : "fx:id=\"cust_btn\" was not injected: check your FXML file 'afterLogin.fxml'.";
        assert cust_from != null : "fx:id=\"cust_from\" was not injected: check your FXML file 'afterLogin.fxml'.";
        assert cust_name != null : "fx:id=\"cust_name\" was not injected: check your FXML file 'afterLogin.fxml'.";
        assert cust_numb != null : "fx:id=\"cust_numb\" was not injected: check your FXML file 'afterLogin.fxml'.";
        assert cust_room != null : "fx:id=\"cust_room\" was not injected: check your FXML file 'afterLogin.fxml'.";
        assert cust_to != null : "fx:id=\"cust_to\" was not injected: check your FXML file 'afterLogin.fxml'.";
        assert logoutbtn != null : "fx:id=\"logoutbtn\" was not injected: check your FXML file 'afterLogin.fxml'.";
        assert room_btn != null : "fx:id=\"room_btn\" was not injected: check your FXML file 'afterLogin.fxml'.";
        assert room_cap != null : "fx:id=\"room_cap\" was not injected: check your FXML file 'afterLogin.fxml'.";
        assert room_name != null : "fx:id=\"room_name\" was not injected: check your FXML file 'afterLogin.fxml'.";
        assert room_numb != null : "fx:id=\"room_numb\" was not injected: check your FXML file 'afterLogin.fxml'.";

        colName.setCellValueFactory(new PropertyValueFactory<>("RoomName"));
        colCap.setCellValueFactory(new PropertyValueFactory<>("RoomCap"));
        colNum.setCellValueFactory(new PropertyValueFactory<>("RoomNum"));

    }

}
