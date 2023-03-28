package com.internship.internflow.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@Table(name = "Grades")
public class GradesEntity {
    @Id
    @SequenceGenerator(
            name = "gradesGenerator",
            sequenceName = "intern_flow.sq_grade_id",
            allocationSize = 1
    )
    @Column(name = "grade_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gradesGenerator")
    private Long gradeId;


    @Column(name = "student_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "studentGenerator")
    private Long studentId;

    @Column(name = "mentor_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mentorGenerator")
    private Long mentorId;

    @Column(name = "grade_value")
    private int gradeValue;

    @Column(name="grade_dimension")
    private String gradeDimension;

    @Column(name="comment")
    private String comment;

    public GradesEntity() {
        //no-arg Constructor
    }

    // Getters and Setters
    public Long getGradeId() {
        return gradeId;
    }

    public void setGradeId(Long gradeId) {
        this.gradeId = gradeId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getMentorId() {
        return mentorId;
    }

    public void setMentorId(Long mentorId) {
        this.mentorId = mentorId;
    }

    public int getGradeValue() {
        return gradeValue;
    }

    public void setGradeValue(int gradeValue) {
        this.gradeValue = gradeValue;
    }

    public String getGradeDimension() {
        return gradeDimension;
    }

    public void setGradeDimension(String gradeDimension) {
        this.gradeDimension = gradeDimension;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
