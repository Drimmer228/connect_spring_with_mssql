package com.example.jpavalidator.repositories;

import com.example.jpavalidator.models.BookModel;
import com.example.jpavalidator.models.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<CarModel, Long> {
    List<CarModel> findByMake(String make);
    
}
