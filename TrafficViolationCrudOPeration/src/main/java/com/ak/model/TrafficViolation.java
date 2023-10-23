package com.ak.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="trafficviolation")
@JsonIgnoreProperties({"hibernateLazyInitializer", "Handler"})
public class TrafficViolation {
	
	@Column(name="Id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="trafficViolationQuestion")
	private String trafficViolationQuestion;
	@Column(name="trafficViolationCode")
	private String trafficViolationCode;
	@Column(name="traffiecViolationPoint")
	private String traffiecViolationPoint;
	@Column(name="description" ,nullable = false)
	private String description;
	
	
	public TrafficViolation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TrafficViolation(Integer id, String trafficViolationQuestion, String trafficViolationCode,
			String traffiecViolationPoint, String description) {
		super();
		this.id = id;
		this.trafficViolationQuestion = trafficViolationQuestion;
		this.trafficViolationCode = trafficViolationCode;
		this.traffiecViolationPoint = traffiecViolationPoint;
		this.description = description;
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTrafficViolationQuestion() {
		return trafficViolationQuestion;
	}

	public void setTrafficViolationQuestion(String trafficViolationQuestion) {
		this.trafficViolationQuestion = trafficViolationQuestion;
	}

	public String getTrafficViolationCode() {
		return trafficViolationCode;
	}

	public void setTrafficViolationCode(String trafficViolationCode) {
		this.trafficViolationCode = trafficViolationCode;
	}

	public String getTraffiecViolationPoint() {
		return traffiecViolationPoint;
	}

	public void setTraffiecViolationPoint(String traffiecViolationPoint) {
		this.traffiecViolationPoint = traffiecViolationPoint;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "TrafficViolation [id=" + id + ", trafficViolationQuestion=" + trafficViolationQuestion
				+ ", trafficViolationCode=" + trafficViolationCode + ", traffiecViolationPoint="
				+ traffiecViolationPoint + ", description=" + description + "]";
	}

	
	
}
