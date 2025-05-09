package co.edu.poli.Corte3Project.modelo;

public abstract class OrderValidator {
  protected OrderValidator nextValidator;
  protected String message = "";

  public void setNext(OrderValidator next) {
    this.nextValidator = next;
  }

  public abstract boolean validate(Pedido pedido);

  protected boolean validateNext(Pedido pedido) {
    if (nextValidator == null) {
      return true;
    }
    return nextValidator.validate(pedido);
  }

  public String getMessage() {
    return message;
  }
}
