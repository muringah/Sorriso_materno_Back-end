package br.com.SorrisoMaterno.sorrisoapi.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.SorrisoMaterno.sorrisoapi.repositories.ConsultaRepository;

import br.com.SorrisoMaterno.sorrisoapi.repositories.MedicoRepository;

@Service
public class CadastroMedicoDAO {
    

    @Autowired
    MedicoRepository medicoRepo;

    

    public Medico encontrarMedicoPorCRM(String crm) {
        return medicoRepo.findByCrm(crm);

    }
}
