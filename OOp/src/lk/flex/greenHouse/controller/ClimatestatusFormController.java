package lk.flex.greenHouse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class ClimatestatusFormController {
    public javafx.scene.control.Button homebtn;
    public javafx.scene.control.Button humiditybtn;
    public javafx.scene.control.Button tempeturebtn;
    public javafx.scene.control.Button watersuplybtn;
    public javafx.scene.control.Button sunlightbtn;
    public javafx.scene.control.Button settingbtn;
    public javafx.scene.control.Button employebtn;
    public void dalybtnOnAction(ActionEvent actionEvent) {
    }

    public void monthlybtnOnAction(ActionEvent actionEvent) {
    }

    public void weeklybtnOnAction(ActionEvent actionEvent) {
    }
    public void homebtnOnAction(ActionEvent actionEvent) throws IOException {
        Parent fxmlLoader = FXMLLoader.load(getClass().getResource("/lk/flex/greenHouse/view/third_form.fxml"));
        Stage window = (Stage)homebtn.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader));
    }
    public void humiditybtnOnAction(ActionEvent actionEvent) throws IOException {
        Parent fxmlLoader = FXMLLoader.load(getClass().getResource("/lk/flex/greenHouse/view/humidty_form.fxml"));
        Stage window = (Stage)humiditybtn.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader));
    }
    public void tempeturebtnOnAction(ActionEvent actionEvent) throws IOException {
        Parent fxmlLoader = FXMLLoader.load(getClass().getResource("/lk/flex/greenHouse/view/tempareture_form.fxml"));
        Stage window = (Stage)tempeturebtn.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader));
    }

    public void watersuplybtnOnAction(ActionEvent actionEvent) throws IOException {
        Parent fxmlLoader = FXMLLoader.load(getClass().getResource("/lk/flex/greenHouse/view/waterSpply_form.fxml"));
        Stage window = (Stage)watersuplybtn.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader));
    }

    public void sunlightbtnOnAction(ActionEvent actionEvent) throws IOException {
        Parent fxmlLoader = FXMLLoader.load(getClass().getResource("/lk/flex/greenHouse/view/climatestatus_form.fxml"));
        Stage window = (Stage)sunlightbtn.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader));
    }

    public void settingbtnOnAction(ActionEvent actionEvent) throws IOException {
        Parent fxmlLoader = FXMLLoader.load(getClass().getResource("/lk/flex/greenHouse/view/humidty_form.fxml"));
        Stage window = (Stage)settingbtn.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader));
    }

    public void employebtnOnAction(ActionEvent actionEvent) throws IOException {
        Parent fxmlLoader = FXMLLoader.load(getClass().getResource("/lk/flex/greenHouse/view/humidty_form.fxml"));
        Stage window = (Stage)employebtn.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader));
    }
}
