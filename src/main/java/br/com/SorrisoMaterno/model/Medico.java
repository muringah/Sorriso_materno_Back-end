
package br.com.SorrisoMaterno.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(
        uniqueConstraints=
            @UniqueConstraint(columnNames={"crm"})
    )
public class Medico extends Usuario {
    private String crm;
    private String nome;
    private String telefone;

    public Medico(String nome, String crm, String telefone, String username, String password) {
        super(username, password);
        this.nome = nome;
        this.crm = crm;
        this.telefone = telefone;
    }

    public Medico() {
        super();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
