package com.algaworks.brewer.repository.helper.cerveja;

import com.algaworks.brewer.model.Cerveja;
import com.algaworks.brewer.repository.filter.CervejaFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CervejasQueries {

    public Page<Cerveja> filtrar(CervejaFilter cervejaFilter, Pageable pageable);
}
