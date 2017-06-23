package com.algaworks.brewer.model;


import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.math.BigDecimal;


/**
 * Created by william on 07/06/2017.
 */
@Data
@Entity
public class Cerveja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @NotBlank(message = "SKU é obrigatório")
    private String sku;

    @NotBlank(message = "Nome é obrigatório")
    private String nome;

    @Size(min = 1, max = 50, message = "O tamanho da descrição deve estar entre 1 e 50")
    private String descricao;

    private BigDecimal valor;

    @Column(name = "teor_alcoolico")
    private BigDecimal teorAlcoolico;

    private BigDecimal comissao;

    @Column(name = "quantidade_estoque")
    private Integer quantidadeEstoque;

    @Enumerated(EnumType.STRING)
    private Origem origem;

    @Enumerated(EnumType.STRING)
    private Sabor sabor;

    @ManyToOne
    @JoinColumn(name = "codigo_estilo")
    private Estilo estilo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cerveja)) return false;
        if (!super.equals(o)) return false;

        Cerveja cerveja = (Cerveja) o;

        return getCodigo().equals(cerveja.getCodigo());
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getCodigo().hashCode();
        return result;
    }
}
