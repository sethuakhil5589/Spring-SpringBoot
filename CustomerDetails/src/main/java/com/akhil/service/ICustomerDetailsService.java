package com.akhil.service;

import java.util.List;

import com.akhil.VaccineBo.CustomerDetails;

public interface ICustomerDetailsService {
	String insertingCustomerDetails(CustomerDetails customer);
	List<CustomerDetails> fetchCustomerDetails();
}
