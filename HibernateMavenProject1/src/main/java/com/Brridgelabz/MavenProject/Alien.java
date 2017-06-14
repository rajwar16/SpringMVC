package com.Brridgelabz.MavenProject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Alien_Table1")
public class Alien {
	@Id
	private int Id;
	private Alien_name name;
	private String color;
	
	public int getaID() {
		return Id;
	}
	
	public void setaID(int aID) {
		this.Id = aID;
	}
	
	public Alien_name getName() {
		return name;
	}

	public void setName(Alien_name name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Alien [Id=" + Id + ", name=" + name + ", color=" + color + "]";
	}
	
	
	
}
