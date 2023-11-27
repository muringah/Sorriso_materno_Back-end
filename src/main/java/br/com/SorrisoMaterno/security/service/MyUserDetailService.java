package br.com.SorrisoMaterno.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import br.com.SorrisoMaterno.model.Usuario;
import br.com.SorrisoMaterno.repositories.UsuarioRepository;

public class MyUserDetailService implements UserDetailsService {
    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       
        Usuario usuarioCredenciais = usuarioRepository.findByUsername(username);
        if (usuarioCredenciais == null)
            throw new UsernameNotFoundException(username);
        
        return new MyUserDetail(usuarioCredenciais);
    }
}
