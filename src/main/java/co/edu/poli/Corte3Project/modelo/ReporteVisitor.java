package co.edu.poli.Corte3Project.modelo;

public class ReporteVisitor implements Visitor {

    private StringBuilder reporte = new StringBuilder();

    public String getReporte() {
        return reporte.toString();
    }

    @Override
    public void visit(Cliente cliente) {
        reporte.append("Cliente: ").append(cliente.getNombre())
               .append(" | Crédito: $").append(cliente.getLimiteCredito()).append("\n");
    }

    @Override
    public void visit(Producto producto) {
        reporte.append("Producto: ").append(producto.getDescripcion())
               .append(" | Precio: $").append(producto.getPrecio())
               .append(" | Stock: ").append(producto.getStock()).append("\n");
    }

    @Override
    public void visit(Pedido pedido) {
        reporte.append("----- Pedido -----\n");
        reporte.append("Total: $").append(pedido.calcularTotal()).append("\n");
    }
}
