package com.hrechana.petclinic.services;

import com.hrechana.petclinic.model.Owner;

import java.util.Set;

public interface OwnerSerice {
    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
