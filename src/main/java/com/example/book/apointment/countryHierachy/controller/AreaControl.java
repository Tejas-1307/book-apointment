package com.example.book.apointment.countryHierachy.controller;

import com.example.book.apointment.countryHierachy.entity.Area;
import com.example.book.apointment.countryHierachy.services.imp.AreaImp;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AreaControl {

    @Autowired
    private AreaImp areaImp;

    @PostMapping("saveArea")
    public String saveArea(@RequestBody @Valid Area area){
        return areaImp.saveArea(area);
    }
}
