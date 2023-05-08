package com.example.book.apointment.countryHierachy.controller;

import com.example.book.apointment.countryHierachy.entity.Tahsil;
import com.example.book.apointment.countryHierachy.services.imp.TahsilImp;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TahsilControl {

    @Autowired
    private TahsilImp tahsilImp;

    @PostMapping("saveTahsil")
    public String saveTahsil(@RequestBody @Valid Tahsil tahsil){
        return tahsilImp.saveTahsil(tahsil);
    }
}
