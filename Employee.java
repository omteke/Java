package com.demotest;

public class Employee extends Person{

				private int id;
				private String department;
				private double salary;
				private Mydate dateofjoining;
				
				public Employee(String name ,Mydate dateofbirth,int id,String department,double salary,Mydate dateofjoining) {
					super(name,dateofbirth);
					this.id = id;
					this.setDepartment(department);
					this.setSalary(salary);
					this.setDateofjoining(dateofjoining);
				}
				public int getid() {
					return id;
				}
				public void setid(int id) {
					this.id = id;
				}
				public String getDepartment() {
					return department;
				}
				public void setDepartment(String department) {
					this.department = department;
				}
				public double getSalary() {
					return salary;
				}
				public void setSalary(double salary) {
					this.salary = salary;
				}
				public Mydate getDateofjoining() {
					return dateofjoining;
				}
				public void setDateofjoining(Mydate dateofjoining) {
					this.dateofjoining = dateofjoining;
				}
				
				@Override
			    public String toString() {
			        return "ID: " + id +
			               ", " + super.toString() +
			               ", Dept: " + department +
			               ", Salary: " + salary +
			               ", DOJ: " + dateofjoining;
			    }
				
				
	
}
