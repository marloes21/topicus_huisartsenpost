package com.example.huisartsenpost.service;

import com.example.huisartsenpost.model.Medicine;
import com.example.huisartsenpost.repository.MedicineRepository;
import com.example.huisartsenpost.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineService {

    @Autowired
    private MedicineRepository repository;


    public List<Medicine> getAllMedicine(){
        return (List<Medicine>) repository.findAll();
    }
}

