package br.com.SorrisoMaterno.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import br.com.SorrisoMaterno.model.Consulta;

public interface ConsultaRepository extends CrudRepository<Consulta, Long>{
    Consulta findByData(String data);

}