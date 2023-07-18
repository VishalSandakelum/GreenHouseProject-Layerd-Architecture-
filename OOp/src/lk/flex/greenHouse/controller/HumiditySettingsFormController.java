package lk.flex.greenHouse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class HumiditySettingsFormController implements Initializable {
    public ScrollBar scrollbar;
    public AnchorPane humiditiysettingspane;
    public Pane scrollpane2;
    public Button buttton;
    public ToggleButton button;
    public Button humidifies;
    public Pane timetwopane;
    public Pane timefourpane;
    public Pane timethreepane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       // scrollbar.setStyle("-fx-background: transparent; -fx-background-color: transparent; ");



       }


    public void btnhumidityfiesonaction(ActionEvent actionEvent) {
        /*for(int i = sql;i < sql+1;i++){

        }*/

    }

    public void btntimetwopaneonaction(MouseEvent mouseEvent) {

    }
}
