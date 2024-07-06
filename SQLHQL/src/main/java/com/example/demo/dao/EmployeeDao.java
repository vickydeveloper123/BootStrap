package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.employeedetails.Employee;

import jakarta.persistence.NamedQuery;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

	@Query(value = "From Employee")
	public List<Employee> getAllUsersHQL();

	@Query(value = "from Employee where employeeNativeLocation=:location")
	public List<Employee> getAllEmployersBasedOnLocation(String location);

	
	@Query(value = "select * from Employee_Information where employee_geder=:gender", nativeQuery = true)
	public List<Employee> getAllEmployersDataBasedOnGender(String gender);
	

	@Query(name="FetchingEmployersRoles"  )
	public List<Employee> findByEmployersRole(String employersRole);
	
	@Query(name="Fethcing Details through gender")
	public List<Employee> findingByEmployeeGenderCateogory(String gender);
	
	
	@Query(name="Akhila")
	public List<Employee> findingByAllEmployersByNames(String akhilaName);
	
	
	
	@Query(name="Location")
	public List<Employee> findingByAllEmployersThroughLocation(String location);
	
	
	@Query(name="employeeId")
	public List<Employee> findingByIds(Integer id);

}
