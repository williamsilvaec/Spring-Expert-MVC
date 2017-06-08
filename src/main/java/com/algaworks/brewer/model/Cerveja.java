package com.algaworks.brewer.model;


import org.hibernate.validator.constraints.NotBlank;


/**
 * Created by willi on 07/06/2017.
 */
public class Cerveja {

    @NotBlank
    private String sku;
    private String nome;

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
