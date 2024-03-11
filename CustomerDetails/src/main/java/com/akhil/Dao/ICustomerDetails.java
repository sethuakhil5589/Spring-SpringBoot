package com.akhil.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.akhil.VaccineBo.CustomerDetails;
@Repository
public interface ICustomerDetails extends CrudRepository<CustomerDetails, Integer> {

}
