package com.service.RestFulWebService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	
	
	ArrayList<Employee> listOFEmployees=new ArrayList<Employee>();
	
	//http://localhost:8080/1.0/employee/4
	@GetMapping("/1.0/employee/{id}")
	public Employee getEmployee(@PathVariable int id)
	{
		
		return listOFEmployees.stream().filter(emp-> emp.id==id).findFirst().get();
	}
	
	
	//http://localhost:8080/1.0/employee
	@PostMapping("/1.0/employee")
	public String addEmployee(@RequestBody Employee e)
	{
		listOFEmployees.add(e);
		return "Employee saved to in memory DB";
	}
	
	//http://localhost:8080/1.0/employee
	@PutMapping("/1.0/employee")
	public String updateEmployee(@RequestBody Employee e)
	{
		
		Employee temp= listOFEmployees.stream().filter(emp-> emp.id==e.id).findFirst().get();
		
		int index = listOFEmployees.indexOf(temp);
		
		listOFEmployees.set(index, e);
		
		return "Employee updated to in memory DB";
	}
	//http://localhost:8080/1.0/employee/4
	@DeleteMapping("/1.0/employee/{id}")
	public String deleteEmployee(@PathVariable int  id)
	{
		
		Employee temp= listOFEmployees.stream().filter(emp-> emp.id==id).findFirst().get();
		
		int index = listOFEmployees.indexOf(temp);
		
		listOFEmployees.remove(index);
		
		
		
		return "Employee removed from in memory DB";
	}
	
	//http://localhost:8080/1.0/getEmployeeList
	@GetMapping("/1.0/getEmployeeList")
	public  List<Employee> getEmployeeList()
	{
		
		return  listOFEmployees;
	}
	

	

}
