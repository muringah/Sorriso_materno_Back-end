package br.com.SorrisoMaterno.sorrisoapi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import br.com.SorrisoMaterno.sorrisoapi.model.Consulta;

public interface ConsultaRepository extends CrudRepository<Consulta, Long>{
    
}
