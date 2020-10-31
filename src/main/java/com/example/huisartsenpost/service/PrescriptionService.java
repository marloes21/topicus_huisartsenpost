package com.example.huisartsenpost.service;

import com.example.huisartsenpost.model.*;
import com.example.huisartsenpost.repository.InstructionRepository;
import com.example.huisartsenpost.repository.MedicineRepository;
import com.example.huisartsenpost.repository.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.*;

@Service
public class PrescriptionService {

    @Autowired
    private PrescriptionRepository prescriptionRepository;
    @Autowired
    private MedicineRepository medicineRepository;
    @Autowired
    private InstructionRepository instructionRepository;


    public List<Prescription> getAllRecipes(){
        return (List<Prescription>) prescriptionRepository.findAll();
    }

    public void addPrescription(Prescription prescription){
        prescriptionRepository.save(prescription);

    }

    public void addMedicinesToPrescription(Long id, Set<PrescriptionMedicineEntry> medicines){
          Optional<Prescription> findPrescription = prescriptionRepository.findById(id);
        if(findPrescription.isPresent()){
            Prescription prescription = findPrescription.get();
            for(PrescriptionMedicineEntry entry : medicines){
               Optional<Medicine> findMedicine = medicineRepository.findById(entry.medicineId);

               if(findMedicine.isPresent()){
                   Medicine medicine = findMedicine.get();
                   Instruction instruction = new Instruction(medicine, prescription, entry.instruction);

                   instructionRepository.save(instruction);
               } else {
                   throw new ResponseStatusException(
                           HttpStatus.NOT_FOUND, "medicine not found"
                   );
               }

            }
          } else{
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "prescription not found"
            );
          }



    }
}