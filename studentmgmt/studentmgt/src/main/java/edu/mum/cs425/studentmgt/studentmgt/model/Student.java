package edu.mum.cs425.studentmgt.studentmgt.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name = "Students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "studen_Id")
    private Long studentId;

    @Column(name = "student_Number", nullable = false)
    private int StudenNumber;

    @Column(name = "first_name",nullable = false)
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name  = "last_name", nullable = false)
    private String lastName;

    @Column(name = "CGPA")
    private double cgpa;

    @Column(name = "dateOf_Enrollment")
    private Date  dateOfEnrollment;

    public Student(){

    }

    public Student(long studentId, int studenNumber, String firstName, String middleName, String lastName, double cgpa, Date dateOfEnrollment) {
        StudenNumber = studenNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.dateOfEnrollment = dateOfEnrollment;
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

    public Date getDateOfEnrollment() {
        return dateOfEnrollment;
    }

    public void setDateOfEnrollment( Date  dateOfEnrollment) {
        this.dateOfEnrollment = dateOfEnrollment;
    }
}
