package br.com.cdf.core.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "usuario")
@SequenceGenerator(name = "UsuarioSeq", sequenceName = "USUARIO_ID_SEQ", allocationSize = 1)
@NamedQueries({ @NamedQuery(name = Usuario.TODOS_USUARIOS, query = "select e from Usuario as e") })

public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String TODOS_USUARIOS = "todos.usuarios";

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "UsuarioSeq")
	@Column(name = "id", length = 19, nullable = false)
	private Integer id;

	@NotNull
	@Column(name = "login", nullable = false)
	private String login;

	@NotNull
	@Column(name = "senha", nullable = false)
	private String senha;

	@Column(name = "tipo")
	private String tipo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((senha == null) ? 0 : senha.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else
			if (!id.equals(other.id))
				return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else
			if (!login.equals(other.login))
				return false;
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else
			if (!senha.equals(other.senha))
				return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else
			if (!tipo.equals(other.tipo))
				return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usuario [login=" + login + ", senha=" + senha + ", tipo=" + tipo + "]";
	}

}
