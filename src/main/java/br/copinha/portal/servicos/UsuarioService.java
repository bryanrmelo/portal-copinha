package br.copinha.portal.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.copinha.portal.entidades.Usuario;
import br.copinha.portal.excecoes.UsuarioNaoEncontradoException;
import br.copinha.portal.repositorios.UsuarioRepository;

@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository usuarioRepo;

    public Page<Usuario> buscarTodos(Pageable paginacao) {
        return usuarioRepo.findAll(paginacao);
    }

    public Usuario buscarPorId(Long id) {
        Usuario usuarioEncontrado = usuarioRepo.findById(id).orElseThrow(() -> new UsuarioNaoEncontradoException(id));
        return usuarioEncontrado;
    }
}
