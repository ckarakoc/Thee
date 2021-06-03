package nl.ckarakoc.thee.controllers;

import java.io.IOException;
import javafx.fxml.FXML;
import nl.ckarakoc.thee.App;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("/fxml/secondary");
    }
}
