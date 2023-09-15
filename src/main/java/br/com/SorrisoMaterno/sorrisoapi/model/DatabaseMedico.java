package br.com.SorrisoMaterno.sorrisoapi.model;

import java.util.ArrayList;

public class DatabaseMedico {
    private ArrayList<Medico> medico;

    public DatabaseMedico() {
        medico = new ArrayList<>();
    }

    public void init() {
        medico.add(new Medico("Jennifer fioravante", "123456", "11964017013"));
        medico.add(new Medico("Kayky", "123456", "1196321-8910"));

    }

    public void addDado(Medico novo) {
        medico.add(novo);
    }

    public ArrayList<Medico> recuperaDado() {
        return medico;
    }
}
