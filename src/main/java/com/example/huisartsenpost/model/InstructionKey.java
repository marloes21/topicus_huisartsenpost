package com.example.huisartsenpost.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public
class InstructionKey implements Serializable {

    @Column (name = "medicine_id")
    private Long medicineId;

    @Column (name = "prescription_id")
    private Long prescriptionId;

    public InstructionKey() {

    }

    public InstructionKey(Long medicineId, Long prescriptionId){
        this.medicineId = medicineId;
        this.prescriptionId = prescriptionId;
    }




    public Long getMedicineId() {
        return medicineId;
    }

    public Long getPrescriptionId() {
        return prescriptionId;
    }
}
