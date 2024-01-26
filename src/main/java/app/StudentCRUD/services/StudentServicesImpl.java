package app.StudentCRUD.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import app.StudentCRUD.dao.StudentRepository;
import app.StudentCRUD.model.Student;

@Service
public class StudentServicesImpl implements StudentServices {

	@Autowired
	private StudentRepository studRepo;

	@Override
	public ResponseEntity<String> addStudent(Student stud) {
		String msg=null;
		studRepo.save(stud);
		Student s=studRepo.save(stud);
		if(s!=null) {
			msg="Student Added Sucessfully!!";
		}else {
			msg="ERROR!!!!!";
		}
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

	@Override
	public Student searchStudent(Integer studId) {
		Optional<Student> s=studRepo.findById(studId);
		return s.get();
	}

	@Override
	public List<Student> displayAllStudents() {
		return (List<Student>) studRepo.findAll();
	}

	@Override
	public String deleteStudent(Integer studId) {
		studRepo.deleteById(studId);
		return "Student Deleted Sucessfully!!!";
	}

	@Override
	public String updateStudent(Integer studId, Student updtStud) {
		Optional<Student> optStud = studRepo.findById(studId);
		if(optStud!=null) {
			Student s=new Student(studId, updtStud.getStudFirstname(), updtStud.getStudLastname(), updtStud.getStudAge(), updtStud.getStudMobno());
			studRepo.save(s);
			System.out.println(s);
			return "Student Data Updated Sucessfully!!!";
		}else {
			return "Student Not Found!!!";
		}
		
	}
	
	
	
}
