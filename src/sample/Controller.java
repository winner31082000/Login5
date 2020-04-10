package sample;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLOutput;

public class Controller {

    @FXML
    private TextField username;

    @FXML
    private Button login;

    @FXML
   public void Summit(ActionEvent event) throws IOException {
        Parent Menu = FXMLLoader.load(getClass().getResource("MainScreen.fxml"));
        Scene scene2 = new Scene(Menu);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setTitle("Menu");
        window.setScene(scene2);
        window.show();
    }
}
