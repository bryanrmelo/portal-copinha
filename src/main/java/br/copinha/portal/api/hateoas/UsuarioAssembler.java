package br.copinha.portal.api.hateoas;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.SimpleRepresentationModelAssembler;

import br.copinha.portal.entidades.Usuario;

public class UsuarioAssembler implements SimpleRepresentationModelAssembler<Usuario> {

    @Override
    public void addLinks(EntityModel<Usuario> resource) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void addLinks(CollectionModel<EntityModel<Usuario>> resources) {
        // TODO Auto-generated method stub
        
    }
    
}
