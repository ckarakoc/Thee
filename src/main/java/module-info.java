module nl.ckarakoc {
    requires javafx.controls;
    requires javafx.fxml;

    opens nl.ckarakoc to javafx.fxml;
    exports nl.ckarakoc;
}
