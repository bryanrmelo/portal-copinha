package br.com.cdf.core.enums;

public enum TipoUsuarioEnum {

	ADMINISTRADOR("A", "Administrador"), PADRAO("N", "Padrão");

	private String id;
	private String descricao;

	private TipoUsuarioEnum(String id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public String getId() {
		return id;
	}
}
