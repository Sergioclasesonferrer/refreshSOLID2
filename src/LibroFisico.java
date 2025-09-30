public class LibroFisico extends Libro implements Prestable{
    private String isbn;
    private int ejemplares;

    public LibroFisico(String titulo, int anioPubli, String autor, String isbn, int ejemplares) {
        super(titulo, anioPubli, autor);
        this.isbn = isbn;
        this.ejemplares = ejemplares;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    @Override
    public double tarifaBase() {
        return 3.0;
    }

    @Override
    public String toString() {
        return "LibroFisico{" +
                "isbn='" + isbn + '\'' +
                ", exemplars=" + ejemplares +
                "} " + super.toString();
    }
}
