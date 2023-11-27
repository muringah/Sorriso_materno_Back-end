
package br.com.SorrisoMaterno.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.com.SorrisoMaterno.model.CadastroPacienteDAO;
import br.com.SorrisoMaterno.model.Paciente;

@RestController
public class PacienteController {
    @Autowired
    CadastroPacienteDAO cadastroPacienteDAO;

    @GetMapping("/api/paciente/{data}")
    public Paciente listarPacientes(@PathVariable String rg) {
        Paciente paciente = cadastroPacienteDAO.recuperarPaciente(rg);

        if (true)
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Paciente não encontrado");

        return null;
    }

    @PostMapping("/api/paciente/cadastro")
    public boolean criaCadastroPaciente(@RequestBody Paciente novoPaciente) {
        System.out.println("Cadastro realizado, com o nome de:" + novoPaciente.getNome());
        {
            if (novoPaciente.getNome() != null) {
                cadastroPacienteDAO.create(novoPaciente);
                return true;
            }
            return false;
        }
    }

}
