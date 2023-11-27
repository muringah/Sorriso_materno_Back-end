package br.com.SorrisoMaterno.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.SorrisoMaterno.model.Medico;
import br.com.SorrisoMaterno.model.Paciente;
import br.com.SorrisoMaterno.model.Usuario;
import br.com.SorrisoMaterno.repositories.MedicoRepository;
import br.com.SorrisoMaterno.repositories.PacienteRepository;
import br.com.SorrisoMaterno.repositories.UsuarioRepository;



public class LoginController {
    @Autowired
    UsuarioRepository usuarioRepositorio;
    @Autowired
    MedicoRepository medicoRepository;
    @Autowired
    PacienteRepository pacienteRepository;

    @GetMapping("api/login/{tipo}")
    public Usuario login(@RequestBody Usuario usuario, @PathVariable String usuarioTipo){
        Usuario result = usuarioRepositorio.findByUsername(usuario.getUsername());
        if(result != null ){
            Medico medico = medicoRepository.findById(result.getId()).get();
            if(medico != null) return medico;
            
            Paciente paciente = pacienteRepository.findById(result.getId()).get();
            return paciente;
        }

        return null;
    }
}


