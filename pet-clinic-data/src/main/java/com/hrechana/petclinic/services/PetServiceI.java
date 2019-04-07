package com.hrechana.petclinic.services;

import com.hrechana.petclinic.model.Owner;
import com.hrechana.petclinic.model.Pet;

import java.util.Set;

public interface PetServiceI {
    Pet findById(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();
}
