package com.akhil;


import java.util.Collection;
import java.util.LinkedList;
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
		
		
//		service.searchByvaccineName("Covaxine").forEach((c)->System.out.println(c));;
//		service.searchBypriceLessThan(150000).forEach((c)->System.out.println(c));
//		List<VaccineDetails> vaccineList = new LinkedList<>();
//		
////		service.searchByvaccineNameInAndPriceBetween(vaccineList, 10, 45250);
//		
		context.close();
	}

}
