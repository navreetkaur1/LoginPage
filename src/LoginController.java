
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {



        @FXML
        private TextField UserName;

        @FXML
        private TextField Password;

        @FXML
        private Button Submit;

        @FXML
        private Hyperlink link;

        @FXML
        void OnLogin(ActionEvent event) {

           if(Password.getLength() < 8){
               System.out.printf("Password must be 8 character long");
           }else {
               System.out.print(Password.getText());
           }

        }

        @FXML
        void Onclick(ActionEvent event) throws Exception {
            Stage secondaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("registration.fxml"));
            secondaryStage.setTitle("Register here");
            secondaryStage.setScene(new Scene(root));
            secondaryStage.show();






        }

    }

