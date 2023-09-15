package br.com.SorrisoMaterno.sorrisoapi.controller;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.SorrisoMaterno.sorrisoapi.model.Paciente;
import jakarta.annotation.PostConstruct;

@RestController
public class PacienteController {
    @GetMapping("/api/paciente/cadastro")
    public ArrayList<Paciente> listarPacientes(){
         Paciente paciente1 = new Paciente();
         paciente1.setNome("Jhennifer");
         paciente1.setDataNascimento("04/05/2005");
         paciente1.setRg("111.111.111.11");
         paciente1.setGestacoesAnteriores(0);
         paciente1.setEmail("JheJhedograu@gmail.com");
         paciente1.setComplicacoes("Não");
         paciente1.setCpf("111.222.213-45");
         paciente1.setTelefone("11 93210-2134");

         Paciente paciente2 = new Paciente();
         paciente2.setNome("Jhennifer");
         paciente2.setDataNascimento("04/05/2005");
         paciente2.setRg("111.111.111.11");
         paciente2.setGestacoesAnteriores(0);
         paciente2.setEmail("JheJhedograu@gmail.com");
         paciente2.setComplicacoes("Não");
         paciente2.setCpf("111.222.213-45");
         paciente2.setTelefone("11 93210-2134");

         ArrayList<Paciente> lista = new ArrayList<>();
         lista.add(paciente1);
         lista.add(paciente2);

         return lista;

       
    }


    

    @PostMapping("/api/paciente/cadastro")
    public boolean criaPaciente(@RequestBody Paciente novoPaciente){
        // Lógica de quando o dado chega aqui
        System.out.println("Cadastro realizado, com o nome de:"+ novoPaciente.getNome());
        if(novoPaciente.getNome() != null){
            return true;
        }
        return false;
    } 
}
