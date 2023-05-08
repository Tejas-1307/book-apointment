package com.example.book.apointment.countryHierachy.controller;

import com.example.book.apointment.countryHierachy.entity.District;
import com.example.book.apointment.countryHierachy.services.imp.DistrictImp;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DistrictControl {

    @Autowired
    private DistrictImp districtImp;

    @PostMapping("saveDistrict")
    public String saveDistrict(@RequestBody @Valid District district){
        return districtImp.saveDistrict(district);
    }
}
