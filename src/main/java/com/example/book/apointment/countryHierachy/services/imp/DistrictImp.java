package com.example.book.apointment.countryHierachy.services.imp;

import com.example.book.apointment.countryHierachy.entity.District;
import com.example.book.apointment.countryHierachy.repository.DistrictRepo;
import com.example.book.apointment.countryHierachy.services.DistrictServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DistrictImp implements DistrictServ {

    @Autowired
    private DistrictRepo districtRepo;

    @Override
    public String saveDistrict(District district) {
        districtRepo.save(district);
        return "district saved";
    }
}
