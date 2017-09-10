package com.algaworks.brewer.service;

import com.algaworks.brewer.model.Usuario;
import com.algaworks.brewer.repository.Usuarios;
import com.algaworks.brewer.service.exception.EmailJaCadastradoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class CadastroUsuarioService {

    @Autowired
    private Usuarios usuarios;

    @Transactional
    public void salvar(Usuario usuario) {

        Optional<Usuario> emailExistente = usuarios.findByEmail(usuario.getEmail());
        if(emailExistente.isPresent()) {
            throw new EmailJaCadastradoException("E-mail já cadastrado");
        }
        usuarios.save(usuario);
    }
}
