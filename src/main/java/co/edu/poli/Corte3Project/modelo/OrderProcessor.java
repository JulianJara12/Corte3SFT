package co.edu.poli.Corte3Project.modelo;

public class OrderProcessor {
  private OrderValidator chain;
  private StockValidator stockValidator;
  private CreditLimitValidator creditValidator;
  private String message = "";

  public OrderProcessor() {
    // Construir la cadena de validación
    chain = new ClienteValidator();
    stockValidator = new StockValidator();
    creditValidator = new CreditLimitValidator();

    chain.setNext(stockValidator);
    stockValidator.setNext(creditValidator);
  }

  public boolean procesarPedido(Pedido pedido) {
    message = chain.getMessage() + "\n" + stockValidator.getMessage() + "\n" + creditValidator.getMessage();
    if (chain.validate(pedido)) {
      System.out.println("Pedido validado correctamente");
      // Aquí iría la lógica de procesamiento del pedido
      return true;
    }
    return false;
  }

  public String getMessage() {
    return message;
  }
}
