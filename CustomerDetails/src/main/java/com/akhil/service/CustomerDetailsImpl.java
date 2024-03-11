package com.akhil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akhil.Dao.ICustomerDetails;
import com.akhil.VaccineBo.CustomerDetails;
@Service
public class CustomerDetailsImpl implements ICustomerDetailsService {
	@Autowired
	ICustomerDetails repo;
	
	@Override
	public String insertingCustomerDetails(CustomerDetails customer) {
		Integer id=repo.save(customer).getCustomerId();
		return "Data saved with Id: "+id;
	}

	@Override
	public List<CustomerDetails> fetchCustomerDetails() {
		return (List<CustomerDetails>) repo.findAll();
		
	}

}
