package org.SebaouneEtSaraoui.models;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Access(AccessType.FIELD)
public class Commune {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;
	private String name;
	
	
	@Column(name="nom")
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setId(long id) {
		Id = id;
	}
	public long getId() {
		return Id;
	}
	
	
	public Commune(String name, long id) {
		super();
		this.name = name;
		Id = id;
	}
	public Commune() {
	}
	
}
