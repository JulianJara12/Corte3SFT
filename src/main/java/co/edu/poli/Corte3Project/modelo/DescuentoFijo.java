package co.edu.poli.Corte3Project.modelo;

public class DescuentoFijo implements DescuentoStrategy{
	  @Override
	    public double aplicarDescuento(double total) {
	        return total - 5000;
	    }

	    @Override
	    public String toString() {
	        return "Descuento fijo de $5000";
	    }
}
