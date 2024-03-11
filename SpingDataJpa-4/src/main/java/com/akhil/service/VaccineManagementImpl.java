package com.akhil.service;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.akhil.Dao.IVaccineInfo;
import com.akhil.VaccineBo.VaccineDetails;
@Service
public class VaccineManagementImpl implements IVaccineManagement {
	@Autowired
	private IVaccineInfo repo;

	@Override
	public List<VaccineDetails> searchVaccineDetails(VaccineDetails vaccine, boolean status, String... args) {
		Example<VaccineDetails> example = Example.of(vaccine);
		Sort sort = Sort.by(status? Direction.ASC:Direction.DESC,args);
		return repo.findAll(example,sort);
		
	}

	@Override
	public List<VaccineDetails> searchingVaccineDetails(VaccineDetails vaccine) {
		Example<VaccineDetails> example = Example.of(vaccine);
		
		return repo.findAll(example);
	}

	@Override
	public VaccineDetails searchbyId(Long id) {
		return repo.getReferenceById(id);
		 
	}



	
	


	


}
