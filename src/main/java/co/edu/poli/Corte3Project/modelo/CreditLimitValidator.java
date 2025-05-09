package co.edu.poli.Corte3Project.modelo;

public class CreditLimitValidator extends OrderValidator {
  @Override
  public boolean validate(Pedido pedido) {
    Cliente cliente = pedido.getCliente();
    if (pedido.calcularTotal() > cliente.getLimiteCredito()) {
      message = "✖ El pedido excede el límite de crédito del cliente";
      System.out.println("Error: El pedido excede el límite de crédito del cliente");
      return false;
    }
    message = "✅ Límite de crédito validado correctamente";
    return validateNext(pedido);
  }
}
