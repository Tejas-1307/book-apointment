package com.example.book.apointment.countryHierachy.controller;

import com.example.book.apointment.countryHierachy.entity.Country;
import com.example.book.apointment.countryHierachy.services.imp.CountryImp;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryContr {

    @Autowired
    private CountryImp countryImp;

    @PostMapping("saveCountry")
    public String saveCountry(@RequestBody @Valid Country country){
        return countryImp.saveCountry(country);
    }
}
