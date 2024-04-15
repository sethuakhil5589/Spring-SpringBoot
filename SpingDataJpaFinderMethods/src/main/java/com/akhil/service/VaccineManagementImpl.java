package com.akhil.service;





import java.util.Collection;
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
	public List<VaccineDetails> searchByvaccineName(String vaccineName) {
		return repo.findByvaccineName(vaccineName);
	}

	@Override
	public List<VaccineDetails> searchBypriceLessThan(Integer price) {
		return repo.findBypriceLessThan(price);
	}

	

//	@Override
//	public List<VaccineDetails> searchByvaccineNameInAndPriceBetween(Collection<String> vaccines, Integer startPrice,
//			Integer endPrice) {
//		return repo.findByvaccineNameInAndPriceBetween(vaccines, startPrice, endPrice);
//		
//	}

	
}
