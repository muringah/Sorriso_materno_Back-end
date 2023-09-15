
 package br.com.SorrisoMaterno.sorrisoapi.model;

public class ConsultasDAO {
        private DatabaseConsulta db; 
        
    private static ConsultasDAO instance; 
    
    private ConsultasDAO(){
    }
    
    
    public static ConsultasDAO getInstance(){
    if(instance == null){
    instance = new ConsultasDAO();
    }
    return instance;
    }
   
    
    private DatabaseConsulta getConnection(){
    if(this.db == null){
    DatabaseConsulta db = new DatabaseConsulta();
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
