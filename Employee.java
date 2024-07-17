package com.chainsys.demo1;

	class Employee extends Member {
	    String specialization;
	    
	 
	    public Employee(String name, int age, String phoneNumber, String address, double salary,
				String specialization) {
			super(name, age, phoneNumber, address, salary);
			this.specialization = specialization;
		}
 
	    public void displayDetails() {
	        System.out.println("Employee Details:");
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Phone Number: " + phoneNumber);
	        System.out.println("Address: " + address);
	        System.out.println("Salary: " + salary);
	        System.out.println("Specialization:"+ specialization);
	    }
	    
	}
