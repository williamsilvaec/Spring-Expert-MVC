package com.algaworks.brewer.thymeleaf;

import java.util.HashSet;
import java.util.Set;

import com.algaworks.brewer.thymeleaf.processador.OrderElementTagProcessor;
import com.algaworks.brewer.thymeleaf.processador.PaginationElementTagProcessor;
import org.thymeleaf.dialect.AbstractProcessorDialect;
import org.thymeleaf.processor.IProcessor;
import org.thymeleaf.standard.StandardDialect;

import com.algaworks.brewer.thymeleaf.processador.ClassForErrorAttributeTagProcessor;
import com.algaworks.brewer.thymeleaf.processador.MessageElementTagProcessor;


public class BrewerDialect extends AbstractProcessorDialect {

    public BrewerDialect() {
        super("AlgaWorks Brewer", "brewer", StandardDialect.PROCESSOR_PRECEDENCE);
    }

    @Override
    public Set<IProcessor> getProcessors(String dialectPrefix) {
        final Set<IProcessor> processadores = new HashSet<>();
        processadores.add(new ClassForErrorAttributeTagProcessor(dialectPrefix));
        processadores.add(new MessageElementTagProcessor(dialectPrefix));
        processadores.add(new OrderElementTagProcessor(dialectPrefix));
        processadores.add(new PaginationElementTagProcessor(dialectPrefix));
        return processadores;
    }
}