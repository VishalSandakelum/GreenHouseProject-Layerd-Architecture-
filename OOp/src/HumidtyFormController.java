import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HumidtyFormController implements Initializable {
    public javafx.scene.control.Button homebtn;
    public javafx.scene.control.Button tempeturebtn;
    public javafx.scene.control.Button watersuplybtn;
    public javafx.scene.control.Button sunlightbtn;
    public javafx.scene.control.Button settingbtn;
    public javafx.scene.control.Button employebtn;
    public Text humidityLvl;

    public void settingOnAction(ActionEvent actionEvent) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("humidity_settings_form.fxml"));
        Parent root1 = null;
        try {
            root1 = (Parent) fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }

    public void reportOnAction(ActionEvent actionEvent) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("humidity_status_form.fxml"));
        Parent root1 = null;
        try {
            root1 = (Parent) fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }

    public void homebtnOnAction(ActionEvent actionEvent) throws IOException {
        Parent fxmlLoader = FXMLLoader.load(getClass().getResource("third_form.fxml"));
        Stage window = (Stage)homebtn.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader));
    }

    public void tempeturebtnOnAction(ActionEvent actionEvent) throws IOException {
        Parent fxmlLoader = FXMLLoader.load(getClass().getResource("tempareture_form.fxml"));
        Stage window = (Stage)tempeturebtn.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader));
    }

    public void watersuplybtnOnAction(ActionEvent actionEvent) throws IOException {
        Parent fxmlLoader = FXMLLoader.load(getClass().getResource("waterSpply_form.fxml"));
        Stage window = (Stage)watersuplybtn.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader));
    }

    public void sunlightbtnOnAction(ActionEvent actionEvent) throws IOException {
        Parent fxmlLoader = FXMLLoader.load(getClass().getResource("climatestatus_form.fxml"));
        Stage window = (Stage)sunlightbtn.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader));
    }

    public void settingsOnAction(ActionEvent actionEvent) throws IOException {
        Parent fxmlLoader = FXMLLoader.load(getClass().getResource("humidty_form.fxml"));
        Stage window = (Stage)settingbtn.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader));
    }

    public void employebtnOnAction(ActionEvent actionEvent) throws IOException {
        Parent fxmlLoader = FXMLLoader.load(getClass().getResource("logout_form.fxml"));
        Stage window = (Stage)employebtn.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        humidityLvl.setText(Main.firstword+"%");
    }
}
