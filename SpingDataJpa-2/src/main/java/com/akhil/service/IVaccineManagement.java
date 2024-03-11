package com.akhil.service;

import java.util.List;
import java.util.Optional;

import com.akhil.VaccineBo.VaccineDetails;

public interface IVaccineManagement {
	public String registerVaccineDetails(VaccineDetails vaccine);
	public Iterable<VaccineDetails> registeringMultipleVaccineDetails(List<VaccineDetails> vaccineList);
	public Iterable<VaccineDetails> getAllVaccineDetails();
	public Long countOfVaccines();
	public Optional<VaccineDetails> getVaccineDetailsById(Long id);
	public String deleteVaccineById(Long id);
	public String deleteVaccinesById(List<Long> vlist);
	public String deleteVaccineByObject(VaccineDetails vaccine);
}
