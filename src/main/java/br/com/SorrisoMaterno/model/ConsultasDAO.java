
package br.com.SorrisoMaterno.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.SorrisoMaterno.repositories.ConsultaRepository;

/*
 * @Service permite que o Spring escaneie a classe ConsultasDAO
 * Assim, a classe ConsultaDAO poderá ser carregadas no controller com @Autowired, e 
 * por consequência o o ConsultaReposiotry n será mais nulo
 */
@Service
public class ConsultasDAO {
    @Autowired
    ConsultaRepository consultaRepo;

    private static ConsultasDAO instance;

    private ConsultasDAO() {
    }

    // public static ConsultasDAO getInstance() {
    //     if (instance == null) {
    //         instance = new ConsultasDAO();
    //     }
    //     return instance;
    // }

    // private DatabaseConsulta getConnection() {
    //     if (this.db == null) {
    //         DatabaseConsulta db = new DatabaseConsulta();
    //         db.init();
    //         this.db = db;
    //     }
    //     return this.db;
    // }

    public void delete(Consulta deletar) {
        consultaRepo.delete(deletar);
    }

    public void create(Consulta novaConsulta) {
        consultaRepo.save(novaConsulta);
    }

    public void update(Consulta atualizarConsulta) {
        consultaRepo.save(atualizarConsulta);
    }

    public Consulta recuperarConsulta(String data){
        return consultaRepo.findByData(data);
    }
}



