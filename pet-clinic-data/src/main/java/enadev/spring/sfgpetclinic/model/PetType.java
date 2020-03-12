package enadev.spring.sfgpetclinic.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "types")
public class PetType extends BaseEntity{
    @Column(name = "pet_name")
    private String petName;

    @Override
    public String toString() {
        return petName;
    }
}
