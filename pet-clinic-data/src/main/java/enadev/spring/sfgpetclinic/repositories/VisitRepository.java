package enadev.spring.sfgpetclinic.repositories;

import enadev.spring.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
