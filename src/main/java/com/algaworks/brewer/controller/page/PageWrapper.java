package com.algaworks.brewer.controller.page;

import org.springframework.data.domain.Page;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class PageWrapper<T> {

    private Page<T> page;
    private UriComponentsBuilder uriComponentsBuilder;

    public PageWrapper(Page<T> page, HttpServletRequest httpServletRequest) {
        this.page = page;
        this.uriComponentsBuilder = ServletUriComponentsBuilder.fromRequest(httpServletRequest);
    }

    public List<T> getConteudo() {
        return page.getContent();
    }

    public boolean isVazia() {
        return page.getContent().isEmpty();
    }

    public int getAtual() {
        return page.getNumber();
    }

    public boolean isPrimeira() {
        return page.isFirst();
    }

    public boolean isUltima() {
        return page.isLast();
    }

    public int getTotal() {
        return page.getTotalPages();
    }

    public String urlParaPagina(int pagina) {
        return uriComponentsBuilder.replaceQueryParam("page", pagina)
                .build(true).encode().toUriString();
    }
}


