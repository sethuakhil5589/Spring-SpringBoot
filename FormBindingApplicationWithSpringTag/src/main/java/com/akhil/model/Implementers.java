package com.akhil.model;

public class Implementers {

	private Integer id;
	private String iName;
	private String iCity="Hyderabad";
	private double iSalary;
	public Implementers() {
		System.out.println("Implementers no-args Constructor");
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getiName() {
		return iName;
	}
	public void setiName(String iName) {
		this.iName = iName;
	}
	public String getiCity() {
		return iCity;
	}
	public void setiCity(String iCity) {
		this.iCity = iCity;
	}
	public double getiSalary() {
		return iSalary;
	}
	public void setiSalary(double iSalary) {
		this.iSalary = iSalary;
	}
	@Override
	public String toString() {
		return "Implementers [id=" + id + ", iName=" + iName + ", iCity=" + iCity + ", iSalary=" + iSalary + "]";
	}
	
}
