package br.com.SorrisoMaterno.security.service;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import br.com.SorrisoMaterno.model.Usuario;

public class MyUserDetail implements UserDetails {

        private Usuario usuarioDoSitema;

        public MyUserDetail(Usuario usuario) {
                this.usuarioDoSitema = usuario;
        }

        @Override
        public String getPassword() {
                
                return this.usuarioDoSitema.getPassword();
        }

        @Override
        public String getUsername() {
                
                return this.usuarioDoSitema.getUsername();
        }

        @Override
        public Collection<? extends GrantedAuthority> getAuthorities() {
                return null;
        }

        @Override
        public boolean isAccountNonExpired() {
                return true;
        }

        @Override
        public boolean isAccountNonLocked() {
                return true;
        }

        @Override
        public boolean isCredentialsNonExpired() {
                return true;
        }

        @Override
        public boolean isEnabled() {
               return true;
        }
}
