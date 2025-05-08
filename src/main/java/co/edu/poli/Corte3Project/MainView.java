package co.edu.poli.Corte3Project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;

public class MainView extends Application {

    private static Stage appStage;

    @Override
    public void start(Stage stage) {
        appStage = stage;
        loadScreenWithPath("pedido.fxml", "Ventana de Pedido");
    }

    public static void main(String[] args) {
        launch();
    }

    public static void loadScreenWithPath(String path, String title) {
        try {
            FXMLLoader loader = new FXMLLoader(getResourceFor(path));
            AnchorPane root = loader.load();
            Scene scene = new Scene(root);
            appStage.setTitle(title);
            appStage.setScene(scene);
            appStage.show();
        } catch (Exception e) {
            e.printStackTrace(); // Aquí verás si no encuentra el archivo
        }
    }

    private static URL getResourceFor(String filename) {
        return MainView.class.getResource("/co/edu/poli/Corte3Project/" + filename);
    }
}
