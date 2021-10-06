package br.com.cdf.core.ejb;

import javax.inject.Inject;
import br.com.cdf.core.session.UsuarioSession;
import br.com.cdf.core.jpa.EntityManagerExtended;
import br.com.cdf.core.model.Usuario;
import br.com.cdf.core.qualifier.DataRepository;

public class UsuarioSessionBean implements UsuarioSession {

	@Inject
	@DataRepository
	private EntityManagerExtended em;

	@Override
	public Usuario buscar(long id) {
		return em.findFirstWithNamedQuery(Usuario.TODOS_USUARIOS, Usuario.class);
	}

	@Override
	public void remover(Usuario usuario) {
		em.remove(usuario);
	}
}
