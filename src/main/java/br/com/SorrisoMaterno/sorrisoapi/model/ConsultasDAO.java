
 package br.com.SorrisoMaterno.sorrisoapi.model;

public class ConsultasDAO {
        private Database db; 
        
    private static ConsultasDAO instance; 
    
    private ConsultasDAO(){
    }
    
    
    public static ConsultasDAO getInstance(){
    if(instance == null){
    instance = new ConsultasDAO();
    }
    return instance;
    }
   
    
    private Database getConnection(){
    if(this.db == null){
    Database db = new Database();
    db.init();
    this.db = db;
    }
    return this.db;
    }
    
   
    public void delete(Consulta deletar){
    
    }
    public void update(Consulta toUpdate){
    
    }

 }
