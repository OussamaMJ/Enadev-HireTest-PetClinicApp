package enadev.spring.sfgpetclinic.repositories;

import enadev.spring.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
