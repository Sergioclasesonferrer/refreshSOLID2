import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PrestamoRepositorio implements PrestamoPersistencia{
    private List<Prestamo> prestamos;

    public PrestamoRepositorio() {
        this.prestamos = new ArrayList<>();
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    @Override
    public boolean registrarPrestamo(Prestamo prestamo) {
        return this.prestamos.add(prestamo);
    }

    @Override
    public boolean cancelarPrestamo(Prestamo prestamo) {
        return this.prestamos.remove(prestamo);
    }
}
