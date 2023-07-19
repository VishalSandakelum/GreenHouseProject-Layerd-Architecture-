package lk.flex.greenHouse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class LogoutFormController {
    public javafx.scene.control.Button logout;
    public javafx.scene.control.Button cancel;
    public void cancelOnAction(ActionEvent actionEvent) throws IOException {
        Parent fxmlLoader = FXMLLoader.load(getClass().getResource("/lk/flex/greenHouse/view/third_form.fxml"));
        Stage window = (Stage)cancel.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader));
    }

    public void logoutOnAction(ActionEvent actionEvent) throws IOException {
        Parent fxmlLoader = FXMLLoader.load(getClass().getResource("/lk/flex/greenHouse/view/login_form.fxml"));
        Stage window = (Stage)logout.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader));
    }
}
