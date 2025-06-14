package repository;

import model.Usuario;
import model.enums.TipoUsuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);
    List<Usuario> findByTipoUsuario(TipoUsuario tipoUsuario);
}