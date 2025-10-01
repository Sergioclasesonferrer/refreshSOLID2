import java.time.LocalDate;

public class RecursoChecker implements RecursoPersistenciaGet {
    RecursoRepositorio recursos;
    PrestamoRepositorio prestamos;

    public RecursoChecker(RecursoRepositorio recursos, PrestamoRepositorio prestamos) {
        this.recursos = recursos;
        this.prestamos = prestamos;
    }

    @Override
    public boolean contieneRecurso(Prestable recurso) {
        return recursos.getRecursos().contains(recurso);
    }
}
