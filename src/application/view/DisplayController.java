package application.view;

import application.controller.CaesarEncoder;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class DisplayController {

	@FXML
	private TextArea taEncode;
	
	@FXML private TextArea taDecode;
	
	@FXML
	public void encodeMessage(){
		String input = taEncode.getText();
		CaesarEncoder encoder = new CaesarEncoder();
		taDecode.setText(encoder.encodeMessage(input, 3));
	}
	
	@FXML
	public void decodeMessage(){
		String input = taDecode.getText();
		CaesarEncoder decoder = new CaesarEncoder();
		taEncode.setText(decoder.encodeMessage(input, -3));
	}
}
