package br.com.SorrisoMaterno.sorrisoapi.controller;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MedicoController {
    @DeleteMapping("/api/medico/remover/{crm}")
    public String endPoint5(@PathVariable("crm") Long crm) {
        if (crm == 123456)
            return "Remoção de informação com crm: " + crm + " realizada";
        else {
            return "O crm: " + crm + "não foi encontrado";
        }
    }

}


