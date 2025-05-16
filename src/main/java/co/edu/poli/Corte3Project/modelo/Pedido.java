package co.edu.poli.Corte3Project.modelo;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Visitable {

    private Cliente cliente;
    private List<Producto> productos;
    private DescuentoStrategy estrategiaDescuento;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    public Pedido(Cliente cliente, List<Producto> productos) {
        this.cliente = cliente;
        this.productos = productos;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void setEstrategiaDescuento(DescuentoStrategy estrategia) {
        this.estrategiaDescuento = estrategia;
    }

    public double calcularTotal() {
        double total = productos.stream().mapToDouble(Producto::getPrecio).sum();
        if (estrategiaDescuento != null) {
            return estrategiaDescuento.aplicarDescuento(total);
        }
        return total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        cliente.accept(visitor);
        for (Producto p : productos) {
            p.accept(visitor);
        }
    }
}
