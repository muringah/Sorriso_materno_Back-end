package br.com.SorrisoMaterno.sorrisoapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.com.SorrisoMaterno.sorrisoapi.model.Medico;
import br.com.SorrisoMaterno.sorrisoapi.repositories.MedicoRepository;

@Component
public class DataLoader implements ApplicationRunner {

    private MedicoRepository medicoRepository;

    @Autowired
    public DataLoader(MedicoRepository medicoRepository) {
        this.medicoRepository = medicoRepository;
    }

    public void run(ApplicationArguments args) {
        medicoRepository.save(new Medico("Médico 1", "1234", "011 xxxx-xxxx"));
    }
}