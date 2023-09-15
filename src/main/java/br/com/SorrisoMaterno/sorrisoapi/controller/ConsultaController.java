package br.com.SorrisoMaterno.sorrisoapi.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.SorrisoMaterno.sorrisoapi.model.Consulta;
@RestController
public class ConsultaController {


    @PutMapping("/api/consulta/alterar")
    public Consulta endPoint1 (@RequestBody Consulta consultaParaAtualizar) {
        return consultaParaAtualizar;
    }

    @PostMapping("/api/consulta/agendamento")
    public boolean criaConsulta(@RequestBody Consulta novaConsulta){
        System.out.println("Nova consulta realizada com sucesso no dia:" + novaConsulta.getData());
        if(novaConsulta.getData() != null){
            return true;
        
        }
            return false;
    }
    
}
