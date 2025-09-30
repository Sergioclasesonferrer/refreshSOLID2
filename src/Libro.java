public abstract class Libro extends Recurso {
    private String autor;

    public Libro(String titulo, int anioPubli, String autor) {
        super(titulo, anioPubli);
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autor='" + autor + '\'' +
                "} " + super.toString();
    }
}
