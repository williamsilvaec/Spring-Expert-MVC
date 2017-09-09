package com.algaworks.brewer.repository;

import com.algaworks.brewer.model.Cidade;
import com.algaworks.brewer.model.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface Cidades extends JpaRepository<Cidade, Long> {

    List<Cidade> findByEstadoCodigo(Long codigoEstado);

    public Optional<Cidade> findByNomeAndEstado(String nome, Estado estado);
}
