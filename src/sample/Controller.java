package sample;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {
    StringBuilder builder = new StringBuilder();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button sendMessageButton;

    @FXML
    private TextField inputTextField;

    @FXML
    private TextArea outTextArea;


    @FXML
    void initialize() {
    }

    public void btnClicked(javafx.event.ActionEvent actionEvent) {
        sendMessageButton.setOnAction(event -> {
            if (inputTextField.getText().trim().length() == 0){
            } else {
                String text = inputTextField.getText();
                builder.append(text).append("\n");
                outTextArea.setText(builder.toString());
                outTextArea.setScrollTop(Double.MAX_VALUE);
                inputTextField.clear();
            }
        });
    }
}

