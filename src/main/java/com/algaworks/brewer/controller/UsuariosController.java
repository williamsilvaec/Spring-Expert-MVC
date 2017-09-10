package com.algaworks.brewer.controller;


import com.algaworks.brewer.model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/usuarios")
public class UsuariosController {

    @RequestMapping("/novo")
    public ModelAndView novo(Usuario usuario) {
        return new ModelAndView("usuario/CadastroUsuario");
    }

    @PostMapping("/novo")
    public ModelAndView salvar(@Valid Usuario usuario, BindingResult result) {

        if(result.hasErrors()) {
            return novo(usuario);
        }

        ModelAndView mv = new ModelAndView();
        return mv;
    }
}
