package com.internship.internflow.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

import java.time.OffsetDateTime;

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
    @Column
    private String firstName;

    @Column
    private String last_name;

    @Column
    private String email;
    @Column(name = "registration_date")
    private OffsetDateTime registration_date;


    public StudentEntity() {

    }

    public Long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public OffsetDateTime getRegistration_date() {
        return registration_date;
    }

    public void setRegistration_date(OffsetDateTime registration_date) {
        this.registration_date = registration_date;
    }
}
