package com.example.huisartsenpost.model;

import org.springframework.web.bind.annotation.PutMapping;

import javax.persistence.*;

@Entity
@Table(name = "medicine_prescription")
public class Instruction {

    @EmbeddedId
    InstructionKey id;

    @ManyToOne
    @MapsId("medicineId")
    @JoinColumn(name = "medicine_id")
    Medicine medicine;

    @ManyToOne
    @MapsId("prescriptionId")
    @JoinColumn(name = "prescription_id")
    Prescription prescription;

    @Column(name = "instruction")
    String instruction;

    public Instruction(){}

    public Instruction(Medicine medicine, Prescription prescription, String instruction ){
        this.medicine = medicine;
        this.prescription = prescription;
        this.instruction = instruction;
        this.id = new InstructionKey();
    }

    public InstructionKey getId(){
        return id;
    }

    public void setId(InstructionKey id){
        this.id = id;
    }

    public Medicine getMedicine(){
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }
}
