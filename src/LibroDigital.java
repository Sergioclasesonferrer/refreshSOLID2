public class LibroDigital extends Libro implements Prestable{
    private String isbn;
    private boolean disponible;

    public LibroDigital(String titulo, int anioPubli, String autor, String isbn, boolean disponible) {
        super(titulo, anioPubli, autor);
        this.isbn = isbn;
        this.disponible = disponible;
    }

    @Override
    public double tarifaBase() {
        return 4.0;
    }

    @Override
    public boolean disponible(PrestamoRepositorio prestamoRepositorio) {
        return disponible;
    }

    @Override
    public String toString() {
        return "LibroDigital{" +
                "isbn='" + isbn + '\'' +
                ", disponible=" + disponible +
                "} " + super.toString();
    }
}
