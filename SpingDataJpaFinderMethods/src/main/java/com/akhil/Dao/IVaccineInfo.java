package com.akhil.Dao;


import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akhil.VaccineBo.VaccineDetails;
@Repository
public interface IVaccineInfo extends JpaRepository<VaccineDetails , Long>{
	public List<VaccineDetails> findByvaccineName(String vaccineName);
	public List<VaccineDetails> findBypriceLessThan(Integer price);
//	public List<VaccineDetails> findByvaccineNameInAndPriceBetween(Collection<String> vaccines,Integer startPrice,
//			Integer endPrice);

}
