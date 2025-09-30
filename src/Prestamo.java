import java.time.LocalDate;

public class Prestamo implements PrestamoCalcularPrecio{
    private Prestable recurso;
    private Usuario usuario;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private boolean devuelto;

    public Prestamo() {
    }

    public Prestable getRecurso() {
        return recurso;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public boolean isDevuelto() {
        return devuelto;
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
