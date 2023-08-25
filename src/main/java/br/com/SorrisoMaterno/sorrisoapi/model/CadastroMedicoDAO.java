package br.com.SorrisoMaterno.sorrisoapi.model;

import java.util.ArrayList;
import java.util.List;


public class CadastroMedicoDAO {
     private List<Medico> medicos;

    public CadastroMedicoDAO() {
        medicos = new ArrayList<>();
    }

    public void cadastrarMedico(Medico medico) {
        medicos.add(medico);
    }

    public Medico buscarMedicoPorCRM(String crm) {
        for (Medico medico : medicos) {
            if (medico.getCrm().equals(crm)) {
                return medico;
            }
        }
        return null;
    }

    public List<Medico> listarMedicos() {
        return medicos;
    }

    public void atualizarMedico(Medico medico) {
        int index = medicos.indexOf(medico);
        if (index != -1) {
            medicos.set(index, medico);
        }
    }

    public void removerMedico(Medico medico) {
        medicos.remove(medico);
    }
}
 
