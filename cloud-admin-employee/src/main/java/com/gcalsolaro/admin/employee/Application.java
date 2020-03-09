package com.gcalsolaro.admin.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.gcalsolaro.admin.employee.model.Employee;
import com.gcalsolaro.admin.employee.repository.EmployeeRepository;

@SpringBootApplication
@EnableDiscoveryClient
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	EmployeeRepository repository() {
		EmployeeRepository repository = new EmployeeRepository();
		repository.add(new Employee(1L, 1L, "Paolo Rossi", 26, "Developer"));
		repository.add(new Employee(1L, 2L, "Giuseppe Verdi", 39, "Analyst"));
		repository.add(new Employee(2L, 3L, "Marco Neri", 30, "Manager"));
		repository.add(new Employee(2L, 4L, "Antonio Gialli", 25, "Developer"));
		return repository;
	}

}
