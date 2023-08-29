package br.com.SorrisoMaterno.sorrisoapi.model;

public class Paciente {

    private String nome;
    private String telefone;
    private String complicacoes;
    private int gestacoesAnteriores;
    private String email;
    private String dataNascimento;
    public Paciente(String nome, String telefone, String complicacoes, int gestacoesAnteriores, String email,String dataNascimento) {
        this.nome = nome;
        this.telefone = telefone;
        this.complicacoes = complicacoes;
        this.gestacoesAnteriores = gestacoesAnteriores;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getComplicacoes() {
        return complicacoes;
    }
    public void setComplicacoes(String complicacoes) {
        this.complicacoes = complicacoes;
    }
    public int getGestacoesAnteriores() {
        return gestacoesAnteriores;
    }
    public void setGestacoesAnteriores(int gestacoesAnteriores) {
        this.gestacoesAnteriores = gestacoesAnteriores;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    

    
    
}
