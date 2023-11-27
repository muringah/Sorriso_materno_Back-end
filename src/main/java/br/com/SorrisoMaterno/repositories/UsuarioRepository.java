package br.com.SorrisoMaterno.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.SorrisoMaterno.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long>  {

    public Usuario findByUsername(String username);
    
    
}
