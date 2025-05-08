package co.edu.poli.Corte3Project.controlador;

import java.util.ArrayList;
import java.util.List;

import co.edu.poli.Corte3Project.modelo.Cliente;
import co.edu.poli.Corte3Project.modelo.DescuentoFijo;
import co.edu.poli.Corte3Project.modelo.DescuentoPorcentaje;
import co.edu.poli.Corte3Project.modelo.DescuentoStrategy;
import co.edu.poli.Corte3Project.modelo.Producto;
import co.edu.poli.Corte3Project.modelo.SinDescuento;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class PedidoController extends ControladorBase{

	@FXML
    private ComboBox<Cliente> comboCliente;

    @FXML
    private ComboBox<Producto> comboProducto;

    @FXML
    private ListView<Producto> listaProductos;

    @FXML
    private ComboBox<DescuentoStrategy> comboDescuento;

    @FXML
    private Label labelTotal;

    private final List<Producto> productosPedido = new ArrayList<>();

    @FXML
    public void initialize() {
        // Cargar datos de prueba
        comboCliente.getItems().addAll(
                new Cliente(1, "Ana", "ana@mail.com"),
                new Cliente(2, "Luis", "luis@mail.com")
        );

        comboProducto.getItems().addAll(
                new Producto(1, "Mouse", 25000),
                new Producto(2, "Teclado", 40000),
                new Producto(3, "Pantalla", 150000)
        );

        comboDescuento.getItems().addAll(
                new SinDescuento(),
                new DescuentoFijo(),
                new DescuentoPorcentaje()
        );
        comboDescuento.getSelectionModel().selectFirst();
    }

    @FXML
    private void agregarProducto() {
        Producto producto = comboProducto.getValue();
        if (producto != null) {
            productosPedido.add(producto);
            listaProductos.getItems().add(producto);
        }
    }

    @FXML
    private void calcularTotal() {
        double total = productosPedido.stream()
                .mapToDouble(Producto::getPrecio)
                .sum();

        DescuentoStrategy estrategia = comboDescuento.getValue();
        if (estrategia != null) {
            total = estrategia.aplicarDescuento(total);
        }

        labelTotal.setText(String.format("$ %.2f", total));
    }
}
