package com.akhil.service;

import java.sql.Date;
import java.util.List;


import org.springframework.data.repository.query.Param;

import com.akhil.VaccineBo.VaccineDetails;

public interface IVaccineManagement {
	
	List<VaccineDetails> fetchByVaccineCompany(String vaccineName);
	
	
	List<VaccineDetails> fetchByVaccineNames(@Param("vaccineName1") String vName1,@Param("vaccineName2")String vName2);
	
	
	List<Object[]> fetchByVaccineIds(int vId1, int vId2);
	
	int updateVaccineRecordById(Integer id, String vaccineName);
	
	int deleteVaccineRecordById(Integer id);
	
	public int insertVaccinedata(Long id, String name, double price);
	
//	public java.util.Date getDateAndTimeFromDb();
	
}
