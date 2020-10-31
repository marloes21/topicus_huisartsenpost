package com.example.huisartsenpost.repository;

import com.example.huisartsenpost.model.Prescription;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrescriptionRepository extends CrudRepository<Prescription, Long> {

}