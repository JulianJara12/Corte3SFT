package co.edu.poli.Corte3Project.modelo;

public class DescuentoPorcentaje implements DescuentoStrategy{
	
	  @Override
	    public double aplicarDescuento(double total) {
	        return total * 0.9; // 10% de descuento
	    }

	    @Override
	    public String toString() {
	        return "10% de descuento";
	    }
}
