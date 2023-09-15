package br.com.SorrisoMaterno.sorrisoapi.model;

import java.util.ArrayList;

public class DatabaseConsulta {
    private ArrayList<Consulta> consultas;

    public DatabaseConsulta() {
    consultas = new ArrayList<>();
    }
    public void init(){
    consultas.add(new Consulta("10/09/2023",
    "12:00"));
    consultas.add(new Consulta("11/12/2023",
    "9:00"));
    consultas.add(new Consulta("26/06/2021",
    "15:00"));
    }
    public void addDado(Consulta novo){
    consultas.add(novo);
    }
    public ArrayList<Consulta> recuperaDado(){
    return consultas;
    }
}
