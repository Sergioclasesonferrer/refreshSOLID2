import java.util.ArrayList;
import java.util.List;

public class PrestamoRepositorio implements PrestamoPersistencia{
    private List<Prestamo> prestamos;

    public PrestamoRepositorio() {
        this.prestamos = new ArrayList<>();
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
