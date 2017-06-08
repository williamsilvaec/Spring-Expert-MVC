package com.algaworks.brewer.model;


import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Size;


/**
 * Created by william on 07/06/2017.
 */
@Data
public class Cerveja {

    @NotBlank
    private String sku;

    @NotBlank
    private String nome;

    @Size(min = 1, max = 50)
    private String descricao;

}
