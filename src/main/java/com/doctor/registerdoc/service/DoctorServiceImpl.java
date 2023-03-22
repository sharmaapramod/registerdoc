package com.doctor.registerdoc.service;

import com.doctor.registerdoc.dao.DocDAO;
import com.doctor.registerdoc.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class DoctorServiceImpl implements DoctorService {
ApplicationContext applicationContext = new AnnotationConfigReactiveWebApplicationContext();

@Autowired
private DocDAO  docDAO;
    @Override
    public List<Doctor> getDoctorList() {
           List<Doctor> doctorList = Arrays.asList(new Doctor(1,"John", "MBBS",3.4,"Artho",500.0),
                    new Doctor(2,"PETER", "MBBS",3.4,"Surgen",1500.0),
                    new Doctor(3,"Marry", "MBBS",3.4,"Bone",1000.0));
            return doctorList;
        }
@Override
    public String createDoctorRecord(Doctor doctor){

    docDAO.save(doctor);
        return "Doctor record created";
    }
}
