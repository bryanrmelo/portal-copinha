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

}
