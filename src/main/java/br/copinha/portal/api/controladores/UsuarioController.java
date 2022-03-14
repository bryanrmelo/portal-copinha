package br.copinha.portal.api.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.copinha.portal.api.hateoas.UsuarioAssembler;
import br.copinha.portal.entidades.Usuario;
import br.copinha.portal.servicos.UsuarioService;

@RestController
@RequestMapping("/api/usuario")
public  class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private UsuarioAssembler usuarioAssembler;

    @Autowired
    private PagedResourcesAssembler<Usuario> pagedResourcesAssembler;

    @GetMapping()
    public CollectionModel<EntityModel<Usuario>> getUsuario(@PageableDefault(sort = {"id"}, direction = Direction.ASC) Pageable paginacao) {

        Page<Usuario> usuarios = usuarioService.buscarTodos(paginacao);

        return pagedResourcesAssembler.toModel(usuarios, usuarioAssembler);

    }

}
