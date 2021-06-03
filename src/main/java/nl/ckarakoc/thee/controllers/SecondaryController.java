package nl.ckarakoc.thee.controllers;

import java.io.IOException;
import javafx.fxml.FXML;
import nl.ckarakoc.thee.App;

public class SecondaryController {
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("/fxml/primary");
    }
}