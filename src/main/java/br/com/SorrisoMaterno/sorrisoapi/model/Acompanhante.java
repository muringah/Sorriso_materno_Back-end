package br.com.SorrisoMaterno.sorrisoapi.model;

public class Acompanhante {

    private String nome;
    private String email;
    public Acompanhante(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    

    
}
