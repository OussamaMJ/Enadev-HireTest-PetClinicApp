package enadev.spring.sfgpetclinic.repositories;

import enadev.spring.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
