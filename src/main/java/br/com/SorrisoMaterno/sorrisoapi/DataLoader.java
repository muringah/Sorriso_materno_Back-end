
package br.com.SorrisoMaterno.sorrisoapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.com.SorrisoMaterno.sorrisoapi.model.Consulta;
import br.com.SorrisoMaterno.sorrisoapi.model.Medico;
import br.com.SorrisoMaterno.sorrisoapi.repositories.ConsultaRepository;
import br.com.SorrisoMaterno.sorrisoapi.repositories.MedicoRepository;

@Component
public class DataLoader implements ApplicationRunner {

    private ConsultaRepository consultaRepository;
    private MedicoRepository medicoRepository;

    

    @Autowired
    public DataLoader(ConsultaRepository consultaRepository) {
        this.consultaRepository = consultaRepository;
    }

    public void run(ApplicationArguments args) {
        consultaRepository.save(new Consulta("10/12/2023", "12:00"));
        medicoRepository.save(new Medico("Médico 1", "1234", "011 xxxx-xxxx"));
    }


    @Autowired
    public DataLoader(MedicoRepository medicoRepository) {
        this.medicoRepository = medicoRepository;
    }

    
    }
