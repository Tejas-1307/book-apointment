package com.example.book.apointment.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Embeddable
@Data
public class PrefixGenderMappingId implements Serializable {


    private Integer prefixId;

    private Integer genderId;


}
