package com.example.book.apointment.manytomany.repository;

import com.example.book.apointment.manytomany.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursesRepository extends JpaRepository<Courses,Integer> {

}
