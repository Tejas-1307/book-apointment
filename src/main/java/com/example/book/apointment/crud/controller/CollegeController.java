package com.example.book.apointment.crud.controller;

import com.example.book.apointment.crud.entity.College;
import com.example.book.apointment.crud.repository.CollageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CollegeController {

    @Autowired
    private CollageRepo collageRepo;


    @PostMapping("saveCollege")
    public String saveCollege(@RequestBody College college){
        collageRepo.save(college);
        return "saved college";
    }

    @GetMapping("findById/{id}")
    public Optional<College> getById(@PathVariable Integer id){
        return collageRepo.findById(id);
    }

    @PutMapping("updateCollege")
    public String updateCollege(@RequestBody College college){
        College college1 = collageRepo.getReferenceById(college.getId());
        college1.setCollageName(college.getCollageName());
        college1.setAddress(college.getAddress());

        collageRepo.save(college1);
        return "update succed";
    }

    @DeleteMapping("deleteById/{id}")
    public String deleteById(@PathVariable Integer id){
        collageRepo.deleteById(id);
        return "deleted";
    }


}
