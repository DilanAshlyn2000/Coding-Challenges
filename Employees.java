package com.chainsys.demo1;

public class Employees {
    private int employeeId;
    private String name;
    private String branch;
    private double rating;
    private boolean companyTransport;

  
    public Employees(int employeeId, String name, String branch, double rating, boolean companyTransport) {
        this.employeeId = employeeId;
        this.name = name;
        this.branch = branch;
        this.rating = rating;
        this.companyTransport = companyTransport;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    public double getRating() {
        return rating;
    }

    public boolean isCompanyTransport() {
        return companyTransport;    

}
}
