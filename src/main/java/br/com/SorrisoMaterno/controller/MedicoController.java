package br.com.SorrisoMaterno.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.SorrisoMaterno.model.CadastroMedicoDAO;

@RestController
public class MedicoController {


     @Autowired
    CadastroMedicoDAO medicoDAO;   

  
    

    @DeleteMapping("/api/medico/remover/{crm}")
    public String endPoint5(@PathVariable("crm") Long crm) {
        if (crm == 123456)
            return "Remoção de informação com crm: " + crm + " realizada";
        else {
            return "O crm: " + crm + "não foi encontrado";
 
   
}

    }
}
