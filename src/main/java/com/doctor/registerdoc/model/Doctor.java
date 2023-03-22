package com.doctor.registerdoc.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@JsonAutoDetect
@Entity
public class Doctor {
    public Doctor() {
    }

    @JsonProperty("id")
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
   @JsonProperty("name")
    private  String name;
   @JsonProperty("qualification")
    private String qualification;
    @JsonProperty("experience")
    private Double experience;
    @JsonProperty("specialization")
    private String specialization;
    @JsonProperty("consultingFees")
    private Double consultingFees;

    public Doctor(Integer id, String name, String qualification, Double experience, String specialization, Double consultingFees) {
        this.id = id;
        this.name = name;
        this.qualification = qualification;
        this.experience = experience;
        this.specialization = specialization;
        this.consultingFees = consultingFees;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", qualification='" + qualification + '\'' +
                ", experience=" + experience +
                ", specialization='" + specialization + '\'' +
                ", consultingFees=" + consultingFees +
                '}';
    }

    public Double getConsultingFees() {
        return consultingFees;
    }

    public void setConsultingFees(Double consultingFees) {
        this.consultingFees = consultingFees;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Double getExperience() {
        return experience;
    }

    public void setExperience(Double experience) {
        this.experience = experience;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
