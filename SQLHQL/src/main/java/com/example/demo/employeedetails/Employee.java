package com.example.demo.employeedetails;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode

@NamedQuery(name = "FetchingEmployersRoles", query = " from Employee  where employeRole=:employersRole")

@NamedNativeQuery(name = "Fethcing Details through gender", query = "select * from  Employee where employeeGeder=:gender")

@NamedQuery(name = "Akhila", query = " from Employee where employeName=:akhilaName")

@NamedNativeQuery(name = "Location", query = "select * from  Employee where employeeNativeLocation=:location")

@NamedQuery(name = "employeeId", query = " from Employee where employeeId=:id")

@Entity

@Table(name = "Employee_Information")
public class Employee {

	@Id
	private Integer employeeId;

	private String employeName;

	private String employeRole;

	private String employeSalary;

	private String employeEmail;

	private String employeeGeder;

	private String employeeNativeLocation;

}
