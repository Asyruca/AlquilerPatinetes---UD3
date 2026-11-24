package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class AltaController {

    @FXML
    private void handleButtonAction(ActionEvent event) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("Alquiler de Patinetes");
        alerta.setHeaderText(null);
        alerta.setContentText("Botón Guardar pulsado correctamente");
        alerta.showAndWait();
    }
}
