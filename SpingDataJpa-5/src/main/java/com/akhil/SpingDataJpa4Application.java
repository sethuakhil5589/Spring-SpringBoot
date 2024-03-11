package com.akhil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.akhil.VaccineBo.VaccineDetails;
import com.akhil.service.VaccineManagementImpl;

@SpringBootApplication
public class SpingDataJpa4Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpingDataJpa4Application.class, args);
		VaccineManagementImpl service = context.getBean(VaccineManagementImpl.class);
		VaccineDetails vaccine=new VaccineDetails(1,"Covaxine",4534.5);
		VaccineDetails vaccine1=new VaccineDetails();
		service.searchVaccineDetails(vaccine, false, "vaccineName","vaccineId").forEach((c)->System.out.println(c));;
		
		
		service.searchingVaccineDetails(vaccine).forEach((c)->System.out.println(c));;
		
//		System.out.println(service.searchbyId(6L));
		
	
		
		context.close();
	}

}
