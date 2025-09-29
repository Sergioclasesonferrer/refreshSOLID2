public abstract class Recurso {
    private String titulo;
    private int anioPubli;



    @Override
    public String toString() {
        return "Recurso{" +
                "titulo='" + titulo + '\'' +
                ", anioPubli=" + anioPubli +
                '}';
    }
}
