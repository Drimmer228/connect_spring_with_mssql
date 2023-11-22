package com.example.jpavalidator.controllers;

import com.example.jpavalidator.models.BookModel;
import com.example.jpavalidator.models.HouseModel;
import com.example.jpavalidator.models.PersonModel;
import com.example.jpavalidator.repositories.CarRepository;
import com.example.jpavalidator.repositories.HouseRepository;
import com.example.jpavalidator.repositories.PersonRepository;
import org.hibernate.dialect.lock.PessimisticEntityLockException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/persons")
public class PersonController  extends CrudController<PersonModel, Long> {
    private final PersonRepository personRepository;


    @Autowired
    public PersonController(PersonRepository personRepository) {
        super(personRepository, "person");
        this.personRepository = personRepository;
    }

    @GetMapping("/search")
    public String searchByName(@RequestParam("name") String name, Model model) {
        List<PersonModel> personByName = personRepository.findByName(name);
        model.addAttribute("persons", personByName);
        return "persons/search_results";
    }
}