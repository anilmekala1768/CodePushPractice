package com.anil.Hiber1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Developer {
	@Id
	private int id;
	private String name;
	private String tech;
	public Developer() {
		super();
	}
	public Developer(int id, String name, String tech) {
		super();
		this.id = id;
		this.name = name;
		this.tech = tech;
	}
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
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
}
