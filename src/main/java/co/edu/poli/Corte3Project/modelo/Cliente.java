package co.edu.poli.Corte3Project.modelo;

public class Cliente {
    private int id;
    private String nombre;
    private String email;
    private boolean isActivo;
    private double limiteCredito;

    public Cliente(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;

        this.isActivo = true;
        this.limiteCredito = 100000;
    }

    public String getNombre() {
        return nombre;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public boolean isActivo() {
        return isActivo;
    }

    public void setActivo(boolean activo) {
        this.isActivo = activo;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
