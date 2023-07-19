package lk.flex.greenHouse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;


public class ThirdFormController implements Initializable {
    public Text sunlightwhether;
    public ImageView raincloud;
    public ImageView sunlightnew;
    public Text humidity;
    public TextField humiditytext;
    public Text humidytext;
    public Text temper;
    public Text soiltext;

    private String humi;
    @FXML
    private Text year1;
    @FXML
    private Text datetext1;
    @FXML
    private Text timetext;
    private boolean bool = true;
    public String tme,date,year;
    public String nowwhether;
    public javafx.scene.control.Button homebtn;
    public javafx.scene.control.Button humiditybtn;
    public javafx.scene.control.Button tempeturebtn;
    public javafx.scene.control.Button watersuplybtn;
    public javafx.scene.control.Button sunlightbtn;
    public javafx.scene.control.Button settingbtn;
    public javafx.scene.control.Button employebtn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        new Thread() {
            public void run() {
                while(bool) {
                    try {
                        Thread.sleep(1000);
                    }catch(Exception e){}
                    Date currentDate = new Date();
                    SimpleDateFormat clockFormat = new SimpleDateFormat("h:mm a");
                    //System.out.println(clockFormat.format(currentDate));
                    tme = (clockFormat.format(currentDate));

                    SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE ");
                    date = (dateFormat.format(currentDate));

                    SimpleDateFormat yearFormat = new SimpleDateFormat("MMMM dd,yyyy");
                    year = (yearFormat.format(currentDate));

                    year1.setText(year);
                    datetext1.setText(date);
                    timetext.setText(tme);
                    humidytext.setText(Main.firstword+"%");
                    temper.setText(Main.secondword);
                    //soiltext.setText(lk.flex.greenHouse.controller.Main.thirdword+"%");
                    soiltext.setText(Math.abs(Integer.parseInt(Main.thirdword))+"%");

                }
            }
        }.start();

        new Thread() {
            public void run() {
                while(bool) {
                    try {
                        Thread.sleep(1000);
                    }catch(Exception e){}
                    nowwhether = sunlightwhether.getText();
                    if(nowwhether.equals("Mid")){
                        sunlightnew.setVisible(false);
                        raincloud.setVisible(true);
                    }else{
                        raincloud.setVisible(false);
                        sunlightnew.setVisible(true);
                    }
                }
            }
        }.start();
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
        Parent fxmlLoader = FXMLLoader.load(getClass().getResource("/lk/flex/greenHouse/view/logout_form.fxml"));
        Stage window = (Stage)employebtn.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader));
    }

    public void btnhumidtyonaction(MouseEvent mouseEvent) {

    }

    public void setHumidity(String h){

        humi = h;


    }
}
