package app.StudentCRUD.dao;

import org.springframework.data.repository.CrudRepository;
import app.StudentCRUD.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
