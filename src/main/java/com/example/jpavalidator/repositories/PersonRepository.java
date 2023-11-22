package com.example.jpavalidator.repositories;

import com.example.jpavalidator.models.CarModel;
import com.example.jpavalidator.models.PersonModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<PersonModel, Long> {
    List<PersonModel> findByName(String name);
    
}
