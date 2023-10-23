package com.ak.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="courcetable")

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Cource {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cource_Id;
	
	private String courceName;
	private String author;
	
	public Cource() {
		
	}

	public Cource(Integer cource_Id, String courceName, String author) {
		super();
		this.cource_Id = cource_Id;
		this.courceName = courceName;
		this.author = author;
	}

	public Integer getCource_Id() {
		return cource_Id;
	}

	public void setCource_Id(Integer cource_Id) {
		this.cource_Id = cource_Id;
	}

	public String getCourceName() {
		return courceName;
	}

	public void setCourceName(String courceName) {
		this.courceName = courceName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Cource [cource_Id=" + cource_Id + ", courceName=" + courceName + ", author=" + author + "]";
	}

	
}
