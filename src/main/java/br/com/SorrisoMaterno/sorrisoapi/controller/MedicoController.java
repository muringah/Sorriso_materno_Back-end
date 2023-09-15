package br.com.SorrisoMaterno.sorrisoapi.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.SorrisoMaterno.sorrisoapi.model.Medico;
@RestController
public class MedicoController {
   @PostMapping("/api/medico/cadastro")
   public boolean criaCadastroMedico(@RequestBody Medico novoMedico){
    System.out.println("Cadastro do novo medico realizado com sucesso" + novoMedico.getCrm());{
    if(novoMedico.getCrm() != null){
        return true;

    }

        return false;
    }
  }

  @PutMapping("/api/medico/cadastro")
  public Medico endPoint(@RequestBody Medico atualizaCadastro ){
    return atualizaCadastro;
  }
}
