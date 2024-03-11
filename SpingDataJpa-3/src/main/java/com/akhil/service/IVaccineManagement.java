package com.akhil.service;


import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.akhil.VaccineBo.VaccineDetails;

public interface IVaccineManagement {
	public Iterable<VaccineDetails> fetchingDetails(boolean status, String...properties); 
	public List<VaccineDetails> fetchingDetailsByPage(int pgNo, int pgSize, boolean status, String...properties);
	public void fetchingDetailsByPagination(int pgSize);
	
}
