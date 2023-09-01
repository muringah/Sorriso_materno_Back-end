package br.com.SorrisoMaterno.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.SorrisoMaterno.sorrisoapi.model.Paciente;

public class PacienteController {
    @GetMapping("/api/paciente/cadastro")
    public Paciente cadastraPaciente(){
        Paciente paciente= new Paciente();
        paciente.setNome("Jhennifer Ester");
        paciente.setDataNascimento("04/11/2005");
        paciente.setRg("111.111.111.222-45");
        paciente.setGestacoesAnteriores(0);
        paciente.setComplicacoes("Não");
        paciente.setEmail("jhejhedograu@gmail.com");
        paciente.setCpf("832.921.321.32");
        paciente.setTelefone("11-93213-3214");
        return paciente;
    }

}
