package com.example.huisartsenpost.api;

import com.example.huisartsenpost.model.Patient;
import com.example.huisartsenpost.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping ("patient")
@RestController
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping
    public List<Patient> getAllPatients(){
        return patientService.getAllPatient();
    }

    @PostMapping
    public void addPatient ( @RequestBody Patient patient) {
        patientService.addPatient(patient);
    }



}
