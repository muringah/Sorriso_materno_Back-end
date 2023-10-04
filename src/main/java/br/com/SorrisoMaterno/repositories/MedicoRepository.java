<<<<<<< HEAD:src/main/java/br/com/SorrisoMaterno/sorrisoapi/repositories/MedicoRepository.java


package br.com.SorrisoMaterno.sorrisoapi.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.SorrisoMaterno.sorrisoapi.model.Medico;

public interface MedicoRepository extends CrudRepository<Medico, Long>{

    Medico findByCrm(String crm);
}

=======
package br.com.SorrisoMaterno.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.SorrisoMaterno.model.Medico;

public interface MedicoRepository extends CrudRepository<Medico, Long>{



}
>>>>>>> jhennifer_dev:src/main/java/br/com/SorrisoMaterno/repositories/MedicoRepository.java
