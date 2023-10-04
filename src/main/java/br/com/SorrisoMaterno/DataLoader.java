package br.com.SorrisoMaterno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.com.SorrisoMaterno.model.Paciente;
import br.com.SorrisoMaterno.repositories.PacienteRepository;

@Component
public class DataLoader implements ApplicationRunner {

    private PacienteRepository pacienteRepository;

    @Autowired
    public DataLoader (PacienteRepository pacienteRepository){
        this.pacienteRepository = pacienteRepository;
    }

    public void run (ApplicationArguments args){
        pacienteRepository.save(new Paciente("Jhennifer", "11 93213123", "Não", 1, "jhejhedograu@gmail.com", "04/11/2000", "13245654321", "321312324525"));
    }
    
}
