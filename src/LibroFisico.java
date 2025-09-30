public class LibroFisico extends Libro implements Prestable{
    private String isbn;
    private int exemplars;

    public LibroFisico(String titulo, int anioPubli, String autor, String isbn, int exemplars) {
        super(titulo, anioPubli, autor);
        this.isbn = isbn;
        this.exemplars = exemplars;
    }

    @Override
    public double tarifaBase() {
        return 3.0;
    }

    @Override
    public String toString() {
        return "LibroFisico{" +
                "isbn='" + isbn + '\'' +
                ", exemplars=" + exemplars +
                "} " + super.toString();
    }
}
