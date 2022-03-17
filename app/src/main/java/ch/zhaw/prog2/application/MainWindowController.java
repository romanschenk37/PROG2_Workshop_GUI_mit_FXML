package ch.zhaw.prog2.application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainWindowController {

	public void initialize(){
		connectProperties();
	}

	@FXML
	private Label labelTitel;

	@FXML
	private TextField textEingabe;

	@FXML
	private TextArea textHistory;

	@FXML
	void hinzufuegenText(ActionEvent event) {
		String text = textHistory.getText();
		text += textEingabe.getText() + "\n";
		textHistory.setText(text);
		textEingabe.clear();
	}

	@FXML
	void leerenTextEingabe(ActionEvent event) {
		textEingabe.clear();
	}



	void connectProperties() {
		// erste Möglichkeit
		labelTitel.textProperty().bind(textEingabe.textProperty());
	}

}
