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
@Table(name = "Attendance")

public class AttendanceEntity  {
    @Id
    @SequenceGenerator(
            name = "attendanceGenerator",
            sequenceName = "intern_flow.sq_attendance_id",
            allocationSize = 1
    )
    @Column(name = "attendance_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "attendanceGenerator")
    private Long attendanceId;

    @Column(name = "date")
    private OffsetDateTime timestamp;

    @Column(name = "status")
    private String status;

    public AttendanceEntity() {
        // no-arg constructor
    }

    // Getters and Setters
    public Long getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(Long attendanceId) {
        this.attendanceId = attendanceId;
    }

    public OffsetDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
