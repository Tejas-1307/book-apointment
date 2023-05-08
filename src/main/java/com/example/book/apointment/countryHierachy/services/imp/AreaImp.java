package com.example.book.apointment.countryHierachy.services.imp;

import com.example.book.apointment.countryHierachy.entity.Area;
import com.example.book.apointment.countryHierachy.repository.AreaRepo;
import com.example.book.apointment.countryHierachy.services.AreaServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AreaImp implements AreaServ {

    @Autowired
    private AreaRepo areaRepo;


    @Override
    public String saveArea(Area area) {
        areaRepo.save(area);
        return "area saved";
    }
}
