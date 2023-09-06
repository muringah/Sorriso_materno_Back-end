package br.com.SorrisoMaterno.sorrisoapi.controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.SorrisoMaterno.sorrisoapi.model.Consulta;

public class ConsultaController {
    @PutMapping("/api/consulta/alterar/25/08/2023")
    public Consulta endPoint1 (@RequestBody Consulta consultaParaAtualizar) {
        return consultaParaAtualizar;
    }
    
}
