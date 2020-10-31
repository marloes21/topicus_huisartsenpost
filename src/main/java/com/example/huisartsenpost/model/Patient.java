package com.example.huisartsenpost.model;



import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String bsn;

    public Patient(){

    }

    public Patient( Long id, @JsonProperty("name") String name,@JsonProperty("bsn") String bsn){
        this.id = id;
        this.name = name;
        this.bsn = bsn;
    }

    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getBsn(){
        return bsn;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBsn(String bsn){
        this.bsn = bsn;
    }

}
