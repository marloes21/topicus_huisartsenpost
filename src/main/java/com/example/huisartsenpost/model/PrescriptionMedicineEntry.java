package com.example.huisartsenpost.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PrescriptionMedicineEntry {
    public Long medicineId;
    public String instruction;

  public PrescriptionMedicineEntry(@JsonProperty("medicine_id") Long medicineId, @JsonProperty("instruction") String instruction){
      this.medicineId = medicineId;
      this.instruction = instruction;
  }
}
