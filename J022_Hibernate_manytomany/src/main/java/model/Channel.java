package model;

import jakarta.persistence.*;

@Entity
@Table(name="channel")
public class Channel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="chname")
	private String chname;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="instructor")
	Instructor instructor;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getChname() {
		return chname;
	}

	public void setChname(String chname) {
		this.chname = chname;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	
	
}
