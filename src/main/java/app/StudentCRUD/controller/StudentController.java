package app.StudentCRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.StudentCRUD.model.Student;
import app.StudentCRUD.services.StudentServicesImpl;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentServicesImpl ssi;
	
	@PostMapping("/create")
	public ResponseEntity<String> addStudent(@RequestBody Student stud) {
		ResponseEntity<String> s = ssi.addStudent(stud);
		return s;
	}
	
	@GetMapping("/get/{studId}")
	public Student searchStudent(@PathVariable Integer studId) {
		return ssi.searchStudent(studId);
	}
	
	@GetMapping("/getAll")
	public List<Student> displayAllStudents() {
		return ssi.displayAllStudents();
	}
	
	@DeleteMapping("/delete/{studId}")
	public String deleteStudent(@PathVariable Integer studId) {
		return ssi.deleteStudent(studId);
	}
	
	@PutMapping("/update/{studId}")
	public String updateStudent(@PathVariable Integer studId, @RequestBody Student updtStud) {
		return ssi.updateStudent(studId, updtStud);
	}
	

}
