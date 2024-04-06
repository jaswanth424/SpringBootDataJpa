package com.jaswanth.hibernate.demo.repository;

import com.jaswanth.hibernate.demo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRespository extends JpaRepository<Person, Integer> {

    List<Person> findPersonByPerson_id(Integer id);
//    List<Person> findPersonById(Integer id);

}
