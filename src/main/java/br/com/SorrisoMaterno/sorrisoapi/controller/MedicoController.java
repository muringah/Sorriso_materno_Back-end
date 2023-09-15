package br.com.SorrisoMaterno.sorrisoapi.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.SorrisoMaterno.sorrisoapi.model.Medico;

@RestController
public class MedicoController {
    @PostMapping("/api/medico/cadastro")
    public boolean criaCadastroMedico(@RequestBody Medico novoMedico) {
        System.out.println("Cadastro do novo medico realizado com sucesso" + novoMedico.getCrm());
        {
            if (novoMedico.getCrm() != null) {
                return true;

            }

            return false;
        }
    }

    @PutMapping("/api/medico/cadastro")
    public Medico endPoint(@RequestBody Medico atualizaCadastro) {
        return atualizaCadastro;
    }

    @DeleteMapping("/api/medico/remover/{crm}")
    public String endPoint5(@PathVariable("crm") Long crm) {
        if (crm == 123456)
            return "Remoção de informação com crm: " + crm + " realizada";
        else {
            return "O crm: " + crm + "não foi encontrado";
        }
    }

    @GetMapping("/api/medico/{crm}")
    public ArrayList<Medico> listarMedico() {
        Medico medico1 = new Medico();
        medico1.setNome("Kayky");
        medico1.setCrm("123456");
        medico1.setTelefone("1196321-8910");

        ArrayList<Medico> Lista = new ArrayList<>();
        Lista.add(medico1);
        return Lista;

    }
}
