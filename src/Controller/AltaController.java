package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button; 
import javafx.scene.control.DatePicker; 
import javafx.scene.control.TextField; 
import javafx.scene.control.Alert;

public class AltaController {
	
	@FXML 
	private TextField nombreCompleto; 

	@FXML 
	private TextField numeroSerie; 

	@FXML 
	private DatePicker fechaRecogida; 
		
	@FXML 
	private DatePicker fechaDevolucion; 
	
	@FXML 
	private TextField campoMensaje; 

	@FXML  
	private Button guardarButton; 

    @FXML
    private void handleButtonAction(ActionEvent event) {
    	
    	if (nombreCompleto.getText().isEmpty()
    			|| numeroSerie.getText().isEmpty()
    			|| fechaRecogida.getValue() == null
    			|| fechaDevolucion.getValue() == null) {
    		
    		campoMensaje.clear();
    		campoMensaje.setStyle("");
    		
    		Alert alerta = new Alert(Alert.AlertType.WARNING);
    		alerta.setTitle("Alquiler de patinetes");
    		alerta.setHeaderText("Campos incompletos");
    		alerta.setContentText("Debes completar todos los campos para guardar tu petición.");
    		
    		alerta.showAndWait();
    		
    		
    	} else {

    	campoMensaje.setText("Datos guardados correctamente");
    	campoMensaje.setStyle(
    			
    			"-fx-text-fill: #2E7D32;" +
    			"-fx-control-inner-background: #E8F5E9;" +
    	        "-fx-border-color: #A5D6A7;" +
    			"-fx-border-radius: 5;" +
    	        "-fx-background-radius: 5;" +
    			"-fx-font-weight: bold;"
    		);
    }
  }
}
