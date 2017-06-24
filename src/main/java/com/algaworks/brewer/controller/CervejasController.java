package com.algaworks.brewer.controller;

import com.algaworks.brewer.model.Cerveja;
import com.algaworks.brewer.repository.Cervejas;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Created by willi on 06/06/2017.
 */

@Controller
public class CervejasController {

    private static final Logger logger = LoggerFactory.getLogger(CervejasController.class);

    @Autowired
    private Cervejas cervejas;

    @RequestMapping("/cervejas/novo")
    public String novo(Cerveja cerveja) {
        logger.error("Aqui é um log nível error");
        logger.info("Aqui é um log nível info");

        cervejas.findAll();

        return "cerveja/CadastroCerveja";
    }

    @RequestMapping(value = "/cervejas/novo", method = RequestMethod.POST)
    public String cadastrar(@Validated Cerveja cerveja, BindingResult result, Model model, RedirectAttributes attributes) {

        if (result.hasErrors()) {
            model.addAttribute("mensagem", "Erro no formulário!");
            return novo(cerveja);
        }

        System.out.println("sku >>>>>>" + cerveja.getSku());
        System.out.println("nome >>>>>" + cerveja.getNome());
        attributes.addFlashAttribute("mensagem", "salvo com sucesso!");

        return "redirect:/cervejas/novo";
    }

    @RequestMapping(value = "/cadastro/novo")
    public String cadastro() {
        return "cerveja/cadastro-produto";
    }
}
