import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class RegistrationController {

    @FXML
    private TextField Name;

    @FXML
    private TextField password;

    @FXML
    private TextField ConfirmPassword;

    @FXML
    private Button Submit;

    @FXML
    void SubmitAction(ActionEvent event) {
        if(Name.getLength() <4 && password != ConfirmPassword){
            System.out.printf("opps! there is some Problem");
        }else{
        System.out.printf("hurry! you are Registered now");}

    }

}
