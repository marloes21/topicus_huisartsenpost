package com.example.huisartsenpost.model;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "prescriptions")
public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long patientId;
    private String deliveryMethod;
    private String prescriptionDate;
    private String prescriptionEndDate;

//
   @ManyToMany
            @JoinTable(
                    name = "medicine_prescription",
                    joinColumns = @JoinColumn(name = "prescription_id", referencedColumnName = "id"),
                    inverseJoinColumns = @JoinColumn(name = "medicine_id", referencedColumnName = "id")

            )
    Set<Medicine> prescribedMedicine;

    @OneToMany(mappedBy = "prescription")
    Set<Instruction> instructions;


    public Prescription() {

    }

    public Prescription(Long id, @JsonProperty ("patient_id") Long patientId,
                        @JsonProperty("delivery_method") String deliveryMethod,
                        @JsonProperty("prescription_date") String prescriptionDate,
                        @JsonProperty("prescription_end_date") String prescriptionEndDate) {
        this.id = id;
        this.patientId = patientId;
        this.deliveryMethod = deliveryMethod;
        this.prescriptionDate = prescriptionDate;
        this.prescriptionEndDate = prescriptionEndDate;
    }

    public Long getId() {
        return id;
    }

    public Long getPatientId(){
        return patientId;
    }

    public String getDeliveryMethod () {
        return deliveryMethod;
    }

    public String getPrescriptionDate(){
        return prescriptionDate;
    }

    public String getPrescriptionEndDate(){
        return prescriptionEndDate;
    }

    public void setPrescribedMedicine(Set<Medicine> prescribedMedicine) {
        this.prescribedMedicine = prescribedMedicine;
    }

    public void setInstructions(Set<Instruction> presribedMedicineWithInstruction){
        this.instructions = presribedMedicineWithInstruction;
    }
}