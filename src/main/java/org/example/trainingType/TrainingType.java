package org.example.trainingType;

import jakarta.persistence.*;

@Entity
public class TrainingType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String name;

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "TrainingType{" + "id=" + id + ", name='" + name + '\'' + '}';
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TrainingType() {
	}

	public TrainingType(Long id, String name) {
		this.id = id;
		this.name = name;
	}

}
