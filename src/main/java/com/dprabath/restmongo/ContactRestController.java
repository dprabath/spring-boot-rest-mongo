package com.dprabath.restmongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PRAJAMA on 7/11/2017.
 */
@RestController
@RequestMapping("/contacts")
public class ContactRestController {

    @Autowired
    private ContactRepository contactRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Contact> getAll() {
        return contactRepository.findAll();
    }

    @RequestMapping(method=RequestMethod.POST)
    public Contact create(@RequestBody Contact contact) {
        return contactRepository.save(contact);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="{id}")
    public void delete(@PathVariable String id) {
        contactRepository.delete(id);
    }

    @RequestMapping(method=RequestMethod.PUT, value="{id}")
    public Contact update(@PathVariable String id, @RequestBody Contact contact) {
        Contact update = contactRepository.findOne(id);
        update.setAddress(contact.getAddress());
        update.setEmail(contact.getEmail());
        update.setFacebookProfile(contact.getFacebookProfile());
        update.setFirstName(contact.getFirstName());
        update.setGooglePlusProfile(contact.getGooglePlusProfile());
        update.setLastName(contact.getLastName());
        update.setLinkedInProfile(contact.getLinkedInProfile());
        update.setPhoneNumber(contact.getPhoneNumber());
        update.setTwitterHandle(contact.getTwitterHandle());
        return contactRepository.save(update);
    }

    @RequestMapping(method = RequestMethod.GET, value = "{id}")
    public Contact findById(@PathVariable String id) {
        return contactRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "{lastName}")
    public Contact findByLastName(@PathVariable String lastName) {
        return contactRepository.findByLastName(lastName);
    }
}
