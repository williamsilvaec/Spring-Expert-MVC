package com.algaworks.brewer.model;

/**
 * Created by willi on 23/06/2017.
 */
public enum Origem {

    NACIONAL("Nacional"),
    INTERNACIONAL("Internacional");

    private String descricao;

    Origem(String descricao){
        this.descricao =  descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
