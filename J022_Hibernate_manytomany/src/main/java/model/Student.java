package model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	
	@ManyToMany
	@JoinTable(
			name = "std_sub",
			joinColumns = @JoinColumn(name="st_id"),
			inverseJoinColumns = @JoinColumn(name="sub_id")
			)
	List<Subject> subjects;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	
	public void addSubject(Subject sub)
	{
		if(subjects==null)
		{
			subjects = new ArrayList<Subject>();
		}
		subjects.add(sub);
	}

	
	
	
	
}
