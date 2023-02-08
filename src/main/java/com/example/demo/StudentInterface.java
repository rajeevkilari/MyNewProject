package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface StudentInterface extends JpaRepository<StudentEntity, Integer>{

}
