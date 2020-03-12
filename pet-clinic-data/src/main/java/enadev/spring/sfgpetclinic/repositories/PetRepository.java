package enadev.spring.sfgpetclinic.repositories;

import enadev.spring.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
