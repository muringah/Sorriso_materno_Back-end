package br.com.SorrisoMaterno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.com.SorrisoMaterno.model.Consulta;
import br.com.SorrisoMaterno.model.Medico;
import br.com.SorrisoMaterno.model.Paciente;
import br.com.SorrisoMaterno.repositories.ConsultaRepository;
import br.com.SorrisoMaterno.repositories.MedicoRepository;
import br.com.SorrisoMaterno.repositories.PacienteRepository;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    private ConsultaRepository consultaRepository;
    @Autowired
    private MedicoRepository medicoRepository;
    @Autowired
    private PacienteRepository pacienteRepository;

    // public DataLoader(ConsultaRepository consultaRepository) {
    // this.consultaRepository = consultaRepository;
    // }

    public void run(ApplicationArguments args) {
        consultaRepository.save(new Consulta("10/12/2023", "12:00"));
        medicoRepository.save(new Medico("Médico 1", "1234", "011 xxxx-xxxx", null, null));
        pacienteRepository.save(new Paciente("Jhennifer", "11 93213123", "Não", 1, "jhejhedograu@gmail.com",
                "04/11/2000", "13245654321", "321312324525", null, null));
        medicoRepository.save(new Medico("Médico 1", "4567", "011 xxxx-xxxx", null, null));
        pacienteRepository.save(new Paciente("Jhennifer", "11 93213123", "Não", 1, "jhejhedograu@gmail.com",
                "04/11/2000", "13245654321", "321312324525", null, null));
    }

    // public DataLoader(MedicoRepository medicoRepository) {
    // this.medicoRepository = medicoRepository;
    // }

    // @Autowired
    // public DataLoader (PacienteRepository pacienteRepository){
    // this.pacienteRepository = pacienteRepository;
    // }

}
