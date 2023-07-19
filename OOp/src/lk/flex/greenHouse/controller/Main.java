package lk.flex.greenHouse.controller;

import com.fazecast.jSerialComm.SerialPort;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Main extends Application {

    private static final int TIMEOUT_WRITE_BLOCKING = 2000;
    static String firstword;
    static String secondword ;
    static String thirdword ;


    @Override
    public void start(Stage primaryStage) throws Exception {
        URL resource = getClass().getResource("/lk/flex/greenHouse/view/login_form.fxml");
        //URL resource = getClass().getResource("vidioeview_form.fxml");
        Parent parent = FXMLLoader.load(resource);
        Scene scene = new Scene(parent);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Login Form");
        primaryStage.centerOnScreen();

        primaryStage.show();
//////////////////////////////////////////////////
        SerialPort sp =  SerialPort.getCommPort("COM4");
        sp.setComPortParameters(9600,8,1,0);
        sp.setComPortTimeouts(TIMEOUT_WRITE_BLOCKING,2000,0);

        if(sp.openPort()){
            System.out.println("open serial");

        }else{
            System.out.println("port not opened ");
            return;
        }
        InputStream inputStream = sp.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);


        BufferedReader reader = new BufferedReader(inputStreamReader);

       new Thread(() -> {
            while (true) {
                try {
                    String line = reader.readLine();

                    if (line != null) {
                        String humidityValue = line.substring(line.indexOf(":") + 1).trim();

                        String sentence = humidityValue;
                        String[] words = sentence.split("\\s+");
                         firstword = words[0];
                         secondword = words[1];
                         thirdword = words[2];
                        /*System.out.println(firstword);
                        System.out.println(secondword);
                        System.out.println(thirdword);
*/
                        ThirdFormController t1 = new ThirdFormController();
                        t1.setHumidity(firstword);

                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }).start();


    }


    public void getFstword(){
         String first = firstword;
        System.out.println(first);
    }



}
