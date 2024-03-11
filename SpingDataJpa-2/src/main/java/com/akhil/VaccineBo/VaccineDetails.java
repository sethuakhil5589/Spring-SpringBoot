package com.akhil.VaccineBo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class VaccineDetails {
	@Id 
	private long vaccineId;
	private String vaccineName;
	private Double Price;
	
	public VaccineDetails() {
		System.out.println("vaccine Details Object created...");
	}
	public VaccineDetails(long vaccineId, String vaccineName, Double price) {
		super();
		this.vaccineId = vaccineId;
		this.vaccineName = vaccineName;
		Price = price;
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
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "VaccineDetails [vaccineId=" + vaccineId + ", vaccineName=" + vaccineName + ", Price=" + Price + "]";
	}
	
	
	

}
