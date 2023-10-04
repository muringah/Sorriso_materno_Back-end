package br.com.SorrisoMaterno.sorrisoapi.model;

import java.util.ArrayList;

public class DataBasePaciente {
    private ArrayList<Paciente> paciente;

    public DataBasePaciente() {
        paciente = new ArrayList<>();
    }

    public void init() {
        paciente.add(new Paciente("Jhennifer", "04/05/2005", "111.111.111.11", 0, "jhejhedograu@gmail.com", "Não",
                "111.222.213-45", "11 93210-2134"));
    }

    public void addDado(Paciente novo) {
        paciente.add(novo);
    }

    public ArrayList<Paciente> recuperaDado() {
        return paciente;
    }
}
