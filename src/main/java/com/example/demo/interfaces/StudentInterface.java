package com.example.demo.interfaces;

import com.example.demo.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentInterface extends CrudRepository<StudentEntity, Integer> {

}
