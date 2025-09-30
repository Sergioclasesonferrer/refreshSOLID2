public class Revista extends Recurso{
    private String issn;
    private int numero;

    public Revista(String titulo, int anioPubli, String issn, int numero) {
        super(titulo, anioPubli);
        this.issn = issn;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "issn='" + issn + '\'' +
                ", numero=" + numero +
                "} " + super.toString();
    }
}
