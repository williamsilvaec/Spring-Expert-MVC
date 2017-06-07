package com.algaworks.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by willi on 06/06/2017.
 */

@Controller
public class CervejasController {

    @RequestMapping("/cervejas/novo")
    public String novo() {
        return "cerveja/CadastroCerveja";
    }
}
