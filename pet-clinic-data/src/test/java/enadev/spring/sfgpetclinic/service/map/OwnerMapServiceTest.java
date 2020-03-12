package enadev.spring.sfgpetclinic.service.map;

import enadev.spring.sfgpetclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OwnerMapServiceTest {

    OwnerMapService ownerMapService;
    Long owenerId = 1L;
    String name = "Oussama";
    @BeforeEach
    void setUp() {
        ownerMapService = new OwnerMapService(new PetMapService(), new PetTypeMapService());
        ownerMapService.save(Owner.builder().id(owenerId).lastName(name).build());
    }

    @Test
    void findAll() {
        Set<Owner> ownerSet= ownerMapService.findAll();
        assertEquals(1,ownerSet.size());
    }

    @Test
    void findById() {
        Owner owner = ownerMapService.findById(owenerId);
        assertEquals(1,owner.getId());
    }

    @Test
    void saveExistingId() {
        Long id = 2L;
        Owner owner = ownerMapService.save(Owner.builder().id(id).build());
        assertEquals(id,owner.getId());
    }

    @Test
    void saveNoId() {
        Owner owner = ownerMapService.save(Owner.builder().build());
        assertNotNull(owner);
        assertNotNull(owner.getId());
    }

    @Test
    void delete() {
        ownerMapService.delete(ownerMapService.findById(owenerId));
        assertEquals(0,ownerMapService.findAll().size());
    }

    @Test
    void deleteById() {
        ownerMapService.deleteById(owenerId);
        assertEquals(0,ownerMapService.findAll().size());
    }

    @Test
    void findByLastName() {
        Owner owner = ownerMapService.findByLastName(name);
        assertEquals(owenerId, owner.getId());
    }

    @Test
    void findByLastNameNotFound() {
        Owner owner = ownerMapService.findByLastName("foo");
        assertNull(owner);
    }
}