package com.example.book.apointment.countryHierachy.services.imp;

import com.example.book.apointment.countryHierachy.entity.Tahsil;
import com.example.book.apointment.countryHierachy.repository.TahsilRepo;
import com.example.book.apointment.countryHierachy.services.TahsilServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TahsilImp implements TahsilServ {

    @Autowired
    private TahsilRepo tahsilRepo;


    @Override
    public String saveTahsil(Tahsil tehsil) {
        tahsilRepo.save(tehsil);
        return "Tahsil Saved";
    }
}
