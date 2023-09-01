package br.com.SorrisoMaterno.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class MedicoController {
    @DeleteMapping("/api/cadastro/medico/{crm}")
    public String deletarMedico(@PathVariable("crm") Long crm) {
        if (crm == 123456)
        return "Remoção de cadastro por crm" + crm + "realizada";
        else {
            return "Médico para crm" + crm + "não encontrado";
        }
}
}