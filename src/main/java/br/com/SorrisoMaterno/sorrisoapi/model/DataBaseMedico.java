package br.com.SorrisoMaterno.sorrisoapi.model;

import java.util.ArrayList;

public class DataBaseMedico {
    private ArrayList<Medico> medico;

    public DataBaseMedico() {
    medico = new ArrayList<>();
    }
    public void init(){
    medico.add(new Medico("Kayky"));
    }
    public void addDado(Medico novo){
    medico.add(novo);
    }
    public ArrayList<Medico> recuperaDado(){
    return medico;
    
}
    
}


