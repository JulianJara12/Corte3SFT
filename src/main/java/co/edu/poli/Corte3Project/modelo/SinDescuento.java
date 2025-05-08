package co.edu.poli.Corte3Project.modelo;

public class SinDescuento implements DescuentoStrategy{

	@Override
	public double aplicarDescuento(double total) {
		// TODO Auto-generated method stub
		return total;
	}
	@Override
    public String toString() {
        return "Sin Descuento";
    }
}
