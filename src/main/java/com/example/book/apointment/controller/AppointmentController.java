package com.example.book.apointment.controller;

import com.example.book.apointment.entity.*;
import com.example.book.apointment.repository.AppointmentRepository;
import com.example.book.apointment.repository.GenderRepository;
import com.example.book.apointment.repository.PrefixGenderMappingRepo;
import com.example.book.apointment.repository.PrefixRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class AppointmentController {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Autowired
    private GenderRepository genderRepository;

    @Autowired
    private PrefixRepository prefixRepository;

    @Autowired
    private PrefixGenderMappingRepo prefixGenderMappingRepo;

    @PostMapping("saveGender")
    public String saveGender(@RequestBody Gender gender){
        genderRepository.save(gender);
        return "Gender saved";
    }


    @PostMapping("savePrefix")
    public String saveGenderPrefix(@RequestBody Prefix prefix){
        Prefix prefix1 = prefixRepository.save(prefix);

        PrefixGenderMappingId prefixGenderMappingId = new PrefixGenderMappingId();
        prefixGenderMappingId.setPrefixId(prefix1.getId());
        prefixGenderMappingId.setGenderId(prefix1.getGender());

        PrefixGenderMapping prefixGenderMapping = new PrefixGenderMapping();
        prefixGenderMapping.setPrefixGenderMappingId(prefixGenderMappingId);
        prefixGenderMappingRepo.save(prefixGenderMapping);
        return "prefix saved";
    }

    @PostMapping("saveAppointment")
    public String saveAppointment(@RequestBody Appointments appointments){
        appointmentRepository.save(appointments);
        return "save Appointment";
    }

    @GetMapping("getById/{id}")
    public Optional<Appointments> getById(@PathVariable Integer id){
        return appointmentRepository.findById(id);


    }
}
