package com.example.book.apointment.countryHierachy.services.imp;

import com.example.book.apointment.countryHierachy.entity.Country;
import com.example.book.apointment.countryHierachy.repository.CountryRepo;
import com.example.book.apointment.countryHierachy.services.CountryServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryImp implements CountryServ {

    @Autowired
    private CountryRepo countryRepo;

    @Override
    public String saveCountry(Country country) {
        countryRepo.save(country);
        return "country saved";
    }
}
