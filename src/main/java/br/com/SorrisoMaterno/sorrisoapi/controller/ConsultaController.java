package br.com.SorrisoMaterno.sorrisoapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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



   @PostMapping("/api/consulta/agendamento")
    public boolean criaCadastroMedico(@RequestBody Consulta novaConsulta) {
        System.out.println("Nova consulta agendada" + novaConsulta.getData());
        {
            if (novaConsulta.getData() != null) {
                //ConsultaDAO.getInstace.
                consultasDAO.create(novaConsulta);
                return true;

            }

            return false;
        }
    }

    @PutMapping("/api/consulta/atualizaConsulta")
    public Consulta endPoint(@RequestBody Consulta atualizaConsulta) {
        System.out.println("Consulta atualizada" + atualizaConsulta.getData());
        {
            if (atualizaConsulta.getData() != null){
                consultasDAO.update(atualizaConsulta);
            }
        return atualizaConsulta;
    }
    }
}

