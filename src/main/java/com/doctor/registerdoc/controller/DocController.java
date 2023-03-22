package com.doctor.registerdoc.controller;

import com.doctor.registerdoc.model.Doctor;
import com.doctor.registerdoc.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DocController {

    @Autowired
    DoctorService doctorService;

    @PostMapping( "/create")
    public ResponseEntity<String> createDoctorRecord(@RequestBody Doctor doctor){
        return  ResponseEntity.ok(doctorService.createDoctorRecord(doctor));
    }


    @GetMapping(value = "/list")
    public ResponseEntity<List<Doctor>> getDoctorList(){
        return ResponseEntity.ok(doctorService.getDoctorList());
    }
}
