package com.algaworks.brewer.model;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import java.io.Serializable;

@Embeddable
@Data
public class Endereco implements Serializable {

    private String logradouro;

    private String numero;

    private String complemento;

    private String cep;

    @ManyToOne
    @JoinColumn(name = "codigo_cidade")
    private Cidade cidade;

    @Transient
    private Estado estado;

    public String getNomeCidadeSiglaEstado() {
        if (this.cidade != null) {
            return this.cidade.getNome() + "/" + this.cidade.getEstado().getSigla();
        }

        return null;
    }
}
