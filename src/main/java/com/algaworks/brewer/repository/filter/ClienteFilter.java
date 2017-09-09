package com.algaworks.brewer.repository.filter;

import com.algaworks.brewer.model.TipoPessoa;
import lombok.Data;

@Data
public class ClienteFilter {

    private String nome;

    private String cpfOuCnpj;

    public Object getCpfOuCnpjSemFormatacao() {
        return TipoPessoa.removerFormatacao(this.cpfOuCnpj);
    }
}
