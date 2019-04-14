package com.hrechana.petclinic.services;

import com.hrechana.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
