package co.edu.poli.Corte3Project.modelo;

public class Producto {
    private int id;
    private String descripcion;
    private double precio;

    public Producto(int id, String descripcion, double precio) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return descripcion + " ($" + precio + ")";
    }
}

