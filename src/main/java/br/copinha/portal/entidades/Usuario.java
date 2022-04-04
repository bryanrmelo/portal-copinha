package br.copinha.portal.entidades;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Usuario extends Entidade {
    
    @NotNull
    @Size(min = 3, max = 80)
    @Column(nullable = false, length = 80)
    private String login;

    @NotNull
    @Size(min = 8)
    @Column(nullable = false)
    private String senha;
}
