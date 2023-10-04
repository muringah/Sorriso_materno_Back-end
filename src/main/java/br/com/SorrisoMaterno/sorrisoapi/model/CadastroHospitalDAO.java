package br.com.SorrisoMaterno.sorrisoapi.model;

import java.util.ArrayList;
import java.util.List;

public class CadastroHospitalDAO {
    private List<Hospital> hospitals;

    public CadastroHospitalDAO() {
        hospitals = new ArrayList<>();
    }

    public void cadastrarHospital(Hospital hospital) {
        hospitals.add(hospital);
    }

    public Hospital buscarHospitalPorNome(String nome) {
        for (Hospital hospital : hospitals) {
            if (hospital.getNome().equals(nome)) {
                return hospital;
            }
        }
        return null;
    }

    public List<Hospital> listarHospitais() {
        return hospitals;
    }

    public void atualizarHospital(Hospital hospital) {
        int index = hospitals.indexOf(hospital);
        if (index != -1) {
            hospitals.set(index, hospital);
        }
    }

    public void removerHospital(Hospital hospital) {
        hospitals.remove(hospital);
    }
}

