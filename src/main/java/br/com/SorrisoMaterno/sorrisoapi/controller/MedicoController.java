
package br.com.SorrisoMaterno.sorrisoapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.com.SorrisoMaterno.sorrisoapi.model.CadastroMedicoDAO;
import br.com.SorrisoMaterno.sorrisoapi.model.Medico;

@RestController
public class MedicoController {

    @Autowired
    CadastroMedicoDAO cadastroMedicoDao;

    @PostMapping("/api/medico/cadastro")
    public boolean criaCadastroMedico(@RequestBody Medico novoMedico){
        System.out.println("Novo medico cadastrado" + novoMedico.getCrm());
        {
            if (novoMedico.getCrm() != null){
                cadastroMedicoDao.create(novoMedico);
                return true;
            }

            return false;
        }
    }

    
    @PutMapping("/api/medico/cadastro")
    public Medico atualizaCadastro(@RequestBody Medico atualizaMedico){
        System.out.println("Medico atualizado" + atualizaMedico.getCrm());
        {
            if(atualizaMedico.getCrm() != null){
                cadastroMedicoDao.update(atualizaMedico);
            }
            return atualizaMedico;
        }
    }
    

    @GetMapping("/api/medico/{crm}")
    public Medico listarMedico(@PathVariable String crm) {
        // fazer a pesquisa com o DAO aqui 
        Medico medico = cadastroMedicoDao.encontrarMedicoPorCRM(crm);
       
       
        // verificar se o objeto foi retornado
        if(true)
            throw new ResponseStatusException(
                HttpStatus.NOT_FOUND, "Médico não encontrado not found"
            );
        return null;
    }
}
    
    


