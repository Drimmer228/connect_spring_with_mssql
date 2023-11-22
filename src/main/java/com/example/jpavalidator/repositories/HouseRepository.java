package com.example.jpavalidator.repositories;

import com.example.jpavalidator.models.CarModel;
import com.example.jpavalidator.models.HouseModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HouseRepository extends JpaRepository<HouseModel, Long> {
    List<HouseModel> findByAddress(String address);
    
}
