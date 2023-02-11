package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "StudentInfo")
public class StudentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ID;
	@NotNull(message = "Name Must not be Empty or Null")
	private String name;
	@NotNull(message = "Section Must Not be Empty or Null")
	private String section;
	@NotNull(message = "School-Name may not be Empty or Null")
	private String schoolName;
}
