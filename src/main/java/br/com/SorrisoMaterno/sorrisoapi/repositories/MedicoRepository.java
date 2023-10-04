

package br.com.SorrisoMaterno.sorrisoapi.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.SorrisoMaterno.sorrisoapi.model.Medico;

public interface MedicoRepository extends CrudRepository<Medico, Long>{

    Medico findByCrm(String crm);
}

