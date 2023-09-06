package br.com.SorrisoMaterno.sorrisoapi.model;

import java.util.ArrayList;

public class DataBasePaciente {
    private ArrayList<Paciente> paciente;

    public DataBasePaciente() {
    paciente = new ArrayList<>();
    }
    public void init(){
    paciente.add(new Paciente("Jhennifer Ester", "17", "111.111.111.11", 0, "não", "jhennifer@gmail.com", "111.111.11", "123.321.432-12"));
    }
    public void addDado(Paciente novo){
    paciente.add(novo);
    }
    public ArrayList<Paciente> recuperaDado(){
    return paciente;
    
}
    
}
