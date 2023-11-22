package com.example.jpavalidator.controllers;

import com.example.jpavalidator.models.HouseModel;
import com.example.jpavalidator.repositories.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/houses")
public class HouseController  extends CrudController<HouseModel, Long> {
    private final HouseRepository houseRepository;

    @Autowired
    public HouseController(HouseRepository houseRepository) {
        super(houseRepository, "house");
        this.houseRepository = houseRepository;
    }

    @GetMapping("/search")
    public String searchByAddress(@RequestParam("address") String address, Model model) {
        List<HouseModel> houseByAddress = houseRepository.findByAddress(address);
        model.addAttribute("houses", houseByAddress);
        return "houses/search_results";
    }
}
