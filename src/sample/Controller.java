package sample;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {
    StringBuilder builder = new StringBuilder();

    @FXML
    public ScrollBar scroll;

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

