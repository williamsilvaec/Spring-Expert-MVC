package com.algaworks.brewer.model;

import com.algaworks.brewer.model.validation.ClienteGroupSequenceProvider;
import com.algaworks.brewer.model.validation.group.CnpjGroup;
import com.algaworks.brewer.model.validation.group.CpfGroup;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;
import org.hibernate.validator.group.GroupSequenceProvider;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "cliente")
@GroupSequenceProvider(ClienteGroupSequenceProvider.class)
@Data
@EqualsAndHashCode(of = {"codigo"})
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @NotBlank(message = "Nome é obrigatório")
    private String nome;

    @NotNull(message = "Tipo pessoa é obrigatório")
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_pessoa")
    private TipoPessoa tipoPessoa;

    @NotBlank(message = "CPF/CNPJ é obrigatório")
    @CPF(groups = CpfGroup.class)
    @CNPJ(groups = CnpjGroup.class)
    @Column(name = "cpf_cnpj")
    private String cpfOuCnpj;

    private String telefone;

    @Email(message = "E-mail inválido")
    private String email;

    @Embedded
    private Endereco endereco;

    @PrePersist @PreUpdate
    private void prePersistPreUpdate() {
        this.cpfOuCnpj = TipoPessoa.removerFormatacao(this.cpfOuCnpj);
    }

    public String getCpfOuCnpjSemFormatacao() {
        return TipoPessoa.removerFormatacao(this.cpfOuCnpj);
    }
}
