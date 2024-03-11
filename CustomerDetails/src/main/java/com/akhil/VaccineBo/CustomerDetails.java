package com.akhil.VaccineBo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class CustomerDetails {
	@Id
	Integer customerId;
	
	String customerName;
	
	String customerCity;
	
	LocalDateTime dateOfBirth;
	
	LocalDate transactionDate;
	
	LocalTime transactionTime;
	
	

	public CustomerDetails() {
		System.out.println("No-args constructor invoked in customerBo");
	}

	public CustomerDetails(Integer customerId, String customerName, String customerCity, LocalDateTime dateOfBirth,
			LocalDate transactionDate, LocalTime transactionTime) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerCity = customerCity;
		this.dateOfBirth = dateOfBirth;
		this.transactionDate = transactionDate;
		this.transactionTime = transactionTime;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	public LocalDateTime getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDateTime dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public LocalDate getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}

	public LocalTime getTransactionTime() {
		return transactionTime;
	}

	public void setTransactionTime(LocalTime transactionTime) {
		this.transactionTime = transactionTime;
	}

	@Override
	public String toString() {
		return "CustomerBo [customerId=" + customerId + ", customerName=" + customerName + ", customerCity="
				+ customerCity + ", dateOfBirth=" + dateOfBirth + ", transactionDate=" + transactionDate
				+ ", transactionTime=" + transactionTime + "]";
	}
	
	
}
