module nl.ckarakoc {
    requires javafx.controls;
    requires javafx.fxml;

    opens nl.ckarakoc.thee to javafx.fxml;
    exports nl.ckarakoc.thee;
    exports nl.ckarakoc.thee.controllers;
    opens nl.ckarakoc.thee.controllers to javafx.fxml;
}
