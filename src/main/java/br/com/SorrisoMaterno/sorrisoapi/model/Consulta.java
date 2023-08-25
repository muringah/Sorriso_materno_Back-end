package br.com.SorrisoMaterno.sorrisoapi.model;

public class Consulta {
    
    private String data;
    private String horario;

    public Consulta(String data, String horario) {
        this.data = data;
        this.horario = horario;
    }

    public String getData() {
        return data;
    }

    public void setDataHora(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}

    



