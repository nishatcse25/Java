/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package record.of.employee;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class UapCse {

  
    String name;
    ArrayList<Employee> employees;

   
    UapCse(String rcvName)
    {
        name = rcvName;
        employees = new ArrayList<Employee>();
    }

 
    private void addNewEmployee(Employee e)
    {
        employees.add(e);
    }

    public void addNewEmployee(String n, String i, String d, double s)
    {
        Employee  e = new SalariedEmployee(n, i, d, s);
        addNewEmployee(e);
    }
    public void addNewEmployee(String n, String i, String d, double hr,int hw)
    {
        Employee  e = new HourlyEmployee(n, i, d, hr, hw);
        addNewEmployee(e);
    }
    public void addNewEmployee(String n, String i, String d, double p,double s)
    {
        Employee  e = new CommissionEmployee(n, i, d, p, s);
        addNewEmployee(e);
    }
    
    public Employee findEmployee(String id) {
        for (int i = 0; i < employees.size(); i++) {
            Employee takeId = employees.get(i);
            if (id.equals(takeId.getId())) {
                return takeId;
            }

        }
        return null;

    }

    public void increaseSalary(String Id, double Amt) {
        Employee find = findEmployee(Id);
        if (find != null) {
            find.increaseSalary(Amt);
        } else {
            System.out.println("NOT Found");
        }

    }

    double getSalary(String id) {
        Employee find = findEmployee(id);
        if (find != null) {
            return find.getSalary();
        } else {
            System.out.println("NOT Found");

        }
        return 0;

    }
    void display(String ID) {
        Employee find = findEmployee(ID);
        if (find != null) {
            find.display();
        } else {
            System.out.println("Not Matching");
        }

    }
    void display() {
        for (int i = 0; i < employees.size(); i++) {
            Employee find = employees.get(i);
            find.display();
        }
    }   

}
