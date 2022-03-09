package br.copinha.portal.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.copinha.portal.entidades.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
}
