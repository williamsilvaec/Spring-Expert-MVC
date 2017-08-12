package com.algaworks.brewer.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Data
@Entity
@Table(name = "estilo")
public class Estilo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    private String nome;

    @OneToMany(mappedBy = "estilo")
    private List<Cerveja> cervejas;

}
