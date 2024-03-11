package com.akhil.service;

import java.util.List;

import com.akhil.VaccineBo.VaccineDetails;

public interface IVaccineManagement {
	
	public List<VaccineDetails> searchVaccineDetails(VaccineDetails vaccine,boolean status,String...args);
	public List<VaccineDetails> searchingVaccineDetails(VaccineDetails vaccine);
	public VaccineDetails searchbyId(Long id);
	
}
