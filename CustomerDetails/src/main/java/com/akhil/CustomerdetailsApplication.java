package com.akhil;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.akhil.VaccineBo.CustomerDetails;
import com.akhil.service.CustomerDetailsImpl;

@SpringBootApplication
public class CustomerdetailsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CustomerdetailsApplication.class, args);
		CustomerDetailsImpl service = context.getBean(CustomerDetailsImpl.class);
		CustomerDetails customer=new CustomerDetails(1,"sethu","Bhadrachalam",LocalDateTime.of(2000, 10, 10, 6, 45),
				LocalDate.of(2024, 3, 9),LocalTime.of(6, 41));
		
		System.out.println(service.insertingCustomerDetails(customer));
		
		service.fetchCustomerDetails().forEach(c->System.out.println(c));
		
		context.close();
	}

}
