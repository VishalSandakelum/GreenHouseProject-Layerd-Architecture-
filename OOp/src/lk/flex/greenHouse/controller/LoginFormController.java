package lk.flex.greenHouse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController  {

    public javafx.scene.control.Button Button;
    public javafx.scene.control.Button button2;
    public javafx.scene.control.Button Button1;
    @FXML
    private ImageView myimageview;
    @FXML
    private TextField txt1;
    @FXML
    private TextField txt11;
    @FXML
    private Text txtAddress;
    @FXML
    private Pane pane2;
    

    public void btnbutton2onaction(ActionEvent actionEvent) throws IOException {
        Parent fxmlLoader = FXMLLoader.load(getClass().getResource("/lk/flex/greenHouse/view/login_form.fxml"));
        Stage window = (Stage)Button1.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader));

    }


    public void btnButton1onaction(ActionEvent actionEvent) throws IOException {
        Parent fxmlLoader = FXMLLoader.load(getClass().getResource("/lk/flex/greenHouse/view/password_form.fxml"));
        Stage window = (Stage)Button1.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader));
    }
}
