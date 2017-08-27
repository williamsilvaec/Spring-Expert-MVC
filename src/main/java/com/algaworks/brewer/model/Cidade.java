package com.algaworks.brewer.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cidade")
@Data
@EqualsAndHashCode(of = {"codigo"})
public class Cidade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    private String nome;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "codigo_estado")
    @JsonIgnore
    private Estado estado;
}
