package com.akhil.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
	public Iterable<VaccineDetails> fetchingDetails(boolean status, String... properties) {
		Sort sort = Sort.by(status? Direction.ASC:Direction.DESC , properties);
		return repo.findAll(sort);
		 
	}


	@Override
	public List<VaccineDetails> fetchingDetailsByPage(int pgNo, int pgSize, boolean status, String... properties) {
		 PageRequest pageable = PageRequest.of(pgNo, pgSize, status? Direction.ASC:Direction.DESC, properties);
		Page<VaccineDetails> page = repo.findAll(pageable);
		return page.getContent();
	}


	@Override
	public void fetchingDetailsByPagination(int pgSize) {
		
		Long vaccineCount=4L;
		Long pgCount=vaccineCount/pgSize;
		pgCount=vaccineCount%pgSize==0? pgCount:++pgCount;
		for(int i=0;i<pgCount;i++) {
			PageRequest pageable = PageRequest.of(i, pgSize);
			Page<VaccineDetails> page = repo.findAll(pageable);
			page.getContent().forEach((c)->System.out.println((c.getVaccineName()+c.getPrice())));
	
		}
		
	}


	


}
