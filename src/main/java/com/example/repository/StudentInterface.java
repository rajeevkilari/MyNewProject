package com.example.repository;

import com.example.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentInterface extends JpaRepository<StudentEntity, Integer>{

}
