package com.akhil;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.akhil.Dao.IVaccineInfo;
import com.akhil.VaccineBo.VaccineDetails;
import com.akhil.service.IVaccineManagement;

@SpringBootApplication
public class SpingDataJpa2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpingDataJpa2Application.class, args);
		IVaccineManagement service = context.getBean(IVaccineManagement.class);
		
//		VaccineDetails vaccine=new VaccineDetails(1,"Covaxine",4534.5);
//		service.registerVaccineDetails(vaccine);
		
		List<VaccineDetails>vaccineList=new ArrayList<VaccineDetails>();
		VaccineDetails vaccine2=new VaccineDetails(2,"Covishiled",45344.5);
		VaccineDetails vaccine3=new VaccineDetails(3,"Anthrax",45334.5);
		VaccineDetails vaccine4=new VaccineDetails(4,"Cholera",45234.5);
		vaccineList.add(vaccine2);
		vaccineList.add(vaccine3);
		vaccineList.add(vaccine4);
//		
		service.registeringMultipleVaccineDetails(vaccineList);		
		
		List<VaccineDetails> vaccineDetailsList=(List<VaccineDetails>) service.getAllVaccineDetails();
		
		
		service.getAllVaccineDetails().forEach((vaccines)->System.out.println(vaccines));
		System.out.println(service.countOfVaccines());
		Long id=6L;
//		System.out.println(service.getVaccineDetailsById(id).orElseThrow(()->new IllegalArgumentException("Record not found")));
		System.out.println(service.getVaccineDetailsById(id).orElse(new VaccineDetails()));
		
//		System.out.println(service.deleteVaccineById(6L));
		
		List<Long> ids=new ArrayList<Long>();
		ids.add(1l);
		ids.add(2l);
//		System.out.println(service.deleteVaccinesById(ids));
		
		context.close();
	}

}
