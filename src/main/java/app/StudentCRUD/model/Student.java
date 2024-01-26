package app.StudentCRUD.model;

import org.hibernate.annotations.DynamicUpdate;
import jakarta.persistence.*;

@Entity
@Table(name = "student_table")
@DynamicUpdate
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_seq")
	@SequenceGenerator(name = "student_seq", sequenceName = "STUDENT_SEQ", allocationSize = 1)
	@Column(name = "stud_id")
	private Integer studId;
	
	@Column(name = "stud_firstname")
	private String studFirstname;
	
	@Column(name = "stud_lastname")
	private String studLastname;
	
	@Column(name = "stud_age")
	private int studAge;
	
	@Column(name = "stud_mobno")
	private long studMobno;

	public Student(Integer studId, String studFirstname, String studLastname, int studAge, long studMobno) {
		super();
		this.studId = studId;
		this.studFirstname = studFirstname;
		this.studLastname = studLastname;
		this.studAge = studAge;
		this.studMobno = studMobno;
	}

	public Student() {
		super();
	}

	public Integer getStudId() {
		return studId;
	}

	public void setStudId(Integer studId) {
		this.studId = studId;
	}

	public String getStudFirstname() {
		return studFirstname;
	}

	public void setStudFirstname(String studFirstname) {
		this.studFirstname = studFirstname;
	}

	public String getStudLastname() {
		return studLastname;
	}

	public void setStudLastname(String studLastname) {
		this.studLastname = studLastname;
	}

	public int getStudAge() {
		return studAge;
	}

	public void setStudAge(int studAge) {
		this.studAge = studAge;
	}

	public long getStudMobno() {
		return studMobno;
	}

	public void setStudMobno(long studMobno) {
		this.studMobno = studMobno;
	}
	
}
