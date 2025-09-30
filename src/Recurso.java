public abstract class Recurso {
    private String titulo;
    private int anioPubli;

    public Recurso(String titulo, int anioPubli) {
        this.titulo = titulo;
        this.anioPubli = anioPubli;
    }

    @Override
    public String toString() {
        return "Recurso{" +
                "titulo='" + titulo + '\'' +
                ", anioPubli=" + anioPubli +
                '}';
    }
}
