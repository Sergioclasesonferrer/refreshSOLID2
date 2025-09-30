public class RecursoChecker implements RecursoPersistenciaGet {
    RecursoRepositorio recursos;

    public RecursoChecker(RecursoRepositorio recursos) {
        this.recursos = recursos;
    }

    @Override
    public boolean comprobarDisponibilidad(Recurso recurso) {
        int num = 0;

        return false;
    }

    @Override
    public boolean contieneRecurso(Recurso recurso) {
        return recursos.getRecursos().contains(recurso);
    }
}
