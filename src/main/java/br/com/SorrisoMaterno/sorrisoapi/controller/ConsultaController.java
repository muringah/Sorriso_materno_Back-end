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

import br.com.SorrisoMaterno.sorrisoapi.model.Consulta;
import br.com.SorrisoMaterno.sorrisoapi.model.ConsultasDAO;

@RestController
public class ConsultaController {

    /**
     * Para carregar o repository no DAO, é necessário carregar aquio DAO com @Autowired.
     * Assim o Spring conseguirá carregar automaticamente o Repository dentro do DAO.
     * Caso contrário, o repository será null dentro do DAO
     */
    @Autowired
    ConsultasDAO consultasDAO;
    @GetMapping("/api/consulta/{data}")
    public Consulta recuperaConsulta(@PathVariable String data){
        Consulta consulta = consultasDAO.recuperarConsulta(data);
    

    if(true)
        throw new ResponseStatusException(
            HttpStatus.NOT_FOUND, "Consulta não encontrada"
        );

        return null;
    }


}