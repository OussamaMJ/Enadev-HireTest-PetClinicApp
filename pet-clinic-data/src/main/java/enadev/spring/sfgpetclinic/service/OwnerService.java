package enadev.spring.sfgpetclinic.service;

import enadev.spring.sfgpetclinic.model.Owner;

import java.util.List;

public interface OwnerService extends CrudInterface<Owner,Long>{
    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String anyString);
}
