package com.akhil.Dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akhil.VaccineBo.VaccineDetails;
@Repository
public interface IVaccineInfo extends JpaRepository<VaccineDetails , Long>{
	

}
