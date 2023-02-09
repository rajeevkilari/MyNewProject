package com.example.repository;

import com.example.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;

public interface StudentInterface extends CrudRepository<StudentEntity, Integer> {

}
