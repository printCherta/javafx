module dev.aldair {
    requires javafx.controls;
    requires javafx.fxml;

    opens dev.aldair to javafx.fxml;
    exports dev.aldair;
}
