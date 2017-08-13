package com.algaworks.brewer.repository;

import com.algaworks.brewer.model.Estilo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by william on 26/06/2017.
 */
@Repository
public interface Estilos extends JpaRepository<Estilo, Long>{

    public Optional<Estilo> findByNomeIgnoreCase(String nome);

}
