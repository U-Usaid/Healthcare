package com.Healthcare.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Setter
@Getter
@Data
@Entity
public class InsuranceProviders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

}
