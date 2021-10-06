package br.com.cdf.core.session;

import br.com.cdf.core.model.Usuario;

public interface UsuarioSession {

	Usuario buscar(long id);

	void remover(Usuario usuario);

}
