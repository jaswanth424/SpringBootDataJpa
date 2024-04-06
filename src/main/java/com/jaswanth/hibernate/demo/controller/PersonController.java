package com.jaswanth.hibernate.demo.controller;


import com.jaswanth.hibernate.demo.model.Person;
import com.jaswanth.hibernate.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/person")
    public ResponseEntity<?> savePerson(@RequestBody List<Person> personList) {
        personService.savePerson(personList);
        return ResponseEntity.ok(personList);
    }

    @GetMapping("/person/{id}")
    public List<Person> getPersons(@PathVariable Integer id){
        return personService.getPersons(id);
    }
}
