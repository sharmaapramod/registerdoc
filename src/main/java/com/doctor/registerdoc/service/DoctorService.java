package com.doctor.registerdoc.service;

import com.doctor.registerdoc.model.Doctor;

import java.util.Arrays;
import java.util.List;

public interface DoctorService {
    public List<Doctor> getDoctorList();
    public String createDoctorRecord(Doctor doctor);

}
