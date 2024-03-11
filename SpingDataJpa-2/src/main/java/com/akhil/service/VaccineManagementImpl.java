package com.akhil.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akhil.Dao.IVaccineInfo;
import com.akhil.VaccineBo.VaccineDetails;
@Service
public class VaccineManagementImpl implements IVaccineManagement {
	@Autowired
	private IVaccineInfo repo;

	@Override
	public String registerVaccineDetails(VaccineDetails vaccine) {
		repo.save(vaccine);
		return "Registration Successfull";
	}

	@Override
	public Iterable<VaccineDetails> registeringMultipleVaccineDetails(List<VaccineDetails> vaccineList) {
		return repo.saveAll(vaccineList);
		 
	}

	@Override
	public Iterable<VaccineDetails> getAllVaccineDetails() {
		return repo.findAll(); 
	}

	@Override
	public Long countOfVaccines() {
		
		return repo.count();
	}

	@Override
	public Optional<VaccineDetails> getVaccineDetailsById(Long id) {
		return repo.findById(id);
	}

	@Override
	public String deleteVaccineById(Long id) {
		if(repo.findById(id).isPresent()){
			repo.deleteById(id);
			return id+ " :vaccine was deleted";
		}
		return "Vaccine delete was unsuccessful";
	}

	@Override
	public String deleteVaccinesById(List<Long> vlist) {
		int count=vlist.size();
		Iterable<VaccineDetails> list = repo.findAllById(vlist);
		if(count==((List) list).size()) {
			repo.deleteAllById(vlist);
			return "List of deletion was successful";
		}
		return "Delete was Unsuccessful";
	}

	@Override
	public String deleteVaccineByObject(VaccineDetails vaccine) {
		repo.delete(vaccine);
		return "delete by object was successful";
	}
	


}
