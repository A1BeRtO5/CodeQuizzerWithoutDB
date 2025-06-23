package com.example.codequizzer;

import java.net.URL;
import java.util.HashSet;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Set;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button allButton;

    @FXML
    private Button closeButton;

    @FXML
    private Button closeButton11;

    @FXML
    private TextField idTextField;

    @FXML
    private TextField idTextField1;

    @FXML
    private Label labelText1;

    @FXML
    private AnchorPane mainAnchor;

    @FXML
    private Button nextButton1;

    @FXML
    private Button searchButton, randomButton;

    @FXML
    private AnchorPane setingsAnchor;

    @FXML
    private Button setingsButton1;

    @FXML
    private Button testButton;

    @FXML
    private CheckBox randomCheck;
    @FXML
    private TextArea textArea;
    MyDB myDB = new MyDB();
    private static Set<Integer> usedNumbers = new HashSet<>();
    private static Random random = new Random();
    static int valueMin;
    static int valueMax;
    static int counter;
    static boolean randomChange = false;

    @FXML
    void allbuttonAction(ActionEvent event) {
        textArea.setText(myDB.returnMyDB());

    }

    @FXML
    void closeButtonAction(ActionEvent event) {
        Platform.exit();
    }
    @FXML
    void randomSearchButton(ActionEvent event) {//кнопка R - видає питання в рандомній послідовності
        randomChange = !randomChange; // Інверсія значення змінної randomChange
        System.out.println(randomChange);
    }

    @FXML
    void nextButtonAction(ActionEvent event) {
        if (randomChange == true) {
            labelText1.setText(myDB.returnID(randomizer(valueMax, valueMin)));
        } else {
            labelText1.setText(myDB.returnID(counter));
            counter++;
        }
    }

    @FXML
    void searchButtonAction(ActionEvent event) {
        valueMin = Integer.parseInt(idTextField.getText());
        valueMax = Integer.parseInt(idTextField1.getText());
        counter = valueMin;
        idTextField.setText("");
        idTextField1.setText("");
    }

    @FXML
    void setingsButtonAction(ActionEvent event) {
        setingsAnchor.setVisible(true);
        mainAnchor.setVisible(false);
    }

    @FXML
    void testButtonAction(ActionEvent event) {
        setingsAnchor.setVisible(false);
        mainAnchor.setVisible(true);
    }

    @FXML
    void initialize() {
        assert allButton != null : "fx:id=\"allButton\" was not injected: check your FXML file 'сodeQuizzerStart.fxml'.";
        assert closeButton != null : "fx:id=\"closeButton\" was not injected: check your FXML file 'сodeQuizzerStart.fxml'.";
        assert closeButton11 != null : "fx:id=\"closeButton11\" was not injected: check your FXML file 'сodeQuizzerStart.fxml'.";
        assert idTextField != null : "fx:id=\"idTextField\" was not injected: check your FXML file 'сodeQuizzerStart.fxml'.";
        assert idTextField1 != null : "fx:id=\"idTextField1\" was not injected: check your FXML file 'сodeQuizzerStart.fxml'.";
        assert labelText1 != null : "fx:id=\"labelText1\" was not injected: check your FXML file 'сodeQuizzerStart.fxml'.";
        assert mainAnchor != null : "fx:id=\"mainAnchor\" was not injected: check your FXML file 'сodeQuizzerStart.fxml'.";
        assert nextButton1 != null : "fx:id=\"nextButton1\" was not injected: check your FXML file 'сodeQuizzerStart.fxml'.";
        assert searchButton != null : "fx:id=\"searchButton\" was not injected: check your FXML file 'сodeQuizzerStart.fxml'.";
        assert setingsAnchor != null : "fx:id=\"setingsAnchor\" was not injected: check your FXML file 'сodeQuizzerStart.fxml'.";
        assert setingsButton1 != null : "fx:id=\"setingsButton1\" was not injected: check your FXML file 'сodeQuizzerStart.fxml'.";
        assert testButton != null : "fx:id=\"testButton\" was not injected: check your FXML file 'сodeQuizzerStart.fxml'.";
        assert textArea != null : "fx:id=\"textArea\" was not injected: check your FXML file 'сodeQuizzerStart.fxml'.";
        valueMin = 0;
        valueMax = myDB.programmDB.size();
        System.out.println(valueMax);

    }
    private int randomizer(int maxNumber, int min) {

        if (usedNumbers.size() >= maxNumber -min + 1) {
            usedNumbers.clear();
        }
        int randomNumber;
        do {
            randomNumber = random.nextInt(maxNumber);
            if (randomNumber == 0) {
                randomNumber = maxNumber;
            }
        } while (usedNumbers.contains(randomNumber));
        usedNumbers.add(randomNumber);
        return randomNumber;
    }

}
