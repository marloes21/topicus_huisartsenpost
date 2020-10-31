package com.example.huisartsenpost.repository;

import com.example.huisartsenpost.model.Instruction;
import com.example.huisartsenpost.model.Medicine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructionRepository extends CrudRepository<Instruction, Long> {

}