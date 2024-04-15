package com.akhil.service;







import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akhil.Dao.IVaccineInfo;
import com.akhil.VaccineBo.VaccineDetails;
@Service
public class VaccineManagementImpl implements IVaccineManagement {
	@Autowired
	private IVaccineInfo repo;

	@Override
	public List<VaccineDetails> fetchByVaccineCompany(String vaccineName) {
		
		return repo.searchByVaccineCompany(vaccineName);
	}

	@Override
	public List<VaccineDetails> fetchByVaccineNames(String vName1, String vName2) {
		
		return repo.searchByVaccineNames(vName1,vName2);
	}

	@Override
	public List<Object[]> fetchByVaccineIds(int vId1, int vId2) {
		return repo.searchByVaccineIds(vId1, vId2);
	}

	@Override
	public int updateVaccineRecordById(Integer id, String vaccineName) {
		
		return repo.updateVaccineRecordById(id, vaccineName);
	}

	@Override
	public int deleteVaccineRecordById(Integer id) {
		
		return repo.deleteVaccineRecordById(id);
	}

	@Override
	public int insertVaccinedata(Long id, String name, double price) {
		
		return repo.insertVaccinedata(id, name, price);
	}

//	@Override
//	public Date getDateAndTimeFromDb() {
//		
//		return repo.getDateAndTimeFromDb();
//	}

	

}
