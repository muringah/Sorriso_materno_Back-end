
package br.com.SorrisoMaterno.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Paciente extends Usuario {

    // // @Id
    // // @GeneratedValue(strategy = GenerationType.IDENTITY)
    // private long id; 
    private String nome;
    private String telefone;
    private String complicacoes;
    private int gestacoesAnteriores;
    private String email;
    private String dataNascimento;
    private String rg;
    private String cpf;

    
    
    public Paciente(String nome, String telefone, String complicacoes, int gestacoesAnteriores, String email,
            String dataNascimento, String rg, String cpf, String username, String password) {
        super(username, password);
        this.nome = nome;
        this.telefone = telefone;
        this.complicacoes = complicacoes;
        this.gestacoesAnteriores = gestacoesAnteriores;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.cpf = cpf;
    }


    public Paciente(){
        super();
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

    public String getRg() {
        return rg;
    }


    public void setRg(String rg) {
        this.rg = rg;
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}