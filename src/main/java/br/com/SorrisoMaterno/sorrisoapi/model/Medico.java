package br.com.SorrisoMaterno.sorrisoapi.model;

public class Medico {

        private String nome;
        private String crm;
        private String telefone;
       
        public Medico() {
            this.nome = nome;
            this.crm = crm;
            this.telefone = telefone;
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
