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
        int numRecNoDevueltos = 0;
        if (!contieneRecurso(recurso)) return false;
        if (recurso instanceof LibroDigital) {
            return ((LibroDigital) recurso).isDisponible();
        }
        if (recurso instanceof LibroFisico) {
            for (Prestamo prestamo : prestamos.getPrestamos()){
                if(prestamo.getFechaInicio().isBefore(LocalDate.now()) &&
                prestamo.getFechaFin().isAfter(LocalDate.now()) &&
                !prestamo.isDevuelto() &&
                prestamo.getRecurso().equals(recurso)) {
                    numRecNoDevueltos++;
                }
            }
            if (numRecNoDevueltos >= ((LibroFisico)recurso).getEjemplares()) return false;
        }
        return true;
    }

    @Override
    public boolean contieneRecurso(Prestable recurso) {
        return recursos.getRecursos().contains(recurso);
    }
}
