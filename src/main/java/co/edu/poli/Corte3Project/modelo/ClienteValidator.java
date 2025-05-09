package co.edu.poli.Corte3Project.modelo;

public class ClienteValidator extends OrderValidator {
  @Override
  public boolean validate(Pedido pedido) {
    Cliente cliente = pedido.getCliente();
    if (cliente == null || !cliente.isActivo()) {
      message = "✖ Cliente no existe o no está activo";
      System.out.println("Error: Cliente no existe o no está activo");
      return false;
    }
    message = "✅ Cliente validado correctamente";
    return validateNext(pedido);
  }
}