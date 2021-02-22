package com.kaikenov.spring.swaggeruiapp.controller;

import com.kaikenov.spring.swaggeruiapp.entity.Person;
import com.kaikenov.spring.swaggeruiapp.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/")
    public List<Person> findAll() {
        return personService.findAll();
    }

    @PostMapping("/")
    public Person create(@RequestBody Person person) {
        return personService.create(person);
    }

    @GetMapping("/{personId}")
    public Person findOne(@PathVariable("personId") Long personId) {
        return personService.findOne(personId);
    }

    @GetMapping("/find/{firstName}")
    public List<Person> findByFirstName(@PathVariable("firstName") String firstName) {
        return personService.findByFirstName(firstName);
    }

    @DeleteMapping("/{personId}")
    public void delete(@PathVariable("personId") Long personId) {
        personService.delete(personId);
    }
}
