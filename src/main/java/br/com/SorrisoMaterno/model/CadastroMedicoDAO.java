package br.com.SorrisoMaterno.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.SorrisoMaterno.repositories.MedicoRepository;

@Service
public class CadastroMedicoDAO {
    // private List<Medico> medicos;

    @Autowired
    MedicoRepository medicoRepo;

    // public CadastroMedicoDAO() {
    //     medicos = new ArrayList<>();
    // }

    // public void cadastrarMedico(Medico medico) {
    //     medicos.add(medico);
    // }

    public Medico buscarMedicoPorCRM(String crm) {
        // for (Medico medico : medicos) {
        //     if (medico.getCrm().equals(crm)) {
        //         return medico;
        //     }
        // }
        return null;
    }

    public List<Medico> listarMedicos() {
        // return medicos;
        return null;
    }

    public void listaMedicos(Medico listaMedico) {
        // medicoRepo.count(listaMedico);
    }

    public void atualizarMedico(Medico medico) {
        // int index = medicos.indexOf(medico);
        // if (index != -1) {
        //     medicos.set(index, medico);
        // }
    }

    public void delete(Long id) {
        medicoRepo.deleteById(id);
    }

    public Medico encontrarMedicoPorCRM(String crm) {
        return medicoRepo.findByCrm(crm);

    }


    public void create(Medico novoMedico){
        medicoRepo.save(novoMedico);
    }

    public void update(Medico atualizaMedico){
        medicoRepo.save(atualizaMedico);
    }

}

