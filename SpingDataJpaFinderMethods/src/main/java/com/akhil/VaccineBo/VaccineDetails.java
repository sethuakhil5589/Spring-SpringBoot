package com.akhil.VaccineBo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class VaccineDetails {
	@Id 
	private long vaccineId;
	private String vaccineName;
	@Column(name="price")
	private Double price;
	
	public VaccineDetails() {
		System.out.println("vaccine Details Object created...");
	}
	public VaccineDetails(long vaccineId, String vaccineName, Double price) {
		super();
		this.vaccineId = vaccineId;
		this.vaccineName = vaccineName;
		price = this.price;
	}
	
	public long getVaccineId() {
		return vaccineId;
	}
	public void setVaccineId(long vaccineId) {
		this.vaccineId = vaccineId;
	}
	public String getVaccineName() {
		return vaccineName;
	}
	public void setVaccineName(String vaccineName) {
		this.vaccineName = vaccineName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		price = this.price;
	}
	@Override
	public String toString() {
		return "VaccineDetails [vaccineId=" + vaccineId + ", vaccineName=" + vaccineName + ", Price=" + price + "]";
	}
	
	
	

}
