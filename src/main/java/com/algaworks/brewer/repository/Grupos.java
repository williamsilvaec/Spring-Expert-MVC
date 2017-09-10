package com.algaworks.brewer.repository;

import com.algaworks.brewer.model.Grupo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Grupos extends JpaRepository<Grupo, Long>{
}
