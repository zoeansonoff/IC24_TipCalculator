module edu.miracosta.cs112.ic24_tipcalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.miracosta.cs112.ic24_tipcalculator to javafx.fxml;
    exports edu.miracosta.cs112.ic24_tipcalculator;
}