package com.hrechana.petclinic.services;

import com.hrechana.petclinic.model.Owner;

public interface OwnerSerice extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
