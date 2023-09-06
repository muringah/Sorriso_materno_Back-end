package br.com.SorrisoMaterno.sorrisoapi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.SorrisoMaterno.sorrisoapi.model.Paciente;

public class PacienteController {
    @PostMapping("/api/paciente/cadastro")
    public Paciente novoCadastro(@RequestBody Paciente paciente) {
        return paciente;
    }
}
