package com.example.huisartsenpost.api;

import com.example.huisartsenpost.model.Prescription;
import com.example.huisartsenpost.model.PrescriptionMedicineEntry;
import com.example.huisartsenpost.service.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;
import java.util.Set;

@RequestMapping ("prescription")
@RestController
public class PrescriptionController {

    @Autowired
    private PrescriptionService prescriptionService;

    @GetMapping
    public List<Prescription> getAllRecipes(){
        return prescriptionService.getAllRecipes();
    }

    @PostMapping
    public void addPrescription ( @RequestBody Prescription prescription) {
        prescriptionService.addPrescription(prescription);
    }

    @PutMapping (path = "{id}/medicine")
    public void addMedicinesToPrescription(@PathVariable("id") Long id, @RequestBody Set<PrescriptionMedicineEntry> medicines){
        prescriptionService.addMedicinesToPrescription(id, medicines);
    }



}
