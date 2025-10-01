import java.time.LocalDate;

public class LibroFisico extends Libro implements PrestableLimitado {
    private String isbn;
    private int ejemplares;

    public LibroFisico(String titulo, int anioPubli, String autor, String isbn, int ejemplares) {
        super(titulo, anioPubli, autor);
        this.isbn = isbn;
        this.ejemplares = ejemplares;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    @Override
    public double tarifaBase() {
        return 3.0;
    }

    @Override
    public boolean disponible(PrestamoRepositorio prestamoRepositorio) {
        int numRecNoDevueltos = 0;
        for (Prestamo prestamo : prestamoRepositorio.getPrestamos()) {
            if (prestamo.getFechaInicio().isBefore(LocalDate.now()) &&
                    prestamo.getFechaFin().isAfter(LocalDate.now()) &&
                    !prestamo.isDevuelto()) {
                numRecNoDevueltos++;
            }
        }
        if (numRecNoDevueltos >= this.getEjemplares()) return false;
        return true;
    }

    @Override
    public String toString() {
        return "LibroFisico{" +
                "isbn='" + isbn + '\'' +
                ", exemplars=" + ejemplares +
                "} " + super.toString();
    }
}
