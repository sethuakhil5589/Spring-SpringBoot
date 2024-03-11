package com.akhil.Dao;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.akhil.VaccineBo.VaccineDetails;
@Repository
public interface IVaccineInfo extends PagingAndSortingRepository<VaccineDetails , Long>{
	

}
