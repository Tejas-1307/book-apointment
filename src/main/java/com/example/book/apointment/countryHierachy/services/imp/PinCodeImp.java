package com.example.book.apointment.countryHierachy.services.imp;

import com.example.book.apointment.countryHierachy.entity.Pincode;
import com.example.book.apointment.countryHierachy.repository.PinCodeRepo;
import com.example.book.apointment.countryHierachy.services.PinCodeServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PinCodeImp implements PinCodeServ {

    @Autowired
    private PinCodeRepo pinCodeRepo;


    @Override
    public String savePincode(Pincode pincode) {
        pinCodeRepo.save(pincode);
        return "pincode saved";
    }
}
