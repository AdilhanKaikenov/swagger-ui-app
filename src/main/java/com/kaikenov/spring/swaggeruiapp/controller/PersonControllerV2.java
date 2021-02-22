package com.kaikenov.spring.swaggeruiapp.controller;

import com.kaikenov.spring.swaggeruiapp.entity.Person;
import com.kaikenov.spring.swaggeruiapp.service.PersonService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v2/person")
@Api("This is the controller for the Person V2")
public class PersonControllerV2 {

    @Autowired
    private PersonService personService;

    @GetMapping("/")
    @ApiOperation("This method returns all the Persons in the database with their corresponding Hobbies V2")
    public List<Person> findAll() {
        return personService.findAll();
    }

    @PostMapping("/")
    @ApiOperation("This method can create a new Person and its hobbies if provided V2")
    public Person create(@RequestBody Person person) {
        return personService.create(person);
    }

    @GetMapping("/{personId}")
    @ApiOperation("This method can find a person with a given ID V2")
    public Person findOne(@PathVariable("personId") Long personId) {
        return personService.findOne(personId);
    }

    @GetMapping("/find/{firstName}")
    @ApiOperation("This method can find a list of persons by their first name V2")
    public List<Person> findByFirstName(@PathVariable("firstName") String firstName) {
        return personService.findByFirstName(firstName);
    }

    @DeleteMapping("/{personId}")
    @ApiOperation("This method can delete a person from the database v2")
    public void delete(@PathVariable("personId") Long personId) {
        personService.delete(personId);
    }
}
