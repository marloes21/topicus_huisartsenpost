package com.example.huisartsenpost.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "medicines")
public class Medicine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String unitType;
    private int units;
    private String quantityType;
    private int quantity;

    //Andere naam??
    @ManyToMany(mappedBy = "prescribedMedicine")
    //@ManyToMany
    Set<Prescription> prescribedPrescription;

    @OneToMany(mappedBy = "medicine")
    Set<Instruction> instructions;

    public Medicine(){

    }

    public Medicine(Long id, String name, String unitType, int units, String quantityType, int quantity){
        this.id = id;
        this.name = name;
        this.unitType = unitType;
        this.units = units;
        this.quantityType = quantityType;
        this.quantity = quantity;
    }



    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getUnitType(){
        return unitType;
    }

    public void setUnitType(String unitType){
        this.unitType = unitType;
    }

    public int getUnits(){
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public String getQuantityType(){
        return quantityType;
    }

    public void setQuantityType(String quantityType){
        this.quantityType = quantityType;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity (int quantity){
        this.quantity = quantity;
    }

}
