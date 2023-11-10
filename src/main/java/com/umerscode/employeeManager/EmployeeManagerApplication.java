package com.umerscode.employeeManager;

import com.umerscode.employeeManager.Repository.EmployeeRepo;
import com.umerscode.employeeManager.model.Employee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.UUID;

@SpringBootApplication
public class EmployeeManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagerApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(EmployeeRepo employeeRepo){
//		return args -> {
//			Employee john = new Employee(null,"John","john@gmail.com","UI/UX","4586155486",
//					"https://bootdey.com/img,/content/avatar/avatar2.png",
//					UUID.randomUUID().toString().substring(0,6));
//
//			Employee malisa = new Employee(null,"Malisa","malisa@gmail.com","Full-Stack","7894231560",
//					"https://bootdey.com/img,/content/avatar/avatar3.png",
//					UUID.randomUUID().toString().substring(0,6));
//
//			Employee ahmed = new Employee(null,"Ahmed","ahmed@gmail.com","Data Science","2754320946",
//					"https://bootdey.com/img,/content/avatar/avatar4.png",
//					UUID.randomUUID().toString().substring(0,6));
//			employeeRepo.saveAll(Arrays.asList(john,malisa,ahmed));
//		};
	//}
}
