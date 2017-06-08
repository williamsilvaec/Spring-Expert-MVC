package com.algaworks.brewer.controller;

import com.algaworks.brewer.model.Cerveja;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by willi on 06/06/2017.
 */

@Controller
public class CervejasController {

    @RequestMapping("/cervejas/novo")
    public String novo() {
        return "cerveja/CadastroCerveja";
    }

    @RequestMapping(value = "/cervejas/novo", method = RequestMethod.POST)
    public String cadastrar(@Validated Cerveja cerveja, BindingResult result) {

        if (result.hasErrors()) {
            System.out.println(">>>> tem erro!");
        }

        System.out.println("sku >>>>>>" + cerveja.getSku());

        return "cerveja/CadastroCerveja";
    }
}
