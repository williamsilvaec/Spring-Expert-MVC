package com.algaworks.brewer.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


@Data
public class Estilo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    private String nome;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Estilo)) return false;
        if (!super.equals(o)) return false;

        Estilo estilo = (Estilo) o;

        return getCodigo() != null ? getCodigo().equals(estilo.getCodigo()) : estilo.getCodigo() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getCodigo() != null ? getCodigo().hashCode() : 0);
        return result;
    }
}
