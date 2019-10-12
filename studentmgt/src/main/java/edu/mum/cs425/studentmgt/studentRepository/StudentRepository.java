package edu.mum.cs425.studentmgt.studentRepository;

import edu.mum.cs425.studentmgt.studentmgt.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Long> {
}
