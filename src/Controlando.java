import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controlando {

    @FXML
    private Button botao;

    @FXML
    private TextField login;

    @FXML
    private TextField senha;

    @FXML
    void fazerLogin(ActionEvent event) {
        System.out.println("HELLO MY FRIENDUS");
    }

}
