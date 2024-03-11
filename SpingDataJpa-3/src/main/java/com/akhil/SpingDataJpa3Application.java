package com.akhil;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;

import com.akhil.VaccineBo.VaccineDetails;
import com.akhil.service.IVaccineManagement;

@SpringBootApplication
public class SpingDataJpa3Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpingDataJpa3Application.class, args);
		IVaccineManagement service = context.getBean(IVaccineManagement.class);
		
//		Iterable<VaccineDetails> vaccineList = service.fetchingDetails(false, "vaccineName","vaccineId");
//		vaccineList.forEach((vaccine)->System.out.println(vaccine.getVaccineName()+"-> "+vaccine.getPrice()));
//	
		List<VaccineDetails> vaccineList = service.fetchingDetailsByPage(1, 2, false, "vaccineName","vaccineId");
//		vaccineList.forEach((c)->System.out.println(c.getVaccineName()+"->"+c.getPrice()));
		service.fetchingDetailsByPagination(2);
		
	context.close();
	}

}
