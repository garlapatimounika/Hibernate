package com.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Nation {
	@Id
	private int nationId;
	String nationName;
	@OneToMany(cascade=CascadeType.ALL)
	private List<Language> languages;
	public int getNationId() {
		return nationId;
	}
	public void setNationId(int nationId) {
		this.nationId = nationId;
	}
	public String getNationName() {
		return nationName;
	}
	public void setNationName(String nationName) {
		this.nationName = nationName;
	}
	public List<Language> getLanguages() {
		return languages;
	}
	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}
	@Override
	public String toString() {
		return "Nation [nationId=" + nationId + ", nationName=" + nationName + ", languages=" + languages + "]";
	}
	public Nation(int nationId, String nationName, List<Language> languages) {
		super();
		this.nationId = nationId;
		this.nationName = nationName;
		this.languages = languages;
	}
	public Nation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
