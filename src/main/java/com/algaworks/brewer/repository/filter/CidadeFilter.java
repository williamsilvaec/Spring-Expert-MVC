package com.algaworks.brewer.repository.filter;

import com.algaworks.brewer.model.Estado;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CidadeFilter {

    private String nome;

    private Estado estado;
}
