package com.example.huisartsenpost.api;

import com.example.huisartsenpost.model.Medicine;
import com.example.huisartsenpost.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MedicineController {

    @Autowired
    private MedicineService medicineService;

    @GetMapping("/getMedicines")
    public List<Medicine> getAllMedicines(){
        return medicineService.getAllMedicine();
    }
}