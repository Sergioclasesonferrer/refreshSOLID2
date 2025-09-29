import java.util.HashSet;
import java.util.Set;

public class RecursoRepositorio implements RecursoPersistencia{
    private Set<Recurso> recursos;

    public RecursoRepositorio() {
        this.recursos = new HashSet<>();
    }

    public Set<Recurso> getRecursos() {
        return recursos;
    }

    public void setRecursos(Set<Recurso> recursos) {
        this.recursos = recursos;
    }

    @Override
    public boolean altaRecurso(Recurso recurso) {
        return recursos.add(recurso);
    }

    @Override
    public boolean bajaRecurso(Recurso recurso) {
        return recursos.remove(recurso);
    }
}
