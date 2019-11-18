package com.service.RestFulWebService;


public class Employee  {
//Class variable, Member variable , properties of the class
	public 	int id;
	private 	double salary;
	private 	String name;


// Modifed the file 	
 
 
	
	//constructor
	
	public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}





	Employee(){}
	
	public Employee(int id,double salary,String name){
		
		this.id=id;
		this.salary=salary;
		this.name=name;
	}
	
	
	
	private double getBonus()
	{
		return salary*.1;
	}
	
	public void  printEmployeeDetails()
	{
		String space="  ";
		System.out.println(id+space+ name+space+salary);
		
	}
	
	

}
