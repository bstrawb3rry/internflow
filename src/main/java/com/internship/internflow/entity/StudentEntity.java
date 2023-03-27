package com.internship.internflow.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student")

public class StudentEntity {

    @Id
    @SequenceGenerator(
            name = "studentGenerator",
            sequenceName = "intern_flow.sq_student_id",
            allocationSize = 1
    )

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "studentGenerator")
    private Long student_id;

    @Column(name = "first_name")
    private String firstName;

    @Column
    private String last_name;

    @Column
    private String email;

    @Column
    private String description;

    @Column
    private Integer age;
}

