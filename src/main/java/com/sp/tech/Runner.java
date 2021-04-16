package com.sp.tech;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.sp.tech.service.EmployeeService;

@ComponentScan
public class Runner {
    
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Runner.class);
		context.registerShutdownHook();
		EmployeeService service = context.getBean(EmployeeService.class);
		service.saveEmployee();
		
		
       System.out.println("All Employee "+service.getEmployee());
	}

}
