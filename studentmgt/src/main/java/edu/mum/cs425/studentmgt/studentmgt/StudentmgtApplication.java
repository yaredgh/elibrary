package edu.mum.cs425.studentmgt.studentmgt;

import edu.mum.cs425.studentmgt.studentRepository.StudentRepository;
import edu.mum.cs425.studentmgt.studentmgt.model.Student;

import edu.mum.cs425.studentmgt.studentmgt.model.Transcript;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


import java.time.LocalDate;
@EnableJpaAuditing
@EnableJpaRepositories("edu.mum.cs425.studentmgt.studentRepository")
@ComponentScan(basePackages = {"edu.mum.cs425.studentmgt.studentmgt.model"})
@SpringBootApplication
public class StudentmgtApplication implements CommandLineRunner {

    public static void main(String[] args)  {
        SpringApplication.run(StudentmgtApplication.class, args);
    }
    @Autowired
            private StudentRepository studentRepository;


    @Override
    public void run(String... args) throws Exception {
        saveStudent();
        printStudent();

    }

    void saveStudent(){
        Student s1 = new Student(1, 000-61-0001, "Anna", "Lynn",
                "Smith", 3.45, LocalDate.of(2019, 5, 24) ,new Transcript(1L ,"Cs"));
        Student s2 = new Student(1, 10-9250, "Yared", "HG",
                "Ghidey", 3.78, LocalDate.of(2019, 8, 8),new Transcript(2L,"CS"));
        System.out.println("save the student: " + s1);
        studentRepository.save(s1);
        studentRepository.save(s2);

    }
    void printStudent(){
        System.out.println("inside printStudent().");
    }
}