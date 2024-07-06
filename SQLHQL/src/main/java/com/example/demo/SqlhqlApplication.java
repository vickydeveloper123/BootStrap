package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.employeedetails.Employee;
import com.example.demo.dao.EmployeeDao;

@SpringBootApplication
public class SqlhqlApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SqlhqlApplication.class, args);
		EmployeeDao bean = run.getBean(EmployeeDao.class);
		System.out.println("Total bean count =" + bean);
		bean.getClass().getName();
		System.out.println("  Sucessfully connected to the data base.... ");

		Employee employee1 = new Employee(111, "Dora Sri Vignesh", "Software Architect", "1234744", "dora@gmail.com",
				"Male", "Nellore");

		Employee employee2 = new Employee(222, "Srikanth Analdas", "Software Engineer", "25872744",
				"srikanth@gmail.com", "Male", "Hyderabad");

		Employee employee3 = new Employee(333, "Vijaya Durga", "Software Tester", "587744", "vijayadurga@gmail.com",
				"FeMale", "Nellore");

		Employee employee4 = new Employee(444, "Yamini Sindhura", "Data Analyst", "5874744", "yamini@gmail.com", "Male",
				"Tirupati");

		Employee employee5 = new Employee(555, "Greeshma", "HR Manager", "8794744", "greeshma@gmail.com", "FeMale",
				"Kandukur");

		Employee employee6 = new Employee(666, "Muni Shwetha", "Data Analyst", "987444", "shwetha@gmail.com", "FeMale",
				"Nellore");

		List<Employee> employers_Data = Arrays.asList(employee1, employee2, employee3, employee4, employee5, employee6);
		bean.saveAll(employers_Data);
		System.out.println("   Employers Data sucessfully stored into the data base .....");

		System.out.println(" ");
		System.out.println(
				" =========================================================================================  ");

		System.out.println("  Getting information from the  mysql data base ....    ");

		List<Employee> allUsersHQL = bean.getAllUsersHQL();
		System.out.println(allUsersHQL);
		System.out.println(" ");
		System.out.println("  By using for each .........................");
		for (Employee data1fromDatabase : allUsersHQL) {
			System.out.println(" Getting all details from the data base :" + data1fromDatabase);

			System.out.println(" ");
			System.out.println(
					" =========================================================================================  ");

			System.out.println("   Getting all the details from the Mysql using SQL QUERY ");
			System.out.println(
					"  Here we have to write query based on our condition it will go and fetch the data ......");

			List<Employee> allEmployersBasedOnLocation = bean.getAllEmployersBasedOnLocation("Nellore");
			System.out.println("  Fetching data based on employers Location :" + allEmployersBasedOnLocation);
			System.out.println("   By using for each loop   ");
			for (Employee data2UsingLocation : allEmployersBasedOnLocation) {
				System.out.println(" Fetching employers data using location =" + data2UsingLocation);

				System.out.println(" ");
				System.out.println(
						" =========================================================================================  ");
				System.out.println(
						"  Selection HQL query we are writing our own query to get details from the data base");
				System.out.println("  Here we have mention true native = true    ");

				List<Employee> allEmployersDataBasedOnGender = bean.getAllEmployersDataBasedOnGender("FeMale");
				for (Employee gender : allEmployersDataBasedOnGender) {
					System.out.println(" Fetching employee data based on gender =" + gender);
				}
				
				
				System.out.println("   ==========   Performing operations through the names query ==========  ");
				
				List<Employee> byEmployersRole = bean.findByEmployersRole("Software Architect");
				System.out.println(" Fetching the data through the help of named query ::::::::::::::");
				System.out.println("  Your details are sucessfully fetched from the data base.....");
				
				System.out.println("Employers Role :"+ byEmployersRole);
				
				System.out.println("  ======== By using for each loop ===========");
				
				for(Employee role: byEmployersRole) {
					System.out.println(" Role :"+ role);
				}
				
				
				
				System.out.println(" ");
				System.out.println(" ");
				
				System.out.println(" ============================================================");
				System.out.println(" -----------------------------------------------------------------------------------------");
				
				System.out.println("   Fetching the data throgh SQL Named Native query ......................");
				
				List<Employee> allEmployersDataBasedOnGender2 = bean.getAllEmployersDataBasedOnGender("Male");
				for(Employee gender: allEmployersDataBasedOnGender2) {
					System.out.println(" Getting details by Gender :"+ gender);
				}
				
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println(" ");
				System.out.println(" ");
				boolean contains = allEmployersDataBasedOnGender2.contains(employee6);
				System.out.println(" Employee Present  status :"+contains);
				
				
				
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println(" ");
				System.out.println(" ");
				boolean contains1 = allEmployersDataBasedOnGender2.contains(employee3);
				System.out.println(" Employee Present  status :"+contains1);
				
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println(" ");
				System.out.println(" ");
				
				 
				System.out.println("  Finding the employee akhila details in the data base......");
	
				List<Employee> findingByAllEmployersByNames = bean.findingByAllEmployersByNames("Vijaya Durga");
				
				System.out.println(findingByAllEmployersByNames);
				
				
				

				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println(" ");
				System.out.println("  Connection sucess done .... ");
				
				
				
				List<Employee> allEmployersBasedOnLocation2 = bean.getAllEmployersBasedOnLocation("Hyderabad");
				
				
				System.out.println(allEmployersBasedOnLocation2);
				
				
				
				

				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println(" ");
				System.out.println("  Connection sucess done .... ");
				
				
				
				
				 List<Employee> findingByIds = bean.findingByIds(111);
				System.out.println("Employers Id :"+findingByIds);

			}

		}

	}

}