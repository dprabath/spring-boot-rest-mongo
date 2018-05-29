package com.dprabath.restmongo;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by PRAJAMA on 7/11/2017.
 */
public interface ContactRepository extends MongoRepository<Contact, String> {
    Contact findByLastName(String lastName);
}
