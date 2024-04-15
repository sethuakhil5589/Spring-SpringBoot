package com.akhil.service;

import java.util.Collection;
import java.util.List;

import com.akhil.VaccineBo.VaccineDetails;

public interface IVaccineManagement {
	public List<VaccineDetails> searchByvaccineName(String vaccineName);
	public List<VaccineDetails> searchBypriceLessThan(Integer price);
//	public List<VaccineDetails> searchByvaccineNameInAndPriceBetween(Collection<String> vaccines,Integer startPrice,
//			Integer endPrice);
}
