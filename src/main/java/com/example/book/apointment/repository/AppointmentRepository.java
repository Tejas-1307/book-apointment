package com.example.book.apointment.repository;

import com.example.book.apointment.entity.Appointments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointments,Integer> {

    String findAllById(Integer id);
}
