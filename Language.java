package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Language {
	@Id
	private int languageId;
	private String LanguageName;
	private String regionName;
	@ManyToOne(cascade=CascadeType.ALL)
	Nation nation;
	public int getLanguageId() {
		return languageId;
	}
	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}
	public String getLanguageName() {
		return LanguageName;
	}
	public void setLanguageName(String languageName) {
		LanguageName = languageName;
	}
	public String getRegionName() {
		return regionName;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	public Nation getNation() {
		return nation;
	}
	public void setNation(Nation nation) {
		this.nation = nation;
	}
	@Override
	public String toString() {
		return "Language [languageId=" + languageId + ", LanguageName=" + LanguageName + ", regionName=" + regionName
				+ ", nation=" + nation + "]";
	}
	public Language(int languageId, String languageName, String regionName, Nation nation) {
		super();
		this.languageId = languageId;
		LanguageName = languageName;
		this.regionName = regionName;
		this.nation = nation;
	}
	public Language() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
