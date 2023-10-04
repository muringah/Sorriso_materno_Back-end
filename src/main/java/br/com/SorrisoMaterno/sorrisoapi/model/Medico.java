package br.com.SorrisoMaterno.sorrisoapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity

public class Medico {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        private String nome;
        private String crm;
        private String telefone;
    
       
        public Medico(String nome, String crm, String telefone) {
            this.nome = nome;
            this.crm = crm;
            this.telefone = telefone;
        }
        public Medico() {
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
