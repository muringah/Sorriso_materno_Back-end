package br.com.SorrisoMaterno.sorrisoapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.com.SorrisoMaterno.sorrisoapi.model.Consulta;
import br.com.SorrisoMaterno.sorrisoapi.repositories.ConsultaRepository;

@Component
public class DataLoader implements ApplicationRunner {

    private ConsultaRepository consultaRepository;

    @Autowired
    public DataLoader(ConsultaRepository consultaRepository) {
        this.consultaRepository = consultaRepository;
    }

    public void run(ApplicationArguments args) {
        consultaRepository.save(new Consulta("10/12/2023", "12:00"));
    }
}