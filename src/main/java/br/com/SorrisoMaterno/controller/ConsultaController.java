
package br.com.SorrisoMaterno.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.com.SorrisoMaterno.model.Consulta;
import br.com.SorrisoMaterno.model.ConsultasDAO;

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

    @PutMapping("/api/consulta/atualizar")
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
  
