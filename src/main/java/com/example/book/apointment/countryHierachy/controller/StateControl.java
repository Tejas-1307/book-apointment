package com.example.book.apointment.countryHierachy.controller;

import com.example.book.apointment.countryHierachy.entity.State;
import com.example.book.apointment.countryHierachy.services.imp.StateImp;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StateControl {

    @Autowired
    private StateImp stateImp;

    @PostMapping("saveState")
    public String saveState(@RequestBody @Valid State state){
        return stateImp.saveState(state);
    }
}
