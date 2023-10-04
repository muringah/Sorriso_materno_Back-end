package br.com.SorrisoMaterno.sorrisoapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
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
    }
    

