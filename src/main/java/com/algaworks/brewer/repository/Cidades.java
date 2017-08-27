package com.algaworks.brewer.repository;

import com.algaworks.brewer.model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Cidades extends JpaRepository<Cidade, Long> {

    List<Cidade> findByEstadoCodigo(Long codigoEstado);
}
