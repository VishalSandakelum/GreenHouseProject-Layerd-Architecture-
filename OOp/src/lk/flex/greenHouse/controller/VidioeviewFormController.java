package lk.flex.greenHouse.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class VidioeviewFormController {
    public ImageView img1;
    public ImageView image2;
    public Button button1;
    public Button button2;

    public void btnbutton1onaction(ActionEvent actionEvent) {
        image2.setVisible(true);
        img1.setVisible(false);
        System.out.println("dkdk");
    }

    public void btnbutton2onaction(ActionEvent actionEvent) {
        image2.setVisible(false);
        img1.setVisible(true);
        System.out.println("43ff");
    }
}
