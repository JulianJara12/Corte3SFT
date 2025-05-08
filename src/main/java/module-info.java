module co.edu.poli.Corte3Project {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.edu.poli.Corte3Project to javafx.graphics;
    opens co.edu.poli.Corte3Project.controlador to javafx.fxml; // <-- ESTA LÍNEA ES NECESARIA
}
