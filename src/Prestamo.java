import java.time.LocalDate;

public class Prestamo implements PrestamoCalcularPrecio{
    private Prestable recurso;
    private Usuario usuario;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private boolean devuelto;

    public Prestamo() {
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", devuelto=" + devuelto +
                '}';
    }

    @Override
    public double calcularPrecio() {
        return 5.0;
    }
}
