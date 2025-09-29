import java.util.HashSet;
import java.util.Set;

public class UsuarioRepositorio implements UsuarioPersistencia{
    private Set<Usuario> usuarios;

    public UsuarioRepositorio() {
        this.usuarios = new HashSet<>();
    }

    @Override
    public boolean altaUsuario(Usuario usuario) {
        return usuarios.add(usuario);
    }

    @Override
    public boolean bajaUsuario(Usuario usuario) {
        return usuarios.remove(usuario);
    }
}
