package com.jaswanth.hibernate.demo.service;

import com.jaswanth.hibernate.demo.model.Person;
import com.jaswanth.hibernate.demo.repository.PersonRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRespository personRespository;




    public void savePerson(List<Person> personList) {
        personRespository.saveAll(personList);
    }

    public List<Person> getPersons(Integer id) {
        return personRespository.findPersonById(id);
    }
}
