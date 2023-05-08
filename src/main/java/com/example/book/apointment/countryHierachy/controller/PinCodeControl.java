package com.example.book.apointment.countryHierachy.controller;

import com.example.book.apointment.countryHierachy.entity.Pincode;
import com.example.book.apointment.countryHierachy.services.imp.PinCodeImp;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PinCodeControl {

    @Autowired
    private PinCodeImp pinCodeImp;

    @PostMapping("savePincode")
    public String savePinCode(@RequestBody @Valid Pincode pincode){
        return pinCodeImp.savePincode(pincode);
    }
}
