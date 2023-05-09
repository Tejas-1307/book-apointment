package com.example.book.apointment.manytomany.controller;

import com.example.book.apointment.manytomany.entity.Courses;
import com.example.book.apointment.manytomany.entity.Students;
import com.example.book.apointment.manytomany.repository.CoursesRepository;
import com.example.book.apointment.manytomany.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CoursesRepository coursesRepository;

    @PostMapping("/saveStudent")
    public String saveStudent(@RequestBody Students students){
        studentRepository.save(students);
        return "record saved";
    }

    @PostMapping("/saveCourses")
    public String saveCourses(@RequestBody Courses courses){
        coursesRepository.save(courses);
        return "record saved";
    }
}
