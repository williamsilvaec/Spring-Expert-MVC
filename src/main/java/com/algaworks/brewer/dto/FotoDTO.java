package com.algaworks.brewer.dto;

import lombok.Data;

@Data
public class FotoDTO {

    private String nome;
    private String contentType;

    public FotoDTO(String nomeFoto, String contentType) {
        this.nome = nomeFoto;
        this.contentType = contentType;
    }
}
