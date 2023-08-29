package br.com.SorrisoMaterno.sorrisoapi.model;

import java.util.ArrayList;

public class Database {
    private ArrayList<Consulta> consultas;

    public Database() {
    consultas = new ArrayList<>();
    }
    public void init(){
    consultas.add(new Consulta("Cad1",
    "End1"));
    consultas.add(new Consulta("Cad2",
    "End2"));
    consultas.add(new Consulta("Cad3",
    "End3"));
    }
    public void addDado(Consulta novo){
    consultas.add(novo);
    }
    public ArrayList<Consulta> recuperaDado(){
    return consultas;
    }
}
