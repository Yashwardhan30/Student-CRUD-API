package app.StudentCRUD.services;

import java.util.List;
import org.springframework.http.ResponseEntity;
import app.StudentCRUD.model.Student;

public interface StudentServices {
	
	public ResponseEntity<String> addStudent(Student stud);
	public Student searchStudent(Integer studId);
	public List<Student> displayAllStudents();
	public String deleteStudent(Integer studId);
	public String updateStudent(Integer studId, Student updtStud);

}
