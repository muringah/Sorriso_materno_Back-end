package br.com.SorrisoMaterno.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import br.com.SorrisoMaterno.security.service.MyUserDetailService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.requiresChannel((channel -> channel.anyRequest().requiresSecure())).csrf().disable() // Necessário para
                                                                                                  // permitir acesso ao
                                                                                                  // POST
                .httpBasic(Customizer.withDefaults())

                .authorizeHttpRequests(
                        authorize -> authorize.requestMatchers(HttpMethod.GET, "/api/consulta/{data}").permitAll()
                                .requestMatchers(HttpMethod.POST, "/api/medico/cadastro").permitAll()
                                .requestMatchers(HttpMethod.GET, "/api/medico/{crm}").permitAll()
                                .requestMatchers(HttpMethod.GET, "/api/consulta/{data}").permitAll()
                                .requestMatchers(HttpMethod.POST, "/api/paciente/cadastro").permitAll())
                .authorizeHttpRequests(
                        authorize -> authorize.requestMatchers(HttpMethod.POST, "/api/consulta/agendamento")
                                .authenticated()
                                .requestMatchers(HttpMethod.PUT, "/api/consulta/atualizar").authenticated()
                                .requestMatchers(HttpMethod.PUT, "/api/medico/cadastro").authenticated()
                                .requestMatchers(HttpMethod.DELETE, "/api/medico/remover/{crm}").authenticated());

        return http.build();
    }

    @Bean
    public UserDetailsService myUserDetailsService() {
        return new MyUserDetailService();

    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();

    }
}