package com.chainsys.demo1;

	public class Manager extends Member {
	    String department;
	 
	    public Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
			super(name, age, phoneNumber, address, salary);
			this.department = department;
		}

		public void displayDetails() {
	        System.out.println("Manager Details:");
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Phone Number: " + phoneNumber);
	        System.out.println("Address: " + address);
	        System.out.println("Salary: " + salary);
	        System.out.println("Department: " + department);
	    }
	
	    public static void main(String[] args) {
	      
	        Employee employee = new Employee("Angel", 23, "9942613245", "SMS NAGAR", 20000, "FULLSTACK");
	        Manager manager = new Manager("Kayal", 20, "9987645632", "Anna Nagar", 12000, "MANAGEMENT");	     	      
	        employee.displayDetails();
	        employee.printSalary();	        
	        System.out.println();	       
	        manager.displayDetails();
	        manager.printSalary();	        
	    }
	}




