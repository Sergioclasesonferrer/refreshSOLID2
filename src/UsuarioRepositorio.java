import java.util.Set;

public class UsuarioRepositorio implements UsuarioPersistencia{
    private Set<Usuario> usuarios;

    @Override
    public boolean altaUsuario(Usuario usuario) {
        return usuarios.add(usuario);
    }

    @Override
    public boolean bajaUsuario(Usuario usuario) {
        return usuarios.remove(usuario);
    }
}
