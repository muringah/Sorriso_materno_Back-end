package br.com.SorrisoMaterno.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.SorrisoMaterno.model.Paciente;

public interface PacienteRepository extends CrudRepository<Paciente, Long>{
    

        Paciente findByRg(String rg);

}
