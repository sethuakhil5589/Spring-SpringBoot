package com.akhil;

import java.util.List;

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
		System.out.println("---------------BY ONE VACCINE NAME------------------");
		service.fetchByVaccineCompany("Anthrax").forEach(c->System.out.println(c));
		
		System.out.println("---------------BY VACCINE NAMES------------------");
		service.fetchByVaccineNames("Covishiled", "Covaxine").forEach((c)->System.out.println(c));
		
		System.out.println("---------------BY VACCINE PRICES------------------");
		List<Object[]> vaccineIds = service.fetchByVaccineIds(1, 4);
		for(Object[] obj:vaccineIds) {
			for(Object va:obj) {
				System.out.print(va+"->");
			}
			System.out.println();
		}
		
		System.out.println("----------------UPDATING RECORDS-------------------");
		System.out.println(service.updateVaccineRecordById(2,"DOLO"));
		
		System.out.println("---------------Deleting Records----------------------");
		System.out.println(service.deleteVaccineRecordById(4));
		
		System.out.println("---------------Inserting Data-------------------------");
//		service.insertVaccinedata(4L, "Covidshield", 3445.5);
		
		System.out.println("---------------Date And Time--------------------------");
//		service.getDateAndTimeFromDb();
		
		context.close();
	}

}
