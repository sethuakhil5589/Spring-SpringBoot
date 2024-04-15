package com.akhil.Dao;


import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.akhil.VaccineBo.VaccineDetails;

import jakarta.transaction.Transactional;
@Repository
public interface IVaccineInfo extends JpaRepository<VaccineDetails , Long>{
	
	@Query("FROM VaccineDetails WHERE vaccineName= :vaccineName")
	List<VaccineDetails> searchByVaccineCompany(String vaccineName);
	
	@Query("FROM VaccineDetails WHERE vaccineName IN (:vaccineName1, :vaccineName2)")
	List<VaccineDetails> searchByVaccineNames(String vaccineName1,String vaccineName2);
	
	@Query("SELECT vaccineId, vaccineName FROM VaccineDetails WHERE vaccineId BETWEEN :vId1 AND :vId2")
	List<Object[]> searchByVaccineIds(int vId1, int vId2);
	
	
	@Transactional
	@Modifying
	@Query("UPDATE VaccineDetails SET vaccineName= :vaccineName WHERE vaccineId=:vaccineId")
	public int updateVaccineRecordById(Integer vaccineId, String vaccineName);
	
	@Transactional
	@Modifying
	@Query("DELETE FROM VaccineDetails WHERE vaccineId=:id")
	public int deleteVaccineRecordById(Integer id);

	@Transactional
	@Modifying
	@Query(value="INSERT INTO VaccineDetails('vaccine_id','vaccine_name','price') VALUES (?,?,?)", nativeQuery=true)
	public int insertVaccinedata(Long id, String name, double price);
	
	@Query(value= "SELECT NOE() FROM DUAL",nativeQuery=true)
	public Date getDateAndTimeFromDb();

}
