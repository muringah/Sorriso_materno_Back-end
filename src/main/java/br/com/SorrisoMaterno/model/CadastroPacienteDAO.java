package br.com.SorrisoMaterno.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.SorrisoMaterno.repositories.PacienteRepository;

@Service
public class CadastroPacienteDAO {
     @Autowired
    PacienteRepository pacienteRepository;
    //private List<Paciente> pacientes;

    //public CadastroPacienteDAO() {
    //  pacientes = new ArrayList<>();
    //}



    //public void cadastrarPaciente(Paciente paciente) {
    //    pacientes.add(paciente);
    //}

    //public List<Paciente> listarPacientes() {
    //   return pacientes;
    //}

    //public void atualizarPaciente(Paciente paciente) {
    //    int index = pacientes.indexOf(paciente);
    //    if (index != -1) {
    //        pacientes.set(index, paciente);
     //   }
    //}
    public void create(Paciente novoPaciente) {
        pacienteRepository.save(novoPaciente);
    }

    public Paciente recuperarPaciente(String rg){
        return pacienteRepository.findByRg(rg);
    }
}
