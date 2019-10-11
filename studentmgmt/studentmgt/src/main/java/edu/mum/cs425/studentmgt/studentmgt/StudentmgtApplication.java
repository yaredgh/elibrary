package edu.mum.cs425.studentmgt.studentmgt;

import edu.mum.cs425.studentmgt.studentmgt.model.Student;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@SpringBootApplication
public class StudentmgtApplication {
    private static final String PERSISTENCE_UNIT_NAME = "studentmgt";
    private static EntityManagerFactory factory;

    public StudentmgtApplication() {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    }

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/M/d");
        try {

            Student s1 = new Student(1, 000 - 61 - 0001, "Anna", "Lynn",
                    "Smith", 3.45, sdf.parse("2019/5/24"));
            Student s2 = new Student(1, 10 - 9250, "Yared", "HG",
                    "Ghidey", 3.78, sdf.parse("2019/8/8"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
    private void saveStudent(Student s){
        if(s != null){
            EntityManager em = factory.createEntityManager();
            em.getTransaction().begin();
            em.persist(s);
            em.getTransaction().commit();
            em.close();
            factory.close();
        }
    }
}