package com.algaworks.brewer.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cliente")
@Data
@EqualsAndHashCode(of = {"codigo"})
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    private String nome;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_pessoa")
    private TipoPessoa tipoPessoa;

    @Column(name = "cpf_cnpj")
    private String cpfOuCnpj;

    private String telefone;

    private String email;

    @Embedded
    private Endereco endereco;
}
