package co.edu.poli.Corte3Project.modelo;

public class StockValidator extends OrderValidator {
  @Override
  public boolean validate(Pedido pedido) {
    for (Producto producto : pedido.getProductos()) {
      if (producto.getStock() <= 0) {
        message = "✖ Producto " + producto.getDescripcion() + " sin stock";
        System.out.println("Error: Producto " + producto.getDescripcion() + " sin stock");
        return false;
      }
    }
    message = "✅ Stock validado correctamente";
    return validateNext(pedido);
  }
}
