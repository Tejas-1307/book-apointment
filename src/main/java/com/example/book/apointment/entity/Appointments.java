package com.example.book.apointment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class Appointments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String prefix;

    private String firstName;

    private String middleName;

    private  String lastName;

    private String unit;

    private String gender;

    private String dateOfBirth;

    private Integer age;

    private Integer years;

    private Integer months;

    private Integer days;

    private String isd;

    private String phone;

    private String identificationDoc;

    private Long idDocNo;

    private String patientCat;

    private String bookingSrc;

    private String typeApt;

    private String complaintRemark;

    private String refType;

    private String refName;

    private String dept;

    private String subDepart;

    private String doct;

    private  String apptDate;


}
