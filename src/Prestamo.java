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

    public void setRecurso(Prestable recurso) {
        this.recurso = recurso;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public boolean isDevuelto() {
        return devuelto;
    }

    public void setDevuelto(boolean devuelto) {
        this.devuelto = devuelto;
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
