package com.algaworks.brewer.model;

import com.algaworks.brewer.model.validation.group.CnpjGroup;
import com.algaworks.brewer.model.validation.group.CpfGroup;
import lombok.Getter;

public enum TipoPessoa {

    FISICA("Física", "CPF", "000.000.000-00", CpfGroup.class) {
        @Override
        public String formatar(String cpfOuCnpj) {
            return cpfOuCnpj.replaceAll("(\\d{3})(\\d{3})(\\d{3})", "$1.$2.$3-");
        }
    },
    JURIDICA("Jurídica", "CNPJ", "00.000.000/0000-00", CnpjGroup.class) {
        @Override
        public String formatar(String cpfOuCnpj) {
            return cpfOuCnpj.replaceAll("(\\d{2})(\\d{3})(\\d{3})(\\d{4})", "$1.$2.$3/$4-");
        }
    };


    @Getter private String descricao;
    @Getter private String documento;
    @Getter private String mascara;
    @Getter private Class<?> grupo;

    TipoPessoa(String descricao, String documento, String mascara, Class<?> grupo) {
        this.descricao = descricao;
        this.documento =  documento;
        this.mascara = mascara;
        this.grupo = grupo;
    }

    public static String removerFormatacao(String cpfOuCnpj) {
        return cpfOuCnpj.replaceAll("\\.|-|/", "");
    }

    public abstract String formatar(String cpfOuCnpj);

}
