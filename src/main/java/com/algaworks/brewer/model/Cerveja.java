package com.algaworks.brewer.model;


/*import lombok.AllArgsConstructor;
import lombok.Builder;*/
import com.algaworks.brewer.validation.SKU;
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
@Table(name = "cerveja")
public class Cerveja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @SKU
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

}
