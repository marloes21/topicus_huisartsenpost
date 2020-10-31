package com.example.huisartsenpost.service;

import com.example.huisartsenpost.model.Patient;
import com.example.huisartsenpost.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository repository;


    public List<Patient> getAllPatient(){
        return (List<Patient>) repository.findAll();
    }

    public void addPatient(Patient patient){
        repository.save(patient);

    }
}
