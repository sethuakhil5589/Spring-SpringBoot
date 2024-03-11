package com.akhil.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.akhil.VaccineBo.VaccineDetails;
@Repository
public interface IVaccineInfo extends CrudRepository<VaccineDetails , Long>{
	

}
