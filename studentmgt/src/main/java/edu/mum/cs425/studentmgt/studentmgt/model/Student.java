package edu.mum.cs425.studentmgt.studentmgt.model;

import javax.persistence.*;

import java.time.LocalDate;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long studentId;

    @Column(nullable = false)
    private int StudenNumber;

    @Column(nullable = false)
    private String firstName;


    private String middleName;

    @Column(nullable = false)
    private String lastName;


    private double cgpa;


    private LocalDate dateOfEnrollment;
    @OneToOne
    private Transcript transcript;

    public Student() {

    }

    public Student(long studentId, int studenNumber, String firstName, String middleName, String lastName, double cgpa, LocalDate dateOfEnrollment,Transcript transcript) {
        StudenNumber = studenNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.dateOfEnrollment = dateOfEnrollment;
        this.transcript = transcript;

    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public int getStudenNumber() {
        return StudenNumber;
    }

    public void setStudenNumber(int studenNumber) {
        StudenNumber = studenNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public LocalDate getDateOfEnrollment() {
        return dateOfEnrollment;
    }

    public void setDateOfEnrollment(LocalDate dateOfEnrollment) {
        this.dateOfEnrollment = dateOfEnrollment;
    }
}
