package com.example.book.apointment.countryHierachy.repository;

import com.example.book.apointment.countryHierachy.entity.Pincode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PinCodeRepo extends JpaRepository<Pincode,Integer> {
}
