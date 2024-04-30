package edu.miracosta.cs112.ic24_tipcalculator;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {



    private TextField billAmountTF = new TextField();
    private Slider tipPercentSlider = new Slider(0, 30, 15);
    private TextField tipAmountTF = new TextField();
    private TextField totalAmountTF = new TextField();
    private Button clearButton = new Button("Clear");
    private Button calculateButton = new Button("Calculate");
    private Label tipPercentLabel = new Label("15%");
    @Override
    public void start(Stage stage) {
        GridPane pane = new GridPane();
        pane.add(new Label("Bill Amount:"), 0, 0);
        pane.add(tipPercentLabel, 0, 1);
        pane.add(new Label("Tip Amount:"), 0, 2);
        pane.add(new Label("Total Amount:"), 0, 3);

        pane.add(billAmountTF, 1, 0);
        pane.add(tipPercentSlider, 1, 1);
        pane.add(tipAmountTF, 1, 2);
        pane.add(totalAmountTF, 1, 3);

        HBox hBox = new HBox(clearButton, calculateButton);
        pane.add(hBox, 1, 4);

        pane.setAlignment(Pos.CENTER);
        pane.setHgap(5);
        pane.setVgap(5);

        hBox.setSpacing(5);
        hBox.setAlignment(Pos.CENTER_RIGHT);

        tipPercentSlider.setShowTickMarks(true);
        tipPercentSlider.setShowTickLabels(true);
        tipPercentSlider.setMajorTickUnit(5);
        tipPercentSlider.setSnapToTicks(true);

        tipAmountTF.setEditable(false);
        tipAmountTF.setMouseTransparent(true);
        tipAmountTF.setFocusTraversable(false);

        totalAmountTF.setFocusTraversable(false);
        totalAmountTF.setMouseTransparent(true);
        totalAmountTF.setDisable(true);

        clearButton.setOnAction(e -> clear());
        calculateButton.setOnAction(e -> calculate());


        Scene scene = new Scene(pane, 320, 240);
        stage.setTitle("Tip Calculator");
        stage.setScene(scene);
        stage.show();
    }
    private void calculate() {
        totalAmountTF.setText("TODO Thursday!!");
    }
    private void clear(){
        billAmountTF.clear();
        tipAmountTF.clear();
        totalAmountTF.clear();
        tipPercentSlider.setValue(15);
        tipPercentLabel.setText("15%");

        billAmountTF.requestFocus();
    }

    public static void main(String[] args) {
        launch();
    }
}
