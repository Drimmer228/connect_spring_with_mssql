package com.example.jpavalidator.repositories;

import com.example.jpavalidator.models.CarModel;
import com.example.jpavalidator.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductModel, Long> {
    List<ProductModel> findByName(String name);
    
}
