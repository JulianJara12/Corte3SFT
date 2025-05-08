package co.edu.poli.Corte3Project.controlador;

import java.io.IOException;

import co.edu.poli.Corte3Project.MainView;

import javafx.stage.Stage;

public abstract class ControladorBase {
    protected Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void openMenu() throws IOException {
        MainView.loadScreenWithPath("pedido.fxml", "Menu");
    }
}
