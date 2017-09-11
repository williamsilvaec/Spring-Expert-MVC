package com.algaworks.brewer.repository.helper.usuario;

import com.algaworks.brewer.model.Usuario;

import java.util.Optional;

public interface UsuariosQueries {

    Optional<Usuario> porEmailEAtivo(String email);
}
