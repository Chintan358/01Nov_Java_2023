package model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="subject")
public class Subject {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="sname")
	private String sname;

	@ManyToMany
	@JoinTable(
			name = "std_sub",
			joinColumns = @JoinColumn(name="sub_id"),
			inverseJoinColumns = @JoinColumn(name="st_id")
			)
	List<Student> studetns;
	
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH,CascadeType.PERSIST})
	@JoinColumn(name="ins_id")
	Instructor instructor;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public List<Student> getStudetns() {
		return studetns;
	}

	public void setStudetns(List<Student> studetns) {
		this.studetns = studetns;
	}
	
	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public void addStudent(Student std)
	{
		if(studetns == null)
		{
			studetns = new ArrayList<Student>();
		}
		studetns.add(std);
	}
}
