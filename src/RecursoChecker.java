public class RecursoChecker implements RecursoPersistenciaGet{
    RecursoRepositorio recursos;

    public RecursoChecker(RecursoRepositorio recursos) {
        this.recursos = recursos;
    }

    @Override
    public boolean comprobarDisponibilidad(Recurso recurso) {
//        return recurso;
        return false; //BORRA ESTO
    }

    @Override
    public boolean contieneRecurso(Recurso recurso) {
        return recursos.getRecursos().contains(recurso);
    }
}
