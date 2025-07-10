package com.demotest;
import java.util.*;
public class Employeemangment {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Employee[] employees = new Employee[10];
		
		int count=0;
		
		while(true) {
			System.out.println("----Employee mangement system----");
			System.out.println("1.Add Employee:");
			System.out.println("2.Display All Employees:");
			System.out.println("3.Search Employee by ID:");
			System.out.println("4.Display Employees joined in given Year:");
			System.out.println("5.Find Employee with Maximum Salary:");
			System.out.println("6.Find Employee with Minimum Salary:");
			System.out.println("7.Exit the Application.");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			
				case 1:
					if(count<employees.length)
					{
						sc.nextLine();
						System.out.println("enter the name of employee:");
						String name = sc.nextLine();
						System.out.println("enter the DOB:");
						Mydate dob = new Mydate(sc.nextInt(),sc.nextInt(),sc.nextInt());
						System.out.println("enter the emloyee id:");
						int id = sc.nextInt();
						sc.nextLine();
						System.out.println("enter the employee department:");
						String department = sc.nextLine();
						System.out.println("enter the emloyee salary:");
						double salary = sc.nextDouble();
						System.out.println("enter the date of joining:");
						Mydate doj = new Mydate(sc.nextInt(),sc.nextInt(),sc.nextInt());
						
						
						employees[count++] = new Employee(name,dob,id,department,salary,doj);
						System.out.println("employee added.");
						
					}
					else
					{
						  System.out.println("Employee array full!");
					}
				break;
				
				case 2:
					 for (int i = 0; i < count; i++) {
	                        System.out.println(employees[i]);
	                    }
	            break;
	             
				case 3:
					System.out.println("enter the id to search:");
					int searchid = sc.nextInt();
					boolean found = false;
					
					for(int i=0;i<count;i++) {
						if(employees[i].getid()==searchid)
						{
							 System.out.println(employees[i]);
	                            found = true;
	                            break;
						}
					}
					if (!found)
	                       System.out.println("Employee not found.");
	                break;
				
				case 4:
					System.out.println("enter the employees joined year:");
					int year = sc.nextInt();
					boolean found1= false;
					
					for(int i=0;i<count;i++) {
						if(employees[i].getDateofjoining().getyear()==year)
						{
							 System.out.println(employees[i]);
	                            found = true;
	                            break;
						}
					}
					if (!found1)
						  System.out.println("No employee found for year " + year);
	                break;
	                
				case 5:
					if (count == 0) {
                        System.out.println("No employees.");
                        break;
                    }
                    Employee maxEmp = employees[0];
                    for (int i = 1; i < count; i++) {
                        if (employees[i].getSalary() > maxEmp.getSalary()) {
                            maxEmp = employees[i];
                        }
                    }
                    System.out.println("Employee with max salary:");
                    System.out.println(maxEmp);
                    break;
                    
				case 6:
					if (count == 0) {
                        System.out.println("No employees.");
                        break;
                    }
                    Employee minEmp = employees[0];
                    for (int i = 1; i < count; i++) {
                        if (employees[i].getSalary() < minEmp.getSalary()) {
                            minEmp = employees[i];
                        }
                    }
                    System.out.println("Employee with max salary:");
                    System.out.println(minEmp);
                    break;
                    
				case 7:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
			}
			
			
		}
		
		

	}

}
