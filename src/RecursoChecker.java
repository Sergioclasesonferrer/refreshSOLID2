import java.time.LocalDate;

public class RecursoChecker implements RecursoPersistenciaGet {
    RecursoRepositorio recursos;
    PrestamoRepositorio prestamos;

    public RecursoChecker(RecursoRepositorio recursos, PrestamoRepositorio prestamos) {
        this.recursos = recursos;
        this.prestamos = prestamos;
    }

    @Override
    public boolean comprobarDisponibilidad(Prestable recurso) {
        if (!contieneRecurso(recurso)) return false;
        if (!recurso.disponible(prestamos)) return false;
        return true;
    }

    @Override
    public boolean contieneRecurso(Prestable recurso) {
        return recursos.getRecursos().contains(recurso);
    }
}
