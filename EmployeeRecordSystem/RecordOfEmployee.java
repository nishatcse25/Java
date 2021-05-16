/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package record.of.employee;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class RecordOfEmployee {
   public static void main(String[] args) {
		UapCse myUap= new UapCse(null);
		
		Scanner input=new Scanner(System.in);
		
		
     
        System.out.println("1. Add New Employee    ");
        System.out.println("2. get Salary info of a specific Employee");
        System.out.println("3. to increase the salary of an Employee.");
        System.out.println("4. to display the details of a specific Employee. ");
        System.out.println("5. display the list of the Employees.");
        System.out.println("0.Log out the System.  ");
		
		
		while(true)
		{
			int op;
			op=input.nextInt();
			if(op==1)
			{
                                System.out.println("1. Salaried\n2.Hourly\n3.Commission");
                                int op2;
                                op2 = input.nextInt();
                                if(op2==1){
                                System.out.println("Enter Your Name");
				String userName;
				userName=input.next();
				System.out.println("Enter Your id ");
				String id;
				id=input.next();
				System.out.println("Enter Your Designation ");
				String des;
				des=input.next();
				System.out.println("Enter Your Salary");
				double sal;
				sal=input.nextDouble();
				myUap.addNewEmployee(userName, id, des, sal);
                                }
                                else if(op2==2){
                                    System.out.println("Enter Your Name");
				String userName;
				userName=input.next();
				System.out.println("Enter Your id ");
				String id;
				id=input.next();
				System.out.println("Enter Your Designation ");
				String des;
				des=input.next();
                                System.out.println("Enter your Hourly Rate");
                                double hr;
                                hr =input.nextDouble();
                                System.out.println("Enter your Worked Hour");
                                int wh;
                                wh = input.nextInt();
                                myUap.addNewEmployee(userName, id, des, hr,wh);
                                }
                                else if(op==3){
                                    System.out.println("Enter Your Name");
				String userName;
				userName=input.next();
				System.out.println("Enter Your id ");
				String id;
				id=input.next();
				System.out.println("Enter Your Designation ");
				String des;
				des=input.next();
                                System.out.println("Enter your Commission");
                                double c;
                                c =input.nextDouble();
                                System.out.println("Enter your Sale");
                                double s;
                                s = input.nextDouble();
                                myUap.addNewEmployee(userName, id, des, c,s);
                                }
                                
				
			}
			
			
			else if(op==2)
			{
				System.out.println("Enter Your id");
				String id;
				id=input.next();
                                double s;
				s=myUap.getSalary(id);
                                System.out.println(s);
			}
			
			
			else if(op==3)
			{
				System.out.println("Enter id ");
				String id;
				id=input.next();
				System.out.println("Enter salary");
				double userSalary;
				userSalary=input.nextDouble();
				myUap.increaseSalary(id, userSalary);
			}
			
			else if(op==4)
			{
				System.out.println("Enter id ");
				String id;
				id=input.next();
				myUap.display(id);
			}
			else if(op==5)
			{
				System.out.println("all information");
				myUap.display();
			}
			else if (op==0)
			{
				break;
			}
			
			
		}
		

	}
    
}
