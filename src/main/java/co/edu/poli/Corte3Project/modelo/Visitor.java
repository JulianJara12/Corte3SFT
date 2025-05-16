package co.edu.poli.Corte3Project.modelo;

public interface Visitor {
	void visit (Cliente cliente);
	void visit (Producto producto);
	void visit (Pedido pedido);
}
